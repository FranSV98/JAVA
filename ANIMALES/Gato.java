import java.util.*;

public class Gato extends Mascota{
	private final static String FOOD = "sardina";
	private final static String NAME = "Wiskas";
	private String ruiditos = "RrrRrrRrRRrRrr\n";
	private final static int PROB_CRIAR = 6;
	private final static int CAGADAS = 3;
//Constructor
	public Gato(){
		this(NAME, GENER, FOOD);
	}
	public Gato(String nombre){
		this(nombre, GENER, FOOD);
	}
	public Gato(String nombre, String sexo){
		this(nombre, sexo, FOOD);
	}
	public Gato(String nombre, String sexo, String comidaFavorita){
		this.setNombre(nombre);
		this.setComidaFavorita(comidaFavorita);
		this.setSexo(sexo);
	}
	public Gato(Gato gato){
		this.setNombre(gato.nombre);
		this.setComidaFavorita(gato.alimentacion);
		this.setSexo(gato.sexo);
	}
//GET Y SET
	public void setRuiditos(String ruiditos){
		this.ruiditos = ruiditos;
	}
	public String getSexo(){
		String genero = "uno gato de carton.\n";
		if (this.sexo) genero = "una gata de piedra.\n";
		return "Soy " + genero;
	}
	public String getRuiditos(){
		return "Cuando cago hago \"" + this.ruiditos + "\".";
	}
	public String toString(){
		String fin = "Estoy listo.\n";
		if (this.sexo){
			fin = "Im ready.\n";
			if (this.cria) fin = "Estoy yo preña...\n";
		}
		return "Hola! " + this.getSexo() + "Me llamo " + this.nombre + " y mi comida favorita es " + this.alimentacion + ".\nAhora mismo... " + this.getHigiene() + fin;
	}
//METODOS
	public String hablar(){
		return "Miiaaaaauuuuu\n";
	}
	public String dormir(){
		return "ZzZZzZzzZzZzzZzZzzZz \n";
	}
	public String comer(){
		return "Mmmmmmmm " + this.alimentacion + ".\ñam ñam!\n";
	}
	public String follar(){
		return this.teniendoSexo(this.ruiditos, this.PROB_CRIAR);
	}
	public String excretar(){
		return this.excreta(CAGADAS);
	}


}
