public class Main{
  public static void main (String[] args){
    Medio miTren = Medio.TREN;
		Medio miAvion = Medio.AVION;
		Medio miBici = Medio.BICI;

    System.out.print("El tren va a: ");
		System.out.println(miTren.getKm()+" km/h");
		System.out.print("El precio del billete es de: ");
		System.out.println(miTren.getPrecio()+" EUROS");
		System.out.print("El tren tarda en recorrer 2500km: ");
		System.out.println(miTren.calculaTiempo(2500)+" h");
		System.out.print("El precio de viaje de 2500km: ");
		System.out.println(miTren.calculaPrecio(2500)+" EUROS \n");

    System.out.print("El tiempo que tarda el avion en recorrer 2500km es: ");
    System.out.println(miAvion.calculaTiempo(2500)+" h");
    System.out.print("El tiempo que tarda la bici en recorrer 2500km es: ");
    System.out.println(miBici.calculaTiempo(2500)+" h");
    System.out.print("El tiempo que tarda el tren en recorrer 2500km es: ");
    System.out.println(miTren.calculaTiempo(2500)+" h \n");

    System.out.print("El tiempo que tarda el avion en recorrer 125km es: ");
    System.out.println(miAvion.calculaTiempo(125)+" h");
    System.out.print("El tiempo que tarda la bici en recorrer 125km es: ");
    System.out.println(miBici.calculaTiempo(125)+" h");
    System.out.print("El tiempo que tarda el tren en recorrer 125km es: ");
    System.out.println(miTren.calculaTiempo(125)+" h");

  }
}
