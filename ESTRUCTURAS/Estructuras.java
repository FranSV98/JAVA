import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;

class Estructuras{
  public static void pruebaArrayList(){
    // System.out.println("Todavia no hemos probado el ArrayList");
    System.out.println(" -> Creamos ArrayList de colores");
    ArrayList<String> colores = new ArrayList <String>();
    System.out.println(" -> Imprimimos colores antes de aniadirle datos. ");
    System.out.println(colores);
    System.out.println(" -> Introducimos datos en colores. ");
    colores.add("azul");
    colores.add("amarillo");
    colores.add("rojo");
    System.out.println("Volvemos a imprimir colores despues de aniadirle datos" );
    System.out.println(colores);
    System.out.println(" -> Imprimimos el valor que hay en la casilla 2, que es  ");
    System.out.println(colores.get(2));
    System.out.println(" -> Cambiamos el color rojo por magenta. ");
    colores.set(2, "magenta");
    System.out.println(colores);
    System.out.println(" -> Aniadimos el color negro.");
    colores.add(0, "negro");
    System.out.println(colores);
    System.out.println(" -> El ArrayList tiene tamanio " + colores.size());
    System.out.println(" -> Eliminamos el color negro");
    colores.remove(0);
    System.out.println(" -> El ArrayList tiene tamanio " + colores.size() + " despues de borrar el color negro");
    System.out.println(" Recorrer la ArrayList elemento a elemento. ");
      for (String c : colores){
        System.out.println(c);

      }
  }






  public static void pruebaLinkedList(){

    System.out.println(" -> Creamos LinkedList de colores");
    LinkedList<String> colores = new LinkedList <String>();
    System.out.println(" -> Imprimimos colores antes de aniadirle datos. ");
    System.out.println(colores);
    System.out.println(" -> Introducimos datos en colores. ");
    colores.add("azul");
    colores.add("amarillo");
    colores.add("rojo");
    System.out.println("Volvemos a imprimir colores despues de aniadirle datos" );
    System.out.println(colores);
    System.out.println(" -> Imprimimos el valor que hay en la casilla 2, que es  ");
    System.out.println(colores.get(2));
    System.out.println(" -> Cambiamos el color rojo por magenta. ");
    colores.set(2, "magenta");
    System.out.println(colores);
    System.out.println(" -> Aniadimos el color negro al principio.");
    colores.addFirst("negro");
    System.out.println(" -> Aniadimos el color blanco al final.");
    colores.addLast("blanco");
    System.out.println(colores);
    System.out.println(" -> El LinkedList tiene tamanio " + colores.size());
    System.out.println(" -> Eliminamos el color negro");
    colores.remove(0);
    System.out.println(" -> El LinkedList tiene tamanio " + colores.size() + " despues de borrar el color negro");
    System.out.println(" Recorrer la LinkedList elemento a elemento. ");
      for (String c : colores){
        System.out.println(c);
      }
    // System.out.println("Todavia no hemos probado el LinkedList");
  }
  public static void pruebaHashMap(){
    // System.out.println("Todavia no hemos probado el HashMap");

    HashMap <String, Integer> edades = new HashMap <String,Integer>();
    System.out.println(" -> Aniadimos tres personas. ");
    edades.put ("Celia", 26);
    edades.put ("Vicky" , 20);
    edades.put ("JuanMi", 30);
    edades.put ("Emilio", 22);
    System.out.println(edades);

  }
  public static void main (String[] args){
    pruebaArrayList();
        System.out.println("--------------------------------------------------------------------------------------");
    pruebaLinkedList();
        System.out.println("--------------------------------------------------------------------------------------");
    pruebaHashMap();
  }
}
