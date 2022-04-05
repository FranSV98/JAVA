import java.util.Scanner;

public class Main {
  public static void main (String[] args){
    String nombre;
    Scanner sc = new Scanner (System.in);    ///Pides datos de pantalla (de entrada)

    System.out.println("¿Como te llamas? ");
    nombre = sc.nextLine();
    System.out.println("Hola " + nombre + "!");

  }
}
