package practicaCondicionales.recomendacionDePeliculas;
import javax.swing.*;
public class main {
    public static void main(String[] args) {

                boolean condicion;
                do {
                    condicion = true;
                    int opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione un genero para recibir una recomendacion de peliculas (Ingrese el numero):\n"
                            +"1)Accion\n2)Comedia\n3)Drama\n4)Ciencia Ficcion"));

                    if (opcion==1) {
                        JOptionPane.showMessageDialog(null, "Acción: Mad Max: Fury Road");
                    }else if (opcion==2) {
                        JOptionPane.showMessageDialog(null, "Comedia: Superbad");
                    }else if (opcion==3) {
                        JOptionPane.showMessageDialog(null, "Drama: The Shawshank Redemption");
                    }else if (opcion==4) {
                        JOptionPane.showMessageDialog(null, "Ciencia Ficción: Blade Runner 2049");
                    }else{
                        JOptionPane.showMessageDialog(null, "Opcion invalida");
                        condicion=false;
                    }
                } while (!condicion);

    }
}
