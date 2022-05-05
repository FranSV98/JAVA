/*
------------------------
|   Vehiculo           |
|----------------------|
| - velocidad          |
|----------------------|
| + Vehiculo()         |
| + Set...             |
| + Get...             |
| + acelerar()         |
| + frenar()           |
| + toString()         |
|----------------------|
*/

public class Vehiculo{
  private int velocidad;

  private final int VELOCMIN = 0;
  private final int VELOCMAX = 220;

  public Vehiculo(){
    this.velocidad = VELOCMIN;
  }

  //Constructor parámetros.
  //Constructor copia.
  //Get

  public void setVelocidad(int velocidad){
    this.velocidad = velocidad;
    if (velocidad < VELOCMIN) this.velocidad = VELOCMIN;
    else if (velocidad > VELOCMAX) this.velocidad = VELOCMAX;
  }

  public void acelerar(int incremento){
    setVelocidad(this.velocidad+incremento);
  }
  public void frenar(int decremento){
    setVelocidad(this.velocidad-decremento);
  }

  public String toString(){
    return " El vehiculo va a " + this.velocidad + "km/h.";
  }
}
