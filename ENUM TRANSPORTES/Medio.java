public enum Medio {
	AVION("Avion", 900, 10, 1),
	TREN("Tren", 200, 14, 0),
	COCHE("Coche", 120, 12, 0),
	BICI("Bici", 20, 0, 0);

	private double km;
	private double precio;
	private double retraso;

	Medio(String tipo, int km, double precio, double retraso){
		this.km = km;
		this.precio = precio;
		this.retraso = retraso;
	}

	public void setPrecio(double precio){
		this.precio = precio;
	}

	public double getKm(){
		return this.km;
	}
	public double getPrecio(){
		return this.precio;
	}

	public double calculaTiempo(double distancia){
		return (double)Math.round((distancia/this.km + this.retraso) * 100d) / 100d;
	}

	public double calculaPrecio(double distancia){
		return (double)Math.round(distancia*(this.precio/100) * 100d) / 100d;
	}

}
