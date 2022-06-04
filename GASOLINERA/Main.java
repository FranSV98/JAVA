import java.util.Scanner;

public class Main{
  public static void main(String[] args) {

    double pagar = 0;
    double total = 0.0;
    String opcion = "";
    double precio = 0.0;
    int litros = 0;
    Scanner br = new Scanner(System.in);
    do {
      System.out.println("Tipo                Precio\n"
          +             "gasolina95           1,127\n"
          +             "gasolina98           1,223\n"
          +             "gasoil               1,095\n");
      System.out.println("Ingrese Tipo de combustible: ");
      opcion = br.next();
      System.out.println("Ingrese cantidad de litros: ");
      litros = br.nextInt();

      precio = valor(litros, opcion);
      total += precio;
      System.out.println("");
      if (precio != 0) {
        System.out.println("usted debe pagar " + precio);
      }

    } while (!opcion.equals("D"));
    System.out.println("Total de caja " + total);

  }

  private static double valor(int litros, String opcion) {
    double f = 0.0;
    double iva = 0.21;
    double descuento = 0.20*litros;
    switch (opcion) {
      case "gasolina95":
        f =  (1.127 * litros) * iva / 100 + descuento;
        break;
      case "gasolina98":
        f = (1.223 * litros) * iva / 100 + descuento;
        break;
      case "diesel":
        f = (1.095* litros) *iva/100 + descuento;
        break;
      default:
        System.out.println("Los tipos de combustible son Gasolina95, Gasolina 98 y  Diesel");
        break;

    }

    return f;
  }
}
