package practicaSecuenciales.generadorDeRutinasDeEjercicios;
import javax.swing.*;
public class main {
    public static void main(String[] args) {

            String condFisica;

            condFisica = JOptionPane.showInputDialog("Cual es su condicion fisica?\nElija entre Principiante, Intermedio o Avanzado");
            condFisica = condFisica.toLowerCase();

            switch (condFisica) {
                case "principiante":
                    System.out.printf("\nYa que sos %s, te sugiero lo sieguiente:\n", condFisica);
                    System.out.print("Día Lunes: Cuerpo superior (30 min)\n" + //
                            "Calentamiento: 5 minutos de estiramientos dinámicos\n" + //
                            "Flexiones modificadas (rodillas en el suelo): 3 series de 10 repeticiones\n" + //
                            "Remo con bandas elásticas: 3 series de 12 repeticiones\n" + //
                            "Press de hombros con mancuernas: 3 series de 12 repeticiones\n" + //
                            "Planchas: 3 series de 20 segundos\n\n" + //
                            "Día Miercoles: Piernas y glúteos (35 min)\n" + //
                            "Calentamiento: 5 minutos de caminata rápida\n" + //
                            "Sentadillas con el peso corporal: 3 series de 15 repeticiones\n" + //
                            "Puentes de glúteos: 3 series de 15 repeticiones\n" + //
                            "Estocadas alternadas: 3 series de 10 repeticiones por pierna\n" + //
                            "Pantorrillas de pie: 3 series de 20 repeticiones\n\n" + //
                            "Día Viernes: Cardio y core (40 min)\n" + //
                            "Calentamiento: 5 minutos de marcha en el lugar\n" + //
                            "Caminar o trotar ligero: 20 minutos\n" + //
                            "Abdominales básicos: 3 series de 12 repeticiones\n" + //
                            "Elevaciones de piernas acostado: 3 series de 10 repeticiones\n" + //
                            "Plancha lateral: 3 series de 20 segundos por lado\n\n" + //
                            "Día Domingo: Full body y movilidad (35 min)\n" + //
                            "Calentamiento: 5 minutos de saltos suaves\n" + //
                            "Burpees: 3 series de 8 repeticiones\n" + //
                            "Flexiones: 3 series de 10 repeticiones\n" + //
                            "Sentadillas: 3 series de 15 repeticiones\n" + //
                            "Estiramientos estáticos: 10 minutos (para todo el cuerpo)\n" + //
                            "");
                    break;
                case "intermedio":
                    System.out.printf("\nYa que sos %s, te sugiero lo sieguiente:\n", condFisica);
                    System.out.print("Día Lunes: Cuerpo superior (45 min)\n" + //
                            "Calentamiento: 5 minutos de estiramientos dinámicos\n" + //
                            "Flexiones estándar: 4 series de 12 repeticiones\n" + //
                            "Remo con mancuernas o barra: 4 series de 12 repeticiones\n" + //
                            "Press de hombros con mancuernas: 4 series de 10 repeticiones\n" + //
                            "Plancha con elevación de pierna: 3 series de 30 segundos\n\n" + //
                            "Día Martes: Piernas y glúteos (50 min)\n" + //
                            "Calentamiento: 5 minutos de salto de cuerda\n" + //
                            "Sentadillas con mancuernas: 4 series de 12 repeticiones\n" + //
                            "Estocadas caminando con peso: 4 series de 10 repeticiones por pierna\n" + //
                            "Peso muerto rumano: 3 series de 12 repeticiones\n" + //
                            "Pantorrillas de pie con peso: 4 series de 20 repeticiones\n\n" + //
                            "Día Jueves: Cardio HIIT (45 min)\n" + //
                            "Calentamiento: 5 minutos de trote ligero\n" + //
                            "Sprints (intervalos de 20 segundos de sprint y 40 segundos de descanso): 15 minutos\n" + //
                            "Jumping jacks: 3 series de 50 repeticiones\n" + //
                            "Mountain climbers: 3 series de 20 repeticiones\n" + //
                            "Plancha con saltos de pies: 3 series de 30 segundos\n\n" + //
                            "Día Viernes: Cuerpo inferior y core (45 min)\n" + //
                            "Calentamiento: 5 minutos de marcha rápida\n" + //
                            "Sentadillas profundas: 4 series de 15 repeticiones\n" + //
                            "Peso muerto con mancuernas: 3 series de 12 repeticiones\n" + //
                            "Elevaciones de pierna: 3 series de 15 repeticiones\n" + //
                            "Abdominales en bicicleta: 3 series de 20 repeticiones\n\n" + //
                            "Día Domingo: Yoga y movilidad (40 min)\n" + //
                            "Yoga de 40 minutos (centrado en la flexibilidad y la movilidad general)");
                    break;
                case "avanzado":
                    System.out.printf("\nYa que sos %s, te sugiero lo sieguiente:\n", condFisica);
                    System.out.print("Día Lunes: Cuerpo superior (60 min)\n" + //
                            "Calentamiento: 5 minutos de estiramientos dinámicos\n" + //
                            "Press de banca: 4 series de 8-10 repeticiones\n" + //
                            "Remo con barra: 4 series de 8-10 repeticiones\n" + //
                            "Dominadas: 4 series de 8-10 repeticiones\n" + //
                            "Fondos en paralelas: 4 series de 12 repeticiones\n" + //
                            "Plancha con toque de hombro: 3 series de 40 segundos\n\n" + //
                            "Día Martes: Piernas (60-70 min)\n" + //
                            "Calentamiento: 5 minutos de bicicleta estática\n" + //
                            "Sentadillas con barra: 4 series de 8-10 repeticiones\n" + //
                            "Peso muerto: 4 series de 8-10 repeticiones\n" + //
                            "Prensa de piernas: 4 series de 10 repeticiones\n" + //
                            "Zancadas con peso: 4 series de 10 repeticiones por pierna\n\n" + //
                            "Día Miercoles: Cardio HIIT y core (60 min)\n" + //
                            "Calentamiento: 5 minutos de trote\n" + //
                            "Sprints (30 segundos sprint, 30 segundos descanso): 20 minutos\n" + //
                            "Burpees: 4 series de 15 repeticiones\n" + //
                            "Mountain climbers: 4 series de 20 repeticiones\n" + //
                            "Elevaciones de pierna colgado: 4 series de 15 repeticiones\n" + //
                            "Plancha con rotación: 4 series de 40 segundos\n\n" + //
                            "Día Jueves: Cuerpo completo (60 min)\n" + //
                            "Calentamiento: 5 minutos de saltos de cuerda\n" + //
                            "Sentadillas con salto: 4 series de 15 repeticiones\n" + //
                            "Flexiones: 4 series de 12 repeticiones\n" + //
                            "Dominadas: 4 series de 10 repeticiones\n" + //
                            "Zancadas alternadas con salto: 3 series de 15 repeticiones por pierna\n\n" + //
                            "Día Viernes: Cuerpo superior y core (60 min)\n" + //
                            "Press de banca inclinado: 4 series de 10 repeticiones\n" + //
                            "Remo con barra: 4 series de 10 repeticiones\n" + //
                            "Dominadas con peso: 4 series de 8 repeticiones\n" + //
                            "Flexiones con palmada: 3 series de 15 repeticiones\n" + //
                            "Plancha con levantamiento de pierna: 3 series de 1 minuto\n\n" + //
                            "Día Sabado: Movilidad y estiramientos (60 min)\n" + //
                            "Yoga o estiramientos intensivos (centrado en movilidad, flexibilidad y recuperación muscular)");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion erronea o mal escrita");
                    break;

        }
    }
}
