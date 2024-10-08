package practicaCondicionales.calculadoraDeDescuentos;
import java.util.Scanner;
public class main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitar el precio del producto
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine();

            // Solicitar la categoría del cliente
            System.out.print("Ingrese la categoría del cliente (estudiante, adulto, jubilado): ");
            String categoria = scanner.nextLine().toLowerCase();

            double descuento = 0;

            // Determinar el descuento según la categoría
            if (categoria.equals("estudiante")) {
                descuento = 0.10;
            } else if (categoria.equals("adulto")) {
                descuento = 0.05;
            } else if (categoria.equals("jubilado")) {
                descuento = 0.15;
            } else {
                System.out.println("Categoría no reconocida.");
                scanner.close();
                return;
            }


            double precioFinal = precio * (1 - descuento);

            // Imprimir el precio final
            System.out.printf("El precio final después del descuento es: %.2f\n", precioFinal);

            scanner.close();
        }


}
