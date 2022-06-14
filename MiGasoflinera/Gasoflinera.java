public class Gasoflinera{
  private String gasolina95;
  private String gasolina98;
  private String diesel;

  public Gasoflinera(String gasolina95, String gasolina98, String diesel){
    this.gasolina95 = gasolina95;
    this.gasolina98 = gasolina98;
    this.diesel = diesel;
  }

  public void setGasolina95(){
    this.gasolina95 = gasolina95;
  }
  public void setGasolina98(){
    this.gasolina98 = gasolina98;
  }
  public void setDiesel(){
    this.diesel = diesel;
  }

  public String getGasolina95(){
    return this.gasolina95;
  }
  public String getGasolina98(){
    return this.gasolina98;
  }
  public String getDiesel(){
    return this.diesel;
  }
  
}
