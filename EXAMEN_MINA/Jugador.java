
import java.util.Scanner;

public class Jugador{
    public Scanner sc = new Scanner(System.in);
	private String nombre;
	private int puntos;

	Jugador(String miNombre){
		this.nombre = miNombre;
		this.puntos = 0;
	}

	public void sumarPuntos(int mispuntos){
		this.puntos += mispuntos;
	}

	public int getPuntos(){
		return this.puntos;
	}

	public Pair desentierra(){
		boolean ok = false;
		int f = -1;
		int c = -1;
		do{
			try{
				System.out.print("   FILA: ");
				f = Integer.parseInt(sc.nextLine())-1;
				System.out.print("COLUMNA: ");
				c = Integer.parseInt(sc.nextLine())-1;
				ok = true;
			} catch (NumberFormatException e){
				System.out.print("Coordenadas no validas.\n");
			}
		} while (ok = false);

		Pair desenterrada = new Pair(f,c);
		return desenterrada;
	}
	
}
