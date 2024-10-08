package practicaSecuenciales.calculadoraDeCaloriasQuemadas;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su peso en kg:");
        float peso = leer.nextFloat();

        System.out.print("Que ejercicio realizo?\nIngrese el numero de la opcion correspondiente:\n" +
                "1)Correr\n2)Nadar\n3)Bicicleta\n");
        int ejercicio = leer.nextInt();

        System.out.println("¿Cuántos minutos duró?");
        float minutos = leer.nextInt();

        //MET es el valor estimado de gasto energetico para cierta actividad

        switch (ejercicio) {
            case 1:
                float calorias, METc = 8.3f;
                calorias = METc * peso * (minutos / 60);
                System.out.println("La cantidad de calorias quemadas por correr es: " + calorias);
                break;
            case 2:
                float METn = 6.0f;
                calorias = METn * peso * (minutos / 60);
                System.out.println("La cantidad de calorias quemadas por nadar es: " + calorias);
                break;
            case 3:
                float METb = 8.0f;
                calorias = (minutos / 60) * METb * peso;
                System.out.println("La cantidad de calorias quemadas por nadar es:  " + calorias);
                break;
            default:
                break;
        }

    }
}
