
public enum Material{
	DIAMANTE ("D", 5),
	ORO ("O", 3),
	PLATA ("P", 2),
	NADA ("N", 0),
	CACA ("C", -1);

	private String marca;
	private int puntos;

	Material(String miMarca, int misPuntos){
		this.marca = miMarca;
		this.puntos = misPuntos;
	}

	public String getMarca(){
		return this.marca;
	}
	public int getPuntos(){
		return this.puntos;
	}

}
