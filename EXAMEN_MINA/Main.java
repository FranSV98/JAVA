import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


public class Main{

	public static void marcador(Jugador j1, Jugador j2){

		System.out.print("\n------------\nJUGADOR 1: ");
		System.out.print(j1.getPuntos());
		System.out.print("\n");
		System.out.print("JUGADOR 2: ");
		System.out.print(j2.getPuntos());
		System.out.print("\n------------\n");
	}

	public static void main(String[] args){
		boolean gana = false;
		int turno = 0;
		Random rand = new Random();
    	Scanner sc = new Scanner(System.in);
    	String nombre;
		Tablero miTablero = new Tablero();
		
		System.out.print("Introduce el nombre del primer jugador: ");
        nombre = sc.nextLine();
        Jugador jugador1 = new Jugador(nombre);
        System.out.print("Introduce el nombre del segundo jugador: ");
        nombre = sc.nextLine();
        Jugador jugador2 = new Jugador(nombre);

        System.out.print("EMPEZAMOS\n");
		miTablero.imprimeTablero();

		while (!gana){
			if (turno%2 == 0){
				System.out.print("\nTURNO DE JUGADOR 1\n");
				Pair objetivo = jugador1.desentierra();
				while (miTablero.compruebaMinadas(objetivo) == true || miTablero.coordenadasValidas(objetivo) == false){
					System.out.print("\nCoordenadas no validas.\n");
					objetivo = jugador1.desentierra();
				}

				jugador1.sumarPuntos(miTablero.mina[objetivo.f] [objetivo.c].getPuntos());
				miTablero.minadas.add(objetivo);
				miTablero.imprimeTablero();
				turno += 1;
				marcador(jugador1, jugador2);
				if (jugador1.getPuntos()>=15){
					gana = true;
					System.out.print("GANA JUGADOR 1 !!!");
				}
			}
			else {
				System.out.print("\nTURNO DE JUGADOR 2\n");
				Pair objetivo = jugador2.desentierra();
				while (miTablero.compruebaMinadas(objetivo) == true || miTablero.coordenadasValidas(objetivo) == false){
					System.out.print("\nCoordenadas no validas.\n");
					objetivo = jugador2.desentierra();
				}

				jugador2.sumarPuntos(miTablero.mina[objetivo.f] [objetivo.c].getPuntos());
				miTablero.minadas.add(objetivo);
				miTablero.imprimeTablero();
				turno += 1;
				marcador(jugador1, jugador2);
				if (jugador2.getPuntos()>=15){
					gana = true;
					System.out.print("GANA JUGADOR 2 !!!");
				}
			}
		}
		
	}
}