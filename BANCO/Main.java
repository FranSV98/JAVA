public class Main{
  public static void main (String[] args){
    Cuenta miCuenta = new Cuenta (" Paco");
    System.out.println(miCuenta);
    System.out.println (miCuenta.ingresar(1000));
    System.out.println (miCuenta.retirar(10000));

  }
}
