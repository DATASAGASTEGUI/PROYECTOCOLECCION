package misrc;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Principal {

    public static void main(String[] args) {
       //ejemplo1();
       ejemplo2();
        
    }
    
    //CREAR UNA COLECCION TREESET Y AGREGAR ALEMENTOS
    public static void ejemplo1() {
        //Filtra quedandose con los distinos (no duplicados)
        //Ordenar numericamente o alfabeticamente
        Set<Integer> enteros_ts = new TreeSet<>();
        enteros_ts.add(2);
        enteros_ts.add(3);
        enteros_ts.add(2);
        enteros_ts.add(1);
        enteros_ts.add(9);
        for(Integer elemento: enteros_ts) {
            System.out.print(elemento + "  ");
        }
        for(int i=0; i<enteros_ts.size(); i++) {
           //System.out.print(enteros_ts.get(i)); //No se puede recorrer por indice
        }
        //Convertir un treeset a arraylist
        List<Integer> enteros_al = new ArrayList<>(enteros_ts);
        //Recorrer por elmento el arraylist
        for(Integer elemento: enteros_al) {
            System.out.print(elemento + "  ");
        }
        //Recorrer por indice el arraylist
        for(int i=0; i<enteros_al.size(); i++) {
            System.out.print(enteros_al.get(i) + "  "); 
        }        
    }
    
    //CREAR UN TREESET DE TIPO CADENA
    public static void ejemplo2() {
        Set<String> nombres_ts = new TreeSet<>();
        nombres_ts.add("Luis");
        nombres_ts.add("Miguel");
        nombres_ts.add("Carlos");
        nombres_ts.add("Luis");
        nombres_ts.add("Arturo");

    }
    
}
