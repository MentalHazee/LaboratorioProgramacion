package practicaSecuenciales.calculadoraIndiceDeFelicidad;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner indice = new Scanner(System.in);

        // factores de felicidad
        System.out.print("nivel de satidfaccion con la vida del 1-10: ");
        int satisfaccion = indice.nextInt();

        System.out.print("nivel de estrés del 1-10: ");
        int esrtes = indice.nextInt();

        System.out.print("nivel de salud del 1-10: ");
        int salud = indice.nextInt();

        // calcular indice
        int indiceFelicidad = (satisfaccion + (10 - esrtes) + salud / 3);

        // mostrar resultado
        System.out.println("Tu indice de felicidad es: " + indiceFelicidad );

        if (indiceFelicidad <= 10) {
            System.out.println("Andá al psicólogo");
        } else if (indiceFelicidad <= 20) {
            System.out.println("Seguí asi amigo vas bien");
        } else if (indiceFelicidad <= 30) {
            System.out.println("Sos único");

        }

    }
}
