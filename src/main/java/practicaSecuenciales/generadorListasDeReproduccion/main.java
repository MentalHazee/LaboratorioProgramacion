package practicaSecuenciales.generadorListasDeReproduccion;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuál es tu estado de ánimo? (feliz, triste, energico, relajado): ");
        String estadoAnimo = scanner.nextLine().toLowerCase();

        if (estadoAnimo.equals("feliz")) {
            System.out.println("\nLista de reproducción sugerida:");
            System.out.println("- Happy - Pharrell Williams");
            System.out.println("- Can't Stop the Feeling! - Justin Timberlake");
        } else if (estadoAnimo.equals("triste")) {
            System.out.println("\nLista de reproducción sugerida:");
            System.out.println("- Someone Like You - Adele");
            System.out.println("- Fix You - Coldplay");
        } else if (estadoAnimo.equals("energico")) {
            System.out.println("\nLista de reproducción sugerida:");
            System.out.println("- Uptown Funk - Mark Ronson ft. Bruno Mars");
            System.out.println("- Stronger - Kanye West");
        } else if (estadoAnimo.equals("relajado")) {
            System.out.println("\nLista de reproducción sugerida:");
            System.out.println("- Weightless - Marconi Union");
            System.out.println("- Hoja en blanco - Dread Mari");
        } else {
            System.out.println("Estado de ánimo no reconocido.");
        }

        scanner.close();
    }

}
