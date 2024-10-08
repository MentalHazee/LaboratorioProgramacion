package practicaSecuenciales.horoscopo;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("\nGENERADOR DE HORÓSCOPO");
        System.out.println("Por favor ingrese su fecha de nacimiento en formato (dd/MM/aaaa): ");

        String fecha = leer.nextLine();

        String[] partes = fecha.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);

        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)){

            System.out.println("\nACUARIO");
            System.out.println("Amor: Prepárese, ya que pronto la pasión entrará nuevamente a su vida. Restaure el " +
                "tiempo perdido con su pareja y disfrute de una noche en algún lugar de su agrado." +
                "\n" +
                "Riqueza: Su familia transitará un clima tenso por diferentes cuestiones de dinero. Serénense y " +
                "busquen juntos la solución al problema que están transitando." +
                "\n" +
                "Bienestar: Colabore en algún acontecimiento social. Asista a esa invitación que le hicieron y " +
                "demuestre su verdadera solidaridad con la gente que tanto lo necesita.");

        } else if ((mes == 2 && dia >= 19) || (mes == 2 && dia <= 18)) {

            System.out.println("\nPISCIS");
            System.out.println("Amor: Momento para pensar más en si mismo. Si se encuentra sin pareja, espere " +
                    "a que aparezca esa persona exacta y que lo haga feliz en el amor. No se apure." +
                    "\n" +
                    "Riqueza: Deje de quejarse y arriésguese a cambiar de trabajo, ya que cuenta con las " +
                    "influencias positivas para emprender la tarea. Si lo hace, no se arrepentirá." +
                    "\n" +
                    "Bienestar: Busque actividades que lo relajen y lo desconecten de las obligaciones " +
                    "cotidianas que vive. Si no lo hace, podría sufrir una crisis emocional y física.");

        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {

            System.out.println("\nARIES");
            System.out.println("Amor: Descubrirá la paz en su corazón. Será un gran día para un encuentro " +
                    "afectivo con ese familiar que hace tanto que no ve a causa de sus obligaciones." +
                    "\n" +
                    "Riqueza: Aunque este convencido que se merece un aumento, espere el momento apropiado " +
                    "para manifestarlo. Como sabe su jefe no esta transitando un buen momento." +
                    "\n" +
                    "Bienestar: En las noches, debería compensar su esfuerzo diario con algunos momentos " +
                    "de paz. Intente despreocuparse de las obligaciones cuando llegue a su hogar.");

        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {

            System.out.println("\nTAURO");
            System.out.println("Amor: Si pretende que funcione mejor las cosas con su alma gemela, debería empezar" +
                    " a exponer los sentimientos que realmente siente y no los oculte más." +
                    "\n" +
                    "Riqueza: Defina bien su objetivo antes de poner en practica. De esta forma, pronto mejorarán " +
                    "los ingresos económicos y le permitirán una mejor calidad de vida." +
                    "\n" +
                    "Bienestar: Haga cambios significativos a su estado físico pero trate que no le exijan " +
                    "demasiados esfuerzos a su cuerpo. Busque alguna actividad que le agrade.");

        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {

            System.out.println("\nGÉMINIS");
            System.out.println("Amor: Reflexione bien si realmente desea terminar una relación de tantos años. " +
                    "La reconciliación podría ser lo mejor para ambos. Tómense el tiempo para hablar y encontrar " +
                    "una solución a los problemas." +
                    "\n" +
                    "Riqueza: Si no logra finalizar sus tareas, recuerde que ese compañero de trabajo siempre " +
                    "está dispuesto a ayudar. No dude en llamarlo y pedirle una mano." +
                    "\n" +
                    "Bienestar: Enfóquese en actividades que lo gratifiquen en estos momentos. Esté atento a " +
                    "su bienestar psicofísico y evite preocuparse por cosas innecesarias.");

        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {

            System.out.println("\nCÁNCER");
            System.out.println("Amor: Deje de lado el orgullo y el ego para disfrutar plenamente de" +
                    " la compañía de su pareja. Aunque le cueste, intente ser más compañero y cercano en la relación." +
                    "\n" +
                    "Riqueza: Si ha terminado sus tareas laborales y dispone de tiempo extra, aprovéchelo " +
                    "de manera productiva. Puede adelantar trabajo para la semana y estar más relajado después." +
                    "\n" +
                    "Bienestar: Use su tiempo libre para recrearse y estimularse con nuevas actividades." +
                    " Explore algo que le guste en la web y anímese a probarlo.");

        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {

            System.out.println("\nLEO");
            System.out.println("Amor: Valore a su pareja antes de que sea tarde. Tómese un momento para " +
                    "reflexionar en soledad y pregúntese en qué podría estar fallando, para así mejorar la relación." +
                    "\n" +
                    "Riqueza: Nuevos proyectos profesionales surgirán, los cuales beneficiarán su " +
                    "economía. Manténgase prudente y, con paciencia, logrará alcanzar los objetivos deseados." +
                    "\n" +
                    "Bienestar: Es un buen momento para atreverse a hacer algunos cambios. Romper con sus" +
                    " estructuras le ayudará a encontrar el equilibrio que ha estado buscando en su vida.");

        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {

            System.out.println("\nVIRGO");
            System.out.println("Amor: Revise algunas situaciones pendientes con su familia que " +
                    "vienen de hace meses. Si no lo hace, podría desembocar en una discusión. Llámelos y " +
                    "hablen sobre el tema." +
                    "\n" +
                    "Riqueza: Procure establecer relaciones laborales satisfactorias para alcanzar sus metas." +
                    " Es importante asociarse con personas que le transmitan seguridad y confianza." +
                    "\n" +
                    "Bienestar: Si en este día no se siente bien anímicamente, no se preocupe demasiado. " +
                    "Será algo temporal que, con el tiempo, desaparecerá.");

        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {

            System.out.println("\nLIBRA");
            System.out.println("Amor: Aunque se sienta abrumado por las demandas de su pareja, quédese a su " +
                    "lado. Recuerde que en otras ocasiones ella ha estado ahí para apoyarlo cuando lo ha necesitado." +
                    "\n" +
                    "Riqueza: Disfrute de la tranquilidad en el ambiente laboral durante esta jornada. Aproveche " +
                    "el tiempo para organizar las tareas que tiene pendientes desde hace varios días." +
                    "\n" +
                    "Bienestar: Dedique un momento a la reflexión profunda y espiritual. Cree un ambiente" +
                    " relajante en su hogar con música suave, ya que será una noche ideal para el descanso y la paz.");

        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {

            System.out.println("\nESCORPIO");
            System.out.println("Amor: No permita que una tontería arruine una amistad de tantos años. Sea " +
                    "maduro y tome la iniciativa de contactarse con ese amigo para resolver el malentendido." +
                    "\n" +
                    "Riqueza: En lo financiero, es momento de asumir más responsabilidades. Arme su valor " +
                    "y busque nuevos proyectos en los que pueda involucrarse y ejecutarlos con éxito." +
                    "\n" +
                    "Bienestar: Fortalezca sus músculos mediante el ejercicio y una buena dieta. Rompa " +
                    "con el sedentarismo y busque alguna rutina en línea que se ajuste a sus " +
                    "necesidades y estilo de vida.");

        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {

            System.out.println("\nSAGITARIO");
            System.out.println("Amor: Aléjese de las personas envidiosas que intentan dañar su relación" +
                    " amorosa. Ya es hora de tomar distancia de quienes resultan tóxicos para su bienestar." +
                    "\n" +
                    "Riqueza: Esté preparado, ya que podría tener una discusión con su jefe por" +
                    " algún descuido. Concéntrese más en sus responsabilidades laborales para evitar" +
                    " repetir el error." +
                    "\n" +
                    "Bienestar: Esa molestia física que lleva sintiendo hace días podría estar relacionada " +
                    "con el estrés. Intente relajarse, vea alguna película y trate de despejar su mente.");

        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {

            System.out.println("\nCAPRICORNIO");
            System.out.println("Amor: Controle su vocabulario, ya que una palabra fuera de lugar podría " +
                    "desencadenar una discusión inesperada con su pareja. Sea más cuidadoso al comunicarse." +
                    "\n" +
                    "Riqueza: Aunque dude de sus habilidades, acepte el cargo que le ofrecen en su empresa." +
                    " Recuerde que si lo eligieron es porque confían en su capacidad para ejercerlo." +
                    "\n" +
                    "Bienestar: Este es un buen momento para conectarse con su inconsciente y empezar" +
                    " a confiar más en los demás. Si enfrenta problemas, no dude en compartirlos" +
                    " con sus seres queridos.");

        }else {
            System.out.println("La fecha ingresada es incorrecta");
        }


    }
}
