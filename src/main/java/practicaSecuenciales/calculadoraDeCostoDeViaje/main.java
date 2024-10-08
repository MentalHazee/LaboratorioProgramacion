package practicaSecuenciales.calculadoraDeCostoDeViaje;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

                Scanner leer = new Scanner(System.in);
                //Declaracion de variables

                float precio_comb_litro, litr_comb, dist_viaje_kil;

                //Pedido de datos
                System.out.println("¿Cuanta distancia en KM hiciste en el viaje? ");
                dist_viaje_kil = leer.nextFloat();
                System.out.println("¿Cuanto combustible consumiste por cada KM en Litros? ");
                litr_comb = leer.nextFloat();
                System.out.println("¿Cual era el precio del combustible por litro? ");
                precio_comb_litro = leer.nextFloat();

                System.out.println("Recorriste " + dist_viaje_kil + " KM");
                System.out.println("Consumiste " + litr_comb + "Litros de combustible");
                System.out.println("Pagaste el litro de combustible a $" + precio_comb_litro);
                System.out.println("En total gastaste $" + (litr_comb * dist_viaje_kil * precio_comb_litro));

    }
}
