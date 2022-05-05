/*
------------------------
|   Pro                |
|----------------------|
| - vehiculo           |
|----------------------|
| + Pro()              |
| + Set...             |
| + Get...             |
| + conducir()         |
| + toString()         |
|----------------------|
*/

public class Pro extends Noob{
  protected Vehiculo coche;

  public Pro(String nombre){
    super(nombre);
    this.coche = new Vehiculo();
  }

  //Constructor parámetros.
  //Constructor copia.
  //Get
  //Set

  public String toString(){
    return super.toString() + " " + coche.toString();
  }
}
