package practicaCondicionales.sistemaDeRecomendacionDeActividades;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean condicion = true;

        while (condicion) {

            System.out.print("Como se siente hoy?\nElija entre feliz, triste, energico o relajado\n");
            String animo = leer.nextLine().toLowerCase();

            if (animo.equals("feliz")) {
                System.out.println("Ya que estas feliz, te recomeindo salir a pasear o hacer una caminata al aire libre");
                break;
            } else if (animo.equals("triste")) {
                System.out.println("Ya que estas triste, te recomiendo escuchar música relajante o ver una película inspiradora");
                break;
            } else if (animo.equals("energico")) {
                System.out.println("Ya que estas energico, te recomiendo hacer ejercicio físico intenso, como correr, practicar un deporte o ir al gimnasio");
                break;
            } else if (animo.equals("relajado")) {
                System.out.println("Ya que estas relajado, te recomiendo leer un libro o practicar meditación");
                break;
            } else {
                System.out.println("Opcion invalida o mal escrita");
            }
        }
    }
}
