import java.util.*;
import java.math. *;
//INTERFAZ "AnimalInterfaz"
abstract class Mascota implements AnimalInterfaz{
	protected final static String GENER = "F";
	protected String nombre = "Mascota";
	protected boolean cria = false;
	protected boolean sexo = true;
	private boolean limpio = true;
	protected String alimentacion = "comida";
	private int amistad = 0;
	private int trugnos = 0;
	private int turnoDeExc = 0;
//GET/SET
	protected void setSexo(String sexo){
		if (compruebaSexo(sexo)) this.sexo = false;
	}
	protected void setSexo(boolean sexo){
		this.sexo = sexo;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setComidaFavorita(String comida){
		this.alimentacion = comida;
	}
	public String getNombre(){
		return "Hola, me llamo " + this.nombre;
	}
	public String getHigiene(){
		String genero = "o";
		if (this.sexo) genero = "a";
		String estado = "Estoy limpisim" + genero + ".\n";
		if (trugnos > 6) estado = "Me muero de asco.\n";
		else if (trugnos > 2) estado = "Estoy hech" + genero + " un asco.\n";
		else if (trugnos > 0) estado = "Estoy más o menos limpi" + genero + ".\n";
		return estado;
	}
	public String getAmistad(){
		String level = "Te adorooo ";
		if (this.amistad > 9) level = "Te amooo ";
		else if (this.amistad < -9) level = "Vete a la mierda ";
		else if (this.amistad < 0) level = "Me caes mal ";
		return level + Integer.toString(unsigned(this.amistad)) + "\n";
	}
	public String getComidaFavorita(){
		return "Lo que mes gusta es " + this.alimentacion + ".\n";
	}
	public String getEstado(){
		String miEstado = "Pero que diseee\n";
		if (this.sexo) miEstado = "Estoy libree\n";
		if (this.cria) miEstado = "Estoy to preñaaa\n";
		return miEstado;
	}
//MÉTODOS
	private int unsigned(int num){
		if (num < 0) num = num*-1;
		return num;
	}
	private String tratar(boolean trato){
		String sonido = "OOooohhhh\n";
		String level = "Te quiero ";
		if (trato){
			this.amistad += 1;
		}
		else {
			sonido = "AAAAUUUHHH!!!\n";
			this.amistad -= 3;
		}
		return sonido + this.getAmistad();
	}
	protected Boolean compruebaSexo(String sexo){
		boolean esMacho = false;
		String comp[] = {"m", "M"};
		for (int i = 0; i < comp.length; i ++){
			if (comp[i] == sexo) esMacho = true;
		}
		return esMacho;
	}
	protected String teniendoSexo(String ruiditos, int porbCriar){
		this.cria = false;
		String what = ruiditos;
		int random = (int)(Math.random() * ((10 - 1) + 1)) + 1;
		if (random > 10-porbCriar){
			what = ruiditos + "Vamoooos locooo!!!!\n";
			if (this.sexo){
				this.cria = true;
			}
		}
		return what;
	}
	protected String excreta(int turno){
		String sale = "Pssssss\n";
		this.turnoDeExc += 1;
		if (this.turnoDeExc%turno == 0){
			sale = "Plll!\n";
			this.trugnos += 1;
			if (this.trugnos > 2){
				sale = "pllll!!!\n";
				this.limpio = false;
			}
		}
		return sale;
	}
	public String acariciar(){
		boolean trato = true;
		return tratar(trato);
	}
	public String pegar(){
		boolean trato = false;
		return tratar(trato);
	}
	public String limpiar(){
		this.trugnos = 0;
		return "Ya esta limpio!!\n";
	}

}
