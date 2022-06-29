import Gramatica.*;
import java.lang.Math;
import Entorno.*;
import Entorno.Simbolo.TipoSimbolo;
import java.util.Stack;
import java.util.ArrayList;

import Tipos.Subrutina;
import  Tipos.Subrutina.*;
import Entorno.Operador_Relacional.*;
public class Visitor extends  GramaticaBaseVisitor<Object>{
    public ArrayList<String> salida = new ArrayList();
    public ArrayList<String> expresiones= new ArrayList();
    Stack<Entorno> pilaEnt = new Stack<Entorno>();

    public Visitor(Entorno ent){
        this.pilaEnt.push(ent);
    }
    @Override
    public Object visitStart(GramaticaParser.StartContext ctx) {
        return visitInstrucciones(ctx.instrucciones());
    }

    @Override
    public Object visitInstrucciones(GramaticaParser.InstruccionesContext ctx) {
        for(GramaticaParser.InstruccionContext ictx: ctx.instruccion())
            visitInstruccion(ictx);
        return true;
    }
    // Insercion de instrucciones entrantes
    @Override
    public Object visitInstruccion(GramaticaParser.InstruccionContext ctx) {
        if (ctx.print() != null){
            visitPrint(ctx.print());
        } else if (ctx.declaracion() != null) {
            visitDeclaracion(ctx.declaracion());
        } else if (ctx.do_() != null) {
            visitDo(ctx.do_());
        } else if (ctx.if_() != null) {
            visitIf_(ctx.if_());
        } else if (ctx.if_doble() != null) {
            visitIf_doble(ctx.if_doble());
        } else if (ctx.if_else_doble() != null) {
            visitIf_else_doble(ctx.if_else_doble());
        } else if (ctx.else_if() != null) {
            visitElse_if(ctx.else_if());
        } else if (ctx.if_triple() != null) {
            visitIf_triple(ctx.if_triple());
        }else if (ctx.if_else_triple() != null){
            visitIf_else_triple(ctx.if_else_triple());
        } else if (ctx.if_cuadruple() != null) {
            visitIf_cuadruple(ctx.if_cuadruple());
        } else if (ctx.if_else_cuadruple() != null) {
            visitIf_else_cuadruple(ctx.if_else_cuadruple());
        } else if (ctx.asignacion_arreglos() != null) {
            visitAsignacion_arreglos(ctx.asignacion_arreglos());
        } else if (ctx.asignacion_arreglos() != null) {
            visitAsignacion_arreglos(ctx.asignacion_arreglos());
        } else if (ctx.arreglos_declaracion() != null) {
            visitArreglos_declaracion(ctx.arreglos_declaracion());
        } else if (ctx.declara_default() != null) {
            visitDeclara_default(ctx.declara_default());
        } else if (ctx.asignacion() != null) {
            visitAsignacion(ctx.asignacion());
        } else if (ctx.acceso_arreglo() != null) {
            visitAcceso_arreglo(ctx.acceso_arreglo());
        } else if (ctx.arreglos_dos_decla() != null) {
            visitArreglos_dos_decla(ctx.arreglos_dos_decla());
        } else if (ctx.asiganacion_2D() != null) {
            visitAsiganacion_2D(ctx.asiganacion_2D());
        } else if (ctx.dec_1D_arreglos() != null) {
            visitDec_1D_arreglos(ctx.dec_1D_arreglos());
        } else if (ctx.dellocate_1D() != null) {
            visitDellocate_1D(ctx.dellocate_1D());
        } else if (ctx.dec_allocate_1D() != null) {
            visitDec_allocate_1D(ctx.dec_allocate_1D());
        } else if (ctx.dec_allocate_2D() != null) {
            visitDec_allocate_2D(ctx.dec_allocate_2D());
        } else if (ctx.do_while() != null) {
            visitDo_while(ctx.do_while());
        } else if (ctx.subrutina() != null) {
            visitSubrutina(ctx.subrutina());
        } else if (ctx.call() != null) {
            visitCall(ctx.call());
        }

        return  true;
    }

