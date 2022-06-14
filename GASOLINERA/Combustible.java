import java.util.HashMap;

public class Combustible{
  private HashMap<String, Double> impuestos;

  private String nombre;
  private Double precioBase;
  private Double litros;
  private Double impuesto;

  private precioFinal;

  Combustible(String nombre, Double precioBase){
  impuestos = rellenarImpuestos();
  this.nombre = nombre();
  this.precioBase = precioBase;
  this.impuesto = impuesto(this.nombre);
  this.litros = litros
  }

  private HashMap <String, Double> rellenarImpuestos(){
  HashMap<String, Double> impuestos = new HashMap<String, Double()>;
  impuestos.put("SP95","0.472");
  impuestos.put("SP98","0.505");
  impuestos.put("GA","0.379");
  return impuestos;
  }

  public toString(){
    return this.nombre + " + " this.precioBase;
  }

  public static void main(String[] args){
    System.out.println("Hola");
    Combustible gasolina
  }
}
