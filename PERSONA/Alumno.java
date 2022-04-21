public class Alumno extends Persona{
  private   String grado;         //Acceso solo desde la clase
            String gradoSonMod;   //Acceso solo desde el paquete
  protected String gradoProt;     //Acceso desde los hijos y el paquete
  public    String gradoPubl;     //Acceso global

  public Alumno(){
    super();
    this.grado = "DAW";
  }
  public Alumno(String nombre, String dni, String grado){
    super(nombre, dni);
    this.grado = grado;
  }
  public Alumno(Alumno alumno){
    super(alumno.nombre, alumno.dni);
    this.grado = alumno.grado;
  }

  public String getGrado(String grado){
    return this.grado;
  }

  public void setGrado(String grado){
    this.grado = grado;
  }

  public String toString(){
    return super.toString() + " Estoy en el grado de " + this.grado + " .";
  }
}