    @Override
    public Object visitDo_while(GramaticaParser.Do_whileContext ctx) {
        boolean condicion = (boolean)visit(ctx.condicion);
        do{
            visit(ctx.instrucciones());
        }while(condicion == true);
        return true;
    }

    @Override
    public Object visitDeclara_default(GramaticaParser.Declara_defaultContext ctx) {
        Entorno ent = pilaEnt.peek();
        String tipo =  ctx.tipo().getText();
        Object[][]  matriz = new Object[0][0];
        ArrayList<Object>  valores = new ArrayList();
        if(!ent.TablaSimbolo.containsKey((ctx.ID().getText())))
        {
            if(tipo.equals("integer")) {
                Simbolo nuevo = new Simbolo(ctx.tipo().getText(), 0, valores,matriz);
                ent.nuevoSimbolo(ctx.ID().getText(), nuevo);
                return true;
            } else if (tipo.equals("real")) {
                Simbolo nuevo = new Simbolo(ctx.tipo().getText(),  0.00000000,valores,matriz);
                ent.nuevoSimbolo(ctx.ID().getText(), nuevo);
                return true;
            } else if (tipo.equals("complex")) {
                Simbolo nuevo = new Simbolo(ctx.tipo().getText(),   "(9.192517926E-43,0.00000000)", valores,matriz);
                ent.nuevoSimbolo(ctx.ID().getText(), nuevo);
                return true;
            } else if (tipo.equals("character")) {
                Simbolo nuevo = new Simbolo(ctx.tipo().getText(),   "",valores,matriz);
                ent.nuevoSimbolo(ctx.ID().getText(), nuevo);
                return true;   
            } else if (tipo.equals("logical")) {
                Simbolo nuevo = new Simbolo(ctx.tipo().getText(),   ".false.",valores,matriz);
                ent.nuevoSimbolo(ctx.ID().getText(), nuevo);
                return true;
            }
        }

        else salida.add("La variable ya existe en el entonrno actual");
        return false;
    }

    @Override
    public Object visitDeclaracion(GramaticaParser.DeclaracionContext ctx) {
        Entorno ent = pilaEnt.peek();
        Object[][]  matriz = new Object[0][0];
        if(!ent.TablaSimbolo.containsKey((ctx.ID().getText())))
        {
            ArrayList<Object>  valores = new ArrayList();
            Simbolo nuevo = new Simbolo(ctx.tipo().getText(), visit(ctx.exp()), valores,matriz);
            ent.nuevoSimbolo(ctx.ID().getText(), nuevo);
            return  true;
        }

        else salida.add("La variable ya existe en el entonrno actual");
        return false;
    }

    @Override
    public Object visitArreglos_declaracion(GramaticaParser.Arreglos_declaracionContext ctx) {
        Entorno ent = pilaEnt.peek();
        String tipo_arreglo = ctx.tipado_arreglos().getText().toLowerCase();
        Object[][]  matriz = new Object[0][0];
        if(!ent.TablaSimbolo.containsKey((ctx.nombre.getText())))
        {
            int dimension = (int)(visit(ctx.expre2()));
            String tipado = String.valueOf(ctx.tipado_arreglos().getText());
            ArrayList<Object> valores = new ArrayList(dimension);
            Simbolo nuevo = new Simbolo(tipado, valores, valores,matriz);
            ent.nuevoSimbolo(ctx.nombre.getText(), nuevo);
            return true;
        }
        else salida.add("El arreglo " +ctx.nombre.getText() + " ya existe en el entonrno actual");
        return false;
    }

