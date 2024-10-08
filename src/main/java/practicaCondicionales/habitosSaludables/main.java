package practicaCondicionales.habitosSaludables;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("¿Cuántas horas al día duermes?: ");
        int horasSueno = sc.nextInt();

        System.out.print("¿Cuántas horas al día haces ejercicio?: ");
        int horasEjercicio = sc.nextInt();

        System.out.print("¿Cuántas comidas saludables consumes al día?: ");
        int comidasSaludables = sc.nextInt();

        // Evaluar hábitos saludables
        System.out.println("\nEvaluación de tus hábitos saludables:");

        // Evaluar horas de sueño
        if (horasSueno >= 7 && horasSueno <= 9) {
            System.out.println("✔ Buen hábito de sueño: duermes entre 7 y 9 horas.");
        } else if (horasSueno < 7) {
            System.out.println("✘ Duermes poco: deberías dormir más para una mejor salud.");
        } else {
            System.out.println("✘ Duermes demasiado: dormir más de 9 horas no es ideal.");
        }

        // Evaluar horas de ejercicio
        if (horasEjercicio >= 1) {
            System.out.println("✔ Buen hábito de ejercicio: haces ejercicio regularmente.");
        } else {
            System.out.println("✘ No haces suficiente ejercicio: intenta hacer al menos 30 minutos al día.");
        }

        // Evaluar comidas saludables
        if (comidasSaludables >= 3) {
            System.out.println("✔ Buena alimentación: consumes suficientes comidas saludables.");
        } else {
            System.out.println("✘ Poca alimentación saludable: trata de comer más comidas balanceadas.");
        }

        sc.close();
    }
}

