package Entorno;
import java.util.ArrayList;
public class Simbolo {

    public String tipo;
    public  Object valor;
    public Object [][] Arrar_2D;
    public ArrayList<Object> valor_Array;
    public String identificador;
    public int posicion;

    public TipoSimbolo tipoSimbolo;

    public enum TipoSimbolo{
        variable,
        Funcion,
        Subrutina,
        Parametros,
        Nativos
    }


    public Simbolo(String tipo, Object valor,ArrayList<Object> valor_Array, Object [][] Arrar_2D){
        this.tipo = tipo;
        this.valor = valor;
        this.valor_Array = valor_Array;
        this.Arrar_2D = Arrar_2D;
    }
    public Simbolo(String id, String tipo, Object valor, TipoSimbolo tipoS, int posicion) {
        this.identificador = id;
        this.tipo = tipo;
        this.valor = valor;
        this.tipoSimbolo = tipoS;
        this.posicion = posicion;
    }
    public Simbolo(String id, String tipo, Object valor, TipoSimbolo tipoS) {
        this.identificador = id;
        this.tipo = tipo;
        this.valor = valor;
        this.tipoSimbolo = tipoS;
    }

    public  Simbolo(TipoSimbolo tipoS, Object valor, String tipo)
    {
        this.identificador = "";
        this.tipo = tipo;
        this.valor = valor;
        this.tipoSimbolo = tipoS;
        this.posicion = -1;
    }




}