    @Override
    public Object visitDec_1D_arreglos(GramaticaParser.Dec_1D_arreglosContext ctx) {
        Entorno ent = pilaEnt.peek();
        String tipo_arreglo = ctx.tipado_arreglos().getText().toLowerCase();
        Object[][]  matriz = new Object[0][0];
        if(!ent.TablaSimbolo.containsKey((ctx.ID().getText())))
        {
            int dimension = (int)(visit(ctx.exp()));
            String tipado = String.valueOf(ctx.tipado_arreglos().getText());
            ArrayList<Object> valores = new ArrayList(dimension);
            Simbolo nuevo = new Simbolo(tipado, valores, valores,matriz);
            ent.nuevoSimbolo(ctx.ID().getText(), nuevo);
            return true;
        }
        else salida.add("El arreglo " + ctx.ID().getText() + " ya existe en el entonrno actual");
        return false;
    }

    @Override
    public Object visitDec_allocate_1D(GramaticaParser.Dec_allocate_1DContext ctx) {
        Entorno ent = pilaEnt.peek();
        String tipo_arreglo = ctx.tipado_arreglos().getText().toLowerCase();
        Object[][]  matriz = new Object[0][0];
        if(!ent.TablaSimbolo.containsKey((ctx.ID().getText())))
        {
            String tipado = String.valueOf(ctx.tipado_arreglos().getText());
            ArrayList<Object> valores = new ArrayList();
            Simbolo nuevo = new Simbolo(tipado, valores, valores,matriz);
            ent.nuevoSimbolo(ctx.ID().getText(), nuevo);
            return true;
        }
        else salida.add("El arreglo " + ctx.ID().getText() + " ya existe en el entonrno actual");
        return false;
    }

    @Override
    public Object visitDec_allocate_2D(GramaticaParser.Dec_allocate_2DContext ctx) {
        Entorno ent = pilaEnt.peek();
        ArrayList<Object> valores = new ArrayList();
        String name = ctx.ID().getText();
        if(!ent.TablaSimbolo.containsKey((ctx.ID().getText())))
        {
            String tipado = String.valueOf(ctx.tipado_arreglos().getText());
            Object[][]  matriz = new Object[10][10];
            Simbolo nuevo = new Simbolo(tipado, valores, valores,matriz);
            ent.nuevoSimbolo(name, nuevo);
            return true;
    }
        else salida.add("El arreglo " + name + " ya existe en el entonrno actual");
        return false;
    }

    @Override
    public Object visitArreglos_dos_decla(GramaticaParser.Arreglos_dos_declaContext ctx) {
        Entorno ent = pilaEnt.peek();
        String tipo_arreglo = ctx.tipado_arreglos().getText().toLowerCase();
        ArrayList<Object> valores = new ArrayList();
        String name = ctx.ID().getText();
        if(!ent.TablaSimbolo.containsKey((ctx.ID().getText())))
        {
            int d1 = (int) visit(ctx.d1);
            int d2 = (int) visit(ctx.d2);
            String tipado = String.valueOf(ctx.tipado_arreglos().getText());
            Object[][]  matriz = new Object[d1][d2];
            Simbolo nuevo = new Simbolo(tipado, valores, valores,matriz);
            ent.nuevoSimbolo(name, nuevo);
            return true;
        }
        else salida.add("El arreglo " + name + " ya existe en el entonrno actual");
        return false;
    }

    @Override
    public Object visitAsignacion_arreglos(GramaticaParser.Asignacion_arreglosContext ctx) {
        Entorno ent = pilaEnt.peek();
        String name = String.valueOf(ctx.ID().getText());
        Simbolo _simbolo = ent.buscar(ctx.ID().getText());
        System.out.println("Entrada a arreglo: "+ctx.exp().getText());
        String[] spliteado = ctx.exp().getText().split(",");
        for (int i = 0; i < spliteado.length; i++){
            ent.Insertar_Arreglo_1D(name, spliteado[i], _simbolo);
        }
        return  true;
    }

    @Override
    public Object visitAcceso_arreglo(GramaticaParser.Acceso_arregloContext ctx) {
        Entorno ent = pilaEnt.peek();
        String name = String.valueOf(ctx.ID().getText());
        Simbolo _simbolo = ent.buscar(name);
        int Posicion = (int)visit(ctx.posicion);
        ent.Insertar_Por_Posicion_1D(name,ctx.valor_array.getText(),_simbolo, Posicion);
        return true;
    }

