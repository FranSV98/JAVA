public class Main{
  public static void main (String[] args){
      Persona miPersona = new Persona("Paula", "98432345H");
      System.out.println(miPersona);
      System.out.println("El nombre es " + miPersona.getNombre() + ".");
      System.out.println("El dni es " + miPersona.getDni() + ".");
      miPersona.setNombre("Paco");
      miPersona.setDni("20078737J");
      System.out.println(miPersona);
  }
}
