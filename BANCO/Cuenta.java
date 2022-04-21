public class Cuenta{
  protected String titular;
  protected Double cantidad;

//CONSTRUCTORES
  public Cuenta(){
    this.titular = titular;
    this.cantidad = cantidad;
  }

  public Cuenta(String titular){
    this.titular = titular;
    this.cantidad = 0.00;
  }

  public Cuenta(Cuenta cuenta){
    this.titular = cuenta.titular;
    this.cantidad = cuenta.cantidad;
  }

  public String getTitular(){
    return this.titular;
  }

  public Double getCantidad(){
    return this.cantidad;
  }

  public void setTitular(String titular){
    this.titular = titular;
  }

  public void setCantidad(Double cantidad){
    this.cantidad = cantidad;
  }

  //toString
  public String toString(){
    return "El nombre del titular es" + this.titular + " y la cantidad es " + this.cantidad + " .";

      public double ingresar(double importe){
              if (importe >0){
                  this.cantidad +=importe;
              }
              return this.cantidad;
          }

          public double retirar(double importe){
              if (importe >0 && importe <=this.cantidad){
                  this.cantidad -=importe;
              }
              return this.cantidad;
          }

  }
}