    @Override
    public Object visitAceso_areglo_cor(GramaticaParser.Aceso_areglo_corContext ctx) {
        Entorno ent = pilaEnt.peek();
        String name = String.valueOf(ctx.ID().getText());
        Simbolo _simbolo = ent.buscar(name);
        int Posicion = (int)visit(ctx.posicion);
        return ent.Acceder_Por_Posicion_1D(name, _simbolo, Posicion);
    }

    @Override
    public Object visitAceso_areglo_2D(GramaticaParser.Aceso_areglo_2DContext ctx) {
        Entorno ent = pilaEnt.peek();
        String name = String.valueOf(ctx.ID().getText());
        Simbolo _simbolo = ent.buscar(name);
        int Posicion_1 = (int)visit(ctx.posicion1);
        int Posicion_2 = (int)visit(ctx.posicion2);
        return ent.Acceder_Por_Posicion_2D(name, _simbolo, Posicion_1, Posicion_2);
    }

    @Override
    public Object visitAsiganacion_2D(GramaticaParser.Asiganacion_2DContext ctx) {
        Entorno ent = pilaEnt.peek();
        String name = String.valueOf(ctx.ID().getText());
        Simbolo _simbolo = ent.buscar(name);
        int Posicion_1 = (int)visit(ctx.posicion1);
        int Posicion_2 = (int)visit(ctx.posicion2);
        Object ob = visit(ctx.valor);
        int valor = Integer.parseInt(ob.toString());
        return ent.Insertar_Por_Posicion_2D(name,valor,_simbolo,Posicion_1,Posicion_2);
    }

    @Override
    public Object visitDellocate_1D(GramaticaParser.Dellocate_1DContext ctx) {
        Entorno ent = pilaEnt.peek();
        String name = String.valueOf(ctx.ID().getText());
        Simbolo _simbolo = ent.buscar(name);
        ent.Dellocate_Arreglo(name, _simbolo);
        return true;
    }

    @Override
    public Object visitSize_array(GramaticaParser.Size_arrayContext ctx) {
        Entorno ent = pilaEnt.peek();
        String name = String.valueOf(ctx.ID().getText());
        Simbolo _simbolo = ent.buscar(name);

        return ent.Size_Arreglo(name, _simbolo);
    }

    @Override
    public Object visitAsignacion(GramaticaParser.AsignacionContext ctx) {
        Entorno ent = pilaEnt.peek();
        Simbolo _simbolo = ent.buscar(ctx.ID().getText());
        ent.Actualizar(ctx.ID().getText(),visit(ctx.exp()),_simbolo);
        return  true;
    }


    //Produccion Funcion de imprimir
    @Override
    public Object visitPrint(GramaticaParser.PrintContext ctx) {
        System.out.println(visit(ctx.exp()));
            salida.add(String.valueOf(visit(ctx.exp())).replace("\"", "").replace("\'", "") );
        return true;
    }
    // Produccion Operacion de Expresiones Aritmeticas y Relacionales
    @Override
    public Object visitOpExp(GramaticaParser.OpExpContext ctx) {
        Operador_Relacional OP = new Operador_Relacional();
        int op_left = (int)visit(ctx.left);
        int op_right = (int)visit(ctx.right);
        String operador = ctx.op.getText();
        int case_op = OP.Identificar(operador);
        switch (case_op)
        {
            case 8 : return Math.pow(op_left,op_right);
            case 7 : return op_left * op_right;
            case 11 : return op_left / op_right;
            case 9 : return op_left + op_right;
            case 10 : return op_left - op_right;
            case 1: if (op_left < op_right){return  true;}
                else{return  false;}
            case 2: if (op_left > op_right){return  true;}
                else{return  false;}
            case 3: if (op_left <= op_right){return  true;}
                else{return  false;}
            case  4: if (op_left >= op_right){return  true;}
                else{return false;}
            case  5: if (op_left == op_right){return  true;}
                else{return false;}
            case 6:
                if (op_left != op_right){return  true;}
                else{return false;}
            case 12:
                Object obj1 = visit(ctx.left);
                Object obj2 = visit(ctx.right);
                boolean bool_left = (boolean)obj1;
                boolean bool_right = (boolean)obj2;
                if(bool_left && bool_right){return true;}
                else {return false;}
            default: throw new IllegalArgumentException("Operación no válida");
        }
    }



