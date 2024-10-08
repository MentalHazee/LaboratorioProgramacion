package practicaCondicionales.piedraPapelTijera;
import java.util.Scanner;
import java.util.Random;

    public class main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            // Opciones
            String[] opciones = {"piedra", "papel", "tijera"};

            // Entrada del usuario
            System.out.println("Elige una opción (piedra, papel o tijera): ");
            String eleccionUsuario = scanner.nextLine().toLowerCase();

            // Validación de la entrada
            if (!eleccionUsuario.equals("piedra") && !eleccionUsuario.equals("papel") && !eleccionUsuario.equals("tijera")) {
                System.out.println("Opción no válida.");
                return;
            }

            // Elección aleatoria de la computadora
            String eleccionComputadora = opciones[random.nextInt(3)];

            // Imprimir elección de la computadora
            System.out.println("La computadora eligió: " + eleccionComputadora);

            // Determinar el resultado
            if (eleccionUsuario.equals(eleccionComputadora)) {
                System.out.println("Es un empate.");
            } else if ((eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijera")) ||
                    (eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra")) ||
                    (eleccionUsuario.equals("tijera") && eleccionComputadora.equals("papel"))) {
                System.out.println("¡Ganaste!");
            } else {
                System.out.println("Perdiste.");
            }

            // Cerrar el scanner
            scanner.close();
        }
    }

