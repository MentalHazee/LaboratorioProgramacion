package practicaCondicionales.recomendacionDeLibros;
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {

        String[] opciones = {"1) Fantasía", "2) Misterio", "3) Romance", "4) Ciencia Ficción"};

        int seleccion = JOptionPane.showOptionDialog(null, "Elije tu género favorito: ",
                "Menu de opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, opciones, opciones[0]);

        switch (seleccion){
            case 0:
                JOptionPane.showMessageDialog(null, "Canción de Hielo y Fuego, GEORGE R. R. MARTIN");
                break;

            case 1:
                JOptionPane.showMessageDialog(null, "El Código Da Vinci, DAN BROWN");
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Rayuela, JULIO CORTÁZAR");
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Trilogía de la Fundación, ISAAC ASIMOV");
                break;
        }

    }

}
