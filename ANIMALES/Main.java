

public class Main{
	public static void main(String[] args){

		Pato mengana = new Pato("Ana", "F", "Hierva");
		Gato fulano = new Gato("Juan", "M", "Fruta");
		Gato miGata = new Gato();
		Pato clonMengana = new Pato(mengana);

		System.out.println(mengana.toString());
		System.out.println(mengana.hablar());
		System.out.println(mengana.getComidaFavorita());
		System.out.println(mengana.comer());
		System.out.println(mengana.follar());
		System.out.println(mengana.getEstado());
		System.out.println(mengana.getSexo());
		System.out.println(mengana.acariciar());
		System.out.println(mengana.acariciar());
		System.out.println(mengana.acariciar());
		System.out.println(mengana.acariciar());
		System.out.println(mengana.pegar());
		System.out.println(mengana.pegar());
		System.out.println(mengana.excretar());
		System.out.println(mengana.excretar());
		System.out.println(mengana.excretar());
		System.out.println(mengana.excretar());
		System.out.println(mengana.excretar());
		System.out.println(mengana.getHigiene());
		System.out.println(mengana.limpiar());
		System.out.println(mengana.toString());
		System.out.println(fulano.toString());
		System.out.println(miGata.toString());
		System.out.println(clonMengana.toString());
	}
}