    @Override
    public Object visitIf_(GramaticaParser.If_Context ctx) {
        Entorno ent = pilaEnt.peek();
        Entorno if_ent = new Entorno(ent);
        pilaEnt.push(if_ent);
        boolean var = (boolean)visit(ctx.exp());
        if (var == true){visit(ctx.instrucciones());}
        pilaEnt.pop();
        return  true;
    }


   public Object visitSubrutina(GramaticaParser.SubrutinaContext ctx) {
       if (ctx.id1.getText().equals(ctx.id2.getText()))
       {
           if(!pilaEnt.peek().TablaSimbolo.containsKey((ctx.id1.getText()).toUpperCase()))
           {
               ArrayList<Simbolo> parametros = new ArrayList<Simbolo>();
               int pos = -1;
               for(GramaticaParser.ExpContext expCtx : ctx.lista_parametros().exp())
                   parametros.add(new Simbolo(expCtx.getText(), "", null, TipoSimbolo.Parametros));
               Subrutina subr = new Subrutina(ctx.id1.getText(), parametros, ctx.instrucciones(), ctx.ldeclp());
               pilaEnt.peek().nuevoSimbolo(ctx.id1.getText(),
                       new Simbolo(ctx.id1.getText(), "Subrutina", subr, TipoSimbolo.Subrutina));
               System.out.println(ctx.id1.getText());
               return true;
           }
       }
       return true;
    }

    @Override
    public Object visitCall(GramaticaParser.CallContext ctx) {
        Entorno ent = pilaEnt.peek();
        Simbolo simbRutina = ent.buscar(ctx.ID().getText());
        System.out.println(simbRutina);
        Subrutina subr = (Subrutina) simbRutina.valor;
        Entorno entSubr = new Entorno(ent);
        System.out.println(subr.lparametros.size());
        for (int i = 0; i < ctx.lista_parametros().exp().size(); i++)
        {
            Simbolo v = (Simbolo)visit(ctx.lista_parametros().exp().get(i));
            subr.lparametros.get(i).valor = v.valor;
            subr.lparametros.get(i).tipo = subr.ldeclaracionParam.declaraciones_with_intent(i).tipo().getText().toUpperCase();
            entSubr.nuevoSimbolo(subr.lparametros.get(i).identificador, subr.lparametros.get(i));
        }
        visitInstrucciones((GramaticaParser.InstruccionesContext)subr.linstrucciones);
            return  true;
    }



    @Override
    public Object visitElse_if(GramaticaParser.Else_ifContext ctx) {
        Entorno ent = pilaEnt.peek();
        Entorno ent_Else_if = new Entorno(ent);
        pilaEnt.push(ent_Else_if);
        boolean condicion1 = (boolean)visit(ctx.exp());
        if(condicion1 == true){visit(ctx.hacer1);
        }else {visit(ctx.hacer2);}
        pilaEnt.pop();
        return true;
    }

    @Override
    public Object visitIf_doble(GramaticaParser.If_dobleContext ctx) {
        Entorno ent = pilaEnt.peek();
        Entorno ent_If_doble = new Entorno(ent);
        pilaEnt.push(ent_If_doble);
        boolean condicion1 = (boolean)visit(ctx.exp1);
        boolean condicion2 = (boolean)visit(ctx.exp2);
        if(condicion1 == true){visit(ctx.hacer1);
        } else if (condicion2 ==  true) {visit(ctx.hacer2);}
        pilaEnt.pop();
        return true;
    }

