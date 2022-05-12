enum Color{
  AZUL(10), AMARILLO(15), VERDE(20), ROJO(25);
  //public static final Nota AZUL = new Nota(10);
  private int numLapices;
  Color (int num){
    this.numLapices = num;
  }
  public int getNumLapices(){
    return this.numLapices;
  }
  public void setNumLapices(int num){
    this.numLapices = num;
  }
}

public class Main{
  public static void main (String[] args){
    Alumno miPersona = new Alumno("P", "98798787k", "DAW");
    System.out.println(miPersona);
    System.out.println("El nombre es " + miPersona.getNombre() + ".");
    System.out.println("El dni es " + miPersona.getDNI() + ".");
    miPersona.setNombre("Celia");
    miPersona.setDNI("12312312o");
    System.out.println(miPersona);

    System.out.println("Lista de colores:");
    Color arrColor[] = Color.values();
    for (Color c : arrColor){
      System.out.println(c);
    }
    System.out.println("Ordinal de ROJO:");
    Color miColor = Color.valueOf("ROJO");
    Color miSegundoColor = Color.valueOf("ROJO");
    System.out.println(miColor.ordinal());

    System.out.println("Mostramos cuantos lápices tenemos de cada color:");
    for (Color c : Color.values()){
      System.out.println("Del color " + c + " tenemos " +c.getNumLapices() + " lapices.");
    }

    System.out.println("Imprimiendo el numero de lapices azules [10]: ");
    System.out.println(Color.AZUL.getNumLapices());
    System.out.println("Imprimiendo el numero de lapices en miColor (es ROJO) [25]: ");
    System.out.println(miColor.getNumLapices());
    System.out.println("Imprimiendo el numero de lapices en miSegundoColor (es ROJO) [25]: ");
    System.out.println(miSegundoColor.getNumLapices());
    System.out.println("Cambiamos el valor del numero de lapices de miColor a 5:");
    miColor.setNumLapices(5);
    System.out.println(miColor.getNumLapices());
    System.out.println("MiSegundoColor es ROJO igual que miColor. Imprimiendo el numero de lapices en miSegudnoColor");
    System.out.println(miSegundoColor.getNumLapices());

    System.out.println();
    System.out.println("Al comparar dos objetos de tipo Enum estamos comparando la cadinalidad");
    miColor.valueOf("AZUL");
    System.out.println("Ahora miColor es AZUL y miSegudnoColor es ROJO.");

  }
}
