package practicaSecuenciales.generadorDePlanesDeEstudio;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

                Scanner leer = new Scanner (System.in);

                //pide horas al usuario
                System.out.println("¿cuantas horas al dia puedes estudiar? ");
                int horasestudio = leer.nextInt();

                //definir materias
                String[] materias = {"matematicas", "historia", "lengua"};
                int materia = materias.length;

                //dsitribuir las horas
                System.out.println("plan de estudio semanal: " + (horasestudio / materia) + " por dia.");

    }
}
