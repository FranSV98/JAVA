import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    int vida = (int) (Math.random()*7+5);
    int danio = (int) (Math.random()*4+2);
    int agilidad = (int) (Math.random()*7+5);

    System.out.println("El primero mosntruo hace" + danio + "de daño" + "su vida es de " + vida + "y su agilidad de " + agilidad + " .");
    System.out.println("El segundo mosntruo hace" + danio + "de daño" + "su vida es de " + vida + "y su agilidad de " + agilidad + " .");
    System.out.println("El tercer mosntruo hace" + danio + "de daño" + "su vida es de " + vida + "y su agilidad de " + agilidad + " .");
  }
}
