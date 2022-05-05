import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);

    String avance;
    int avancex,avancey;

    Noob miNoob = new Noob("Yo");
    System.out.println(miNoob);
    Pro miPro = new Pro("YoPro");
    System.out.println(miPro);

    miNoob.andar(10,10);
    miPro.andar(20,20);
    System.out.println(miNoob);
    System.out.println(miPro);

    System.out.print("Indica cuanto avanzar en la X: ");
    avancex = Integer.parseInt(sc.nextLine());
    System.out.print("Indica cuanto avanzar en la Y: ");
    avancey = Integer.parseInt(sc.nextLine());
    miNoob.andar(avancex,avancey);
    System.out.println(miNoob);

   }
}