    @Override
    public Object visitIf_else_doble(GramaticaParser.If_else_dobleContext ctx) {
        Entorno ent = pilaEnt.peek();
        Entorno ent_If_else_doble = new Entorno(ent);
        pilaEnt.push(ent_If_else_doble);
        boolean condicion1 = (boolean)visit(ctx.exp1);
        boolean condicion2 = (boolean)visit(ctx.exp2);
        if(condicion1 == true){visit(ctx.hacer1);
        } else if (condicion2 ==  true) {visit(ctx.hacer2);
        }else{visit(ctx.hacer3);}
        pilaEnt.pop();
        return true;
    }

    @Override
    public Object visitIf_triple(GramaticaParser.If_tripleContext ctx) {
        Entorno ent = pilaEnt.peek();
        Entorno ent_If_triple = new Entorno(ent);
        pilaEnt.push(ent_If_triple);
        boolean condicion1 = (boolean)visit(ctx.exp1);
        boolean condicion2 = (boolean)visit(ctx.exp2);
        boolean condicion3 = (boolean)visit(ctx.exp3);
        if(condicion1 == true){visit(ctx.hacer1);
        } else if (condicion2 ==  true) {visit(ctx.hacer2);
        }else if (condicion3 == true){visit(ctx.hacer3);}
        pilaEnt.pop();
        return true;
    }

    @Override
    public Integer visitParExp(GramaticaParser.ParExpContext ctx) {
        Object ob = visit(ctx.exp());
        return Integer.parseInt(ob.toString());
    }

    @Override
    public Object visitIf_else_triple(GramaticaParser.If_else_tripleContext ctx) {
        Entorno ent = pilaEnt.peek();
        Entorno ent_If_else_triple = new Entorno(ent);
        pilaEnt.push(ent_If_else_triple);
        boolean condicion1 = (boolean)visit(ctx.exp1);
        boolean condicion2 = (boolean)visit(ctx.exp2);
        boolean condicion3 = (boolean)visit(ctx.exp3);
        if(condicion1 == true){visit(ctx.hacer1);
        } else if (condicion2 ==  true) {visit(ctx.hacer2);
        }else if (condicion3 == true){visit(ctx.hacer3);}
        else{visit(ctx.hacer4);}
        pilaEnt.pop();
        return true;
    }

    @Override
    public Object visitIf_cuadruple(GramaticaParser.If_cuadrupleContext ctx) {
        Entorno ent = pilaEnt.peek();
        Entorno ent_If_cuadruple = new Entorno(ent);
        pilaEnt.push(ent_If_cuadruple);
        boolean condicion1 = (boolean)visit(ctx.exp1);
        boolean condicion2 = (boolean)visit(ctx.exp2);
        boolean condicion3 = (boolean)visit(ctx.exp3);
        boolean condicion4 = (boolean)visit(ctx.exp4);
        if(condicion1 == true){visit(ctx.hacer1);
        } else if (condicion2 ==  true){visit(ctx.hacer2);
        }else  if (condicion3 == true){visit(ctx.hacer3);}
        else   if (condicion4 == true){visit(ctx.hacer4);}
        pilaEnt.pop();
        return true;
    }

    @Override
    public Object visitIf_else_cuadruple(GramaticaParser.If_else_cuadrupleContext ctx) {
        Entorno ent = pilaEnt.peek();
        Entorno ent_If_else_cuadruple = new Entorno(ent);
        pilaEnt.push(ent_If_else_cuadruple);
        boolean condicion1 = (boolean)visit(ctx.exp1);
        boolean condicion2 = (boolean)visit(ctx.exp2);
        boolean condicion3 = (boolean)visit(ctx.exp3);
        boolean condicion4 = (boolean)visit(ctx.exp4);
        if(condicion1 == true){visit(ctx.hacer1);
        } else if (condicion2 ==  true){visit(ctx.hacer2);
        }else  if (condicion3 == true){visit(ctx.hacer3);}
        else   if (condicion4 == true){visit(ctx.hacer4);}
        else {visit(ctx.hacer5);}
        pilaEnt.pop();
        return true;
    }

