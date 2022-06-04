
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Tablero{
	public Random rand = new Random();
    public Scanner sc = new Scanner(System.in);
	public int filas = 5;
	public int columnas = 5;
	public Material [][] mina = new Material [5][5];
	public ArrayList<Pair> minadas = new ArrayList<Pair>();

	public Material queMaterial(){
		Material miMaterial = Material.CACA;
		int numMaterial = rand.nextInt((5 -1)+1);
		if (numMaterial == 0) miMaterial = Material.DIAMANTE;
		else if (numMaterial == 1) miMaterial = Material.ORO;
		else if (numMaterial == 2) miMaterial = Material.PLATA;
		else if (numMaterial == 3) miMaterial = Material.NADA;

		return miMaterial;
	}

	public Tablero(){
		for (int i = 0; i < this.filas; i++){
			for (int j = 0; j < this.columnas; j++){
				this.mina[i][j] = queMaterial();
			}
		}
	}

	public void imprimeTablero(){
		System.out.print("---------------------\n");
		for (int i = 0; i < this.filas; i++){
			System.out.print("|");
			for (int j = 0; j < this.columnas; j++){
				Pair miPair = new Pair(i,j);
				if (!compruebaMinadas(miPair)) System.out.print("   |");
				else System.out.print(" "+this.mina[i][j].getMarca()+" |");
			}
			System.out.print("\n---------------------\n");
		}
	}

/*	public void imprimeMinadas(){
		for (int k = 0; k < this.minadas.size(); k++){
			System.out.print(this.minadas.get(k).f);
			System.out.print(this.minadas.get(k).c);
			System.out.print("_");
		}
	}*/

	public boolean compruebaMinadas(Pair miCasilla){
		boolean salida = false;
		for (int k = 0; k < this.minadas.size(); k++){
			if (miCasilla.f == this.minadas.get(k).f && miCasilla.c == this.minadas.get(k).c) salida = true;
		}
		return salida;
	}

	public boolean coordenadasValidas(Pair misCoordenadas){
		boolean salida = true;
		if (misCoordenadas.f < 0 || misCoordenadas.f > this.filas-1 || misCoordenadas.c < 0 || misCoordenadas.c > this.columnas-1){
			salida = false;
			System.out.print("coordenadas fuera de rango.");
		}
		return salida;
	}

}