public class Combustible extends Gasoflinera{
  private String nombre;
  private Double precio;
  private Double iva;
  private int litros;

  public Combustible(String nombre, double precio, double iva, int litros){
    this.nombre = nombre;
    this.precio = precio;
    this.iva = iva;
    this.litros = litros;
  }

  public Combustible(){
    this.nombre = gasolina95;
    this.precio = 1.127;
    this.iva = 1.21;
    this.litros = 1000;
  }
  public Combustible(){
    this.nombre = gasolina98;
    this.precio = 1.223;
    this.iva = 1.21;
    this.litros = 1000;
  }
  public Combustible(){
    this.nombre = diesel;
    this.precio = 1.095;
    this.iva = 1.21;
    this.litros = 1000;
  }

  public void setNombre(){
    this.nombre = nombre;
  }
  public void setPrecio(){
    this.precio = precio;
  }
  public void setIva(){
    this.iva = iva;
  }
  public void setLitros(){
    this.litros = litros;
  }

  public String nombre(){
    return this.nombre;
  }
  public Double precio(){
    return this.precio;
  }
  public Double iva(){
    return this.iva;
  }
  public int litros(){
    return this.litros;
  }
}