    @Override
    public Object visitDo(GramaticaParser.DoContext ctx) {
        Entorno ent = pilaEnt.peek();
        Simbolo _simbolo = ent.buscar(ctx.ID().getText());
        int inicio = Integer.valueOf(ctx.inicio.getText());
        int final_ = Integer.valueOf(ctx.final_.getText());
        int paso = Integer.valueOf(ctx.paso.getText());;
        String name = String.valueOf(ctx.ID().getText());
        for(int i = inicio; i <= final_; i = i+paso) {
            ent.Actualizar(name, i, _simbolo);
            visit(ctx.instrucciones());
        }
        return true;
    }

    @Override
    public String visitNada(GramaticaParser.NadaContext ctx) {
        return "";
    }

    // Returns Informacion de Exp
    @Override
    public Integer visitEnteroExp(GramaticaParser.EnteroExpContext ctx) {
        return Integer.valueOf(ctx.getText());
    }


    @Override
    public Integer visitNumeroArre(GramaticaParser.NumeroArreContext ctx) {
        return Integer.valueOf(ctx.getText());
    }

    @Override
    public String visitCadeExp(GramaticaParser.CadeExpContext ctx) {
        return String.valueOf(ctx.getText());
    }

    @Override
    public Float visitDecExp(GramaticaParser.DecExpContext ctx) {
        return Float.valueOf(ctx.getText());
    }

    @Override
    public Object visitIdExp(GramaticaParser.IdExpContext ctx) {
        Entorno ent = pilaEnt.peek();
        Simbolo id = ent.buscar(ctx.ID().getText());
        if(id == null ) throw  new RuntimeException("La variable " + ctx.ID().getText() + " no existe");
        else return id.valor;
    }

    @Override
    public Object visitComplejoExp(GramaticaParser.ComplejoExpContext ctx) {
        return String.valueOf(ctx.getText());
    }

    @Override
    public String visitComaExp(GramaticaParser.ComaExpContext ctx) {
        String left = String.valueOf(ctx.left.getText());
        String right = String.valueOf(ctx.right.getText());
        String result = left +" " +right;
        String remplazo = result.replace(",", "");
        return String.valueOf(remplazo);
    }

    @Override
    public String visitFalExp(GramaticaParser.FalExpContext ctx) {
        String falso = String.valueOf(ctx.falso.getText());
        return falso;
    }

    @Override
    public String visitVerdadExp(GramaticaParser.VerdadExpContext ctx) {
        String verdadero = String.valueOf(ctx.verdadero.getText());
        return verdadero;
    }


}


           /* if(tipo_arreglo.equals("integer")) {
                int dimension = (int) visit(ctx.exp());
                String tipado = String.valueOf(ctx.tipado_arreglos().getText());
                ArrayList<Object> valores = new ArrayList(dimension);
                for(int i = 0; i <= dimension; i++){
                    valores.add(0);
                }
                Simbolo nuevo = new Simbolo(tipado, valores, valores);
                ent.nuevoSimbolo(ctx.nombre.getText(), nuevo);
                return true;
            } else if (tipo_arreglo.equals("real")) {
                int dimension = (int) visit(ctx.exp());
                String tipado = String.valueOf(ctx.tipado_arreglos().getText());
                ArrayList<Object> valores = new ArrayList(dimension);
                for(int i = 0; i <= dimension; i++){
                    valores.add(0.00000000);
                }
                Simbolo nuevo = new Simbolo(tipado, valores, valores);
                ent.nuevoSimbolo(ctx.nombre.getText(), nuevo);
                return true;
            } else if (tipo_arreglo.equals("character")) {
                int dimension = (int) visit(ctx.exp());
                String tipado = String.valueOf(ctx.tipado_arreglos().getText());
                ArrayList<Object> valores = new ArrayList(dimension);
                for(int i = 0; i <= dimension; i++){
                    valores.add(" ");
                }
                Simbolo nuevo = new Simbolo(tipado, valores, valores);
                ent.nuevoSimbolo(ctx.nombre.getText(), nuevo);
                return true;
            }*/


