package Entorno;
import org.antlr.runtime.tree.TreeWizard;
import java.util.ArrayList;
import java.util.*;

public class Entorno {




    public HashMap<String, Simbolo> TablaSimbolo;
    public Entorno padre;
    public  String nombre;
    public Entorno(Entorno padre){
        this.padre = padre;
        TablaSimbolo = new HashMap<String, Simbolo>();
    }

    public  void nuevoSimbolo(String nombre, Simbolo nuevo){
        if(TablaSimbolo.containsKey(nombre.toUpperCase())){
            System.out.println("La variable " + nombre + " ya existe.");
        }
        else TablaSimbolo.put(nombre.toUpperCase(), nuevo);
    }




    public  Simbolo buscar(String nombre){
        for (Entorno ent = this ; ent != null; ent =  ent.padre){
            if(ent.TablaSimbolo.containsKey(nombre.toUpperCase()))
                return ent.TablaSimbolo.get(nombre.toUpperCase());
        }
        return  null;
    }

    public Object Actualizar(String nombre,Object new_value ,Simbolo _simbolo){
        for(Entorno ent = this; ent != null; ent = ent.padre){
            if(ent.TablaSimbolo.containsKey(nombre.toUpperCase()))
                    _simbolo.valor = new_value;
                return _simbolo.valor;
        }
        return  null;
    }

    public Simbolo Insertar_Arreglo_1D(String nombre,Object new_value ,Simbolo _simbolo){
        for(Entorno ent = this; ent != null; ent = ent.padre){
            if(ent.TablaSimbolo.containsKey(nombre.toUpperCase()))
                _simbolo.valor_Array.add(new_value);
            return ent.TablaSimbolo.get(nombre.toUpperCase());
        }
        return  null;
    }


    public Simbolo Insertar_Por_Posicion_1D(String nombre,Object new_value ,Simbolo _simbolo, int Posicion){
        for(Entorno ent = this; ent != null; ent = ent.padre){
            if(ent.TablaSimbolo.containsKey(nombre.toUpperCase()))
                _simbolo.valor_Array.add(Posicion,new_value);
            return ent.TablaSimbolo.get(nombre.toUpperCase());
        }
        return  null;
    }
    public Simbolo Insertar_Por_Posicion_2D(String nombre,int new_value ,Simbolo _simbolo, int Posicion_1, int Posicion_2){
        for(Entorno ent = this; ent != null; ent = ent.padre){
            if(ent.TablaSimbolo.containsKey(nombre.toUpperCase()))
                _simbolo.Arrar_2D[Posicion_1][Posicion_2]= Integer.valueOf(new_value);
            return ent.TablaSimbolo.get(nombre.toUpperCase());
        }
        return  null;
    }

    public Object Acceder_Por_Posicion_1D(String nombre,Simbolo _simbolo, int Posicion){
        for(Entorno ent = this; ent != null; ent = ent.padre){
            if(ent.TablaSimbolo.containsKey(nombre.toUpperCase()))
            return _simbolo.valor_Array.get(Posicion);
        }
        return  null;
    }
    public Object Acceder_Por_Posicion_2D(String nombre,Simbolo _simbolo, int Posicion_1, int Posicion_2){
        for(Entorno ent = this; ent != null; ent = ent.padre){
            if(ent.TablaSimbolo.containsKey(nombre.toUpperCase()))
                return _simbolo.Arrar_2D[Posicion_1][Posicion_2];
        }
        return  null;
    }

    public Object Size_Arreglo(String nombre,Simbolo _simbolo){
        for(Entorno ent = this; ent != null; ent = ent.padre){
            if(ent.TablaSimbolo.containsKey(nombre.toUpperCase()))
                return _simbolo.valor_Array.size();
        }
        return  null;
    }

    public Simbolo Dellocate_Arreglo(String nombre,Simbolo _simbolo){
        for(Entorno ent = this; ent != null; ent = ent.padre){
            if(ent.TablaSimbolo.containsKey(nombre.toUpperCase()))
                _simbolo.valor_Array.clear();
                return ent.TablaSimbolo.get(nombre.toUpperCase());
        }
        return  null;
    }

}
