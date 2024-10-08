package practicaCondicionales.calculadoraDeIMC;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaracion de variables
        float peso, altura, IMC;

        //Pedido de datos
        System.out.print("Ingrese su peso: ");
        peso = leer.nextFloat();
        System.out.print("Ingrese su altura: ");
        altura = leer.nextFloat();

        IMC = peso / (altura * altura);
        System.out.print("Tu IMC es:");
        System.out.printf(" %.1f%n", IMC);
        if (IMC < 18.5){
            System.out.println("Estas por debajo del índice de masa corporal");
        } else if (IMC > 18.5 && IMC < 24.9) {
            System.out.println("Estas en un peso saludable");
        } else if (IMC > 25 && IMC < 29.9) {
            System.out.println("Tenes sobrepeso");
        } else{
            System.out.println("Tenes obesidad");
        }
    }
}
