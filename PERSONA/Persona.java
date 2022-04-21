public class Persona{
  protected String nombre;
  protected String dni;

//CONSTRUCTORES
  public Persona(){
    this.nombre = "Francisco";
    this.dni = "20078737J";
  }
//CONSTRUCTOR 2
  public Persona(String nombre, String dni){
    this.nombre = nombre;
    this.dni = dni;
  }

//CONSTRUCTOR 3
  public Persona(Persona persona){
    this.nombre = persona.nombre;
    this.dni = persona.dni;
  }

  public String getNombre(){
    return this.nombre;
  }
  public String getDni(){
    return this.dni;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public void setDni(String dni){
    this.dni = dni;
  }



  //ToString
  public String toString(){
    return "Me llamo " + this.nombre + " y mi dni es " + this.dni + " . ";
  }
}
