import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int opciones = 0;
        ArrayList<Tarjeta> tarjetas = new ArrayList<>();
        boolean salir = false;

       while(!salir){

           System.out.println("1. Recuperacion");
           System.out.println("2. Subir nota(SI ME AYUDA A APROBAR LO PUEDO INTENTAR HACER)");
           System.out.println("3. Salir");

           System.out.println("Escribe una de las opciones");
           opcion = sc.nextInt();



       if(opcion == 1){
         Scanner recu = new Scanner(System.in);
         boolean preguntas = false;

         while(!preguntas){
           System.out.println("\n1. Crear Tarjeta");
           System.out.println("2. Mostrar tarjetas");
           System.out.println("3. Mostrar tarjeta que vale mas de 1 punto");
           System.out.println("4. Mostrar pregunta aleatoria.");
           System.out.println("5. Examen.");
           System.out.println("6. Volver a menu inicial.\n");

           System.out.println("Que opcion vas a escoger");
           opciones = recu.nextInt();

                        if (opciones == 1) {
                            String preg;
                            String resp;
                            double punt;

                            System.out.println("\nIntroduce la pregunta: ");
                            preg = sc.next();

                            System.out.println("Introduce la respuesta: ");
                            resp = sc.next();

                            System.out.println("Introduce los puntos: ");
                            punt = sc.nextDouble();

                            Tarjeta tarjeta = new Tarjeta(preg, resp, punt);
                            tarjetas.add(tarjeta);

                        } else if (opciones == 2) {
                            System.out.println("\nTodas las tarjetas\n");
                            int contador = 1;
                            for (int i = 0; i < tarjetas.size(); i++) {
                                System.out.println("\nTarjeta " + contador + "");
                                System.out.println("Pregunta: " + tarjetas.get(i).getPregunta() + "\nRespuesta: " + tarjetas.get(i).getRespuesta() + "\nPuntos: " + tarjetas.get(i).getPuntos());
                                contador++;
                            }
                        } else if (opciones == 3) {
                            System.out.println("\nMostrar todas las tarjetas con más de 1 punto\n");
                            int contador = 1;
                            for (int i = 0; i < tarjetas.size(); i++) {
                                if (tarjetas.get(i).getPuntos() > 1) {
                                    System.out.println("\nTarjeta " + contador + "\n");
                                    System.out.println("Pregunta: " + tarjetas.get(i).getPregunta() + "\nRespuesta: " + tarjetas.get(i).getRespuesta() + "\nPuntos: " + tarjetas.get(i).getPuntos());
                                }
                                contador++;
                            }
                        } else if (opciones == 4) {
                            System.out.println("\nPregunta Aleatoria\n");
                            String respuesta;
                            int aleatoria;
                            Random r = new Random();
                            aleatoria = (int) (Math.random() * (tarjetas.size() - 0) + 0);

                            System.out.println(tarjetas.get(aleatoria).getPregunta());
                            sc.nextLine();
                            System.out.println(tarjetas.get(aleatoria).getRespuesta());

                        } else if (opciones == 5) {
                            System.out.println("ESTO EN UN EXAMEN SORPRESA");
                        } else if (opciones == 6) {
                            System.out.println("Volvemos al menu");
                        }
                    }
                } else if (opcion == 2) {

                } else if (opcion == 3) {
                    break;
                }
            }
      }
}
