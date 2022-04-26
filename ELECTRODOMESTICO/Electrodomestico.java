public class Electrodomestico{
  protected Double precio;
  protected String color;
  protected String consumo;
  protected Double peso;

  //CONSTRUCTORES

  public Electrodomestico(){
    this.precio = 100.00;
    this.color = "blanco";
    this.consumo = "F";
    this.peso = 20.0;
  }

  public Electrodomestico(Double precio, String color, String consumo, Double peso){
    this.precio = precio;
    this.color = color;
    this.consumo = consumo;
    this.peso = peso;
  }

  public Electrodomestico(Electrodomestico electrodomestico){
    this.precio = electrodomestico.precio;
    this.color = electrodomestico.color;
    this.consumo = electrodomestico.consumo;
    this.peso = electrodomestico.peso;
  }

  //GET Y SET

  public Double getPrecio(){
    return this.precio;
  }
  public String getColor(){
    return this.color;
  }
  public String getConsumo(){
    return this.consumo;
  }
  public Double getPeso(){
    return this.peso;
  }

  public void setPrecio(){
    this.precio = precio;
  }
  public void setColor(){
    this.color = color;
  }
  public void setConsumo(){
    this.consumo = consumo;
  }
  public void setPeso(){
    this.peso = peso;
  }


  public String toString(){
    return "El precio del electrodomestico mas basico cuesta " + this.precio +"€" + " en color " + this.color + " consume " + this.consumo + " y pesa" + "Kg" +  this.peso + " . ";
  }

}
