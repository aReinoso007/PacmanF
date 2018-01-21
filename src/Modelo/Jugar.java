
package Modelo;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jugar 
{
    JFrame ventana;
    //Presentacion
    JPanel panelPresentacion;
    JButton botonIniciar;
    JLabel fondoPresentacion;
    JLabel fondoPresentacion2;
    ImageIcon PacmanGif;
    ImageIcon imagenFondoPres;
    JPanel panelMenu;
    private List<JButton> botonList;
    JLabel fondoMenu;
    ImageIcon imagenFondoMenu;
    JPanel panelJuego;
    JLabel fondoJuego;
    ImageIcon imagenFondoJuego;
    int matris[][];//es una matriz logica para realizar cambios, y otra de imagen en donde se muestran esos cambios
    JLabel matrizl[][];
    JLabel nombre;
    JLabel records;//para mostrar la puntuacion con cada pedazo de comida que come Pac-Man
    String jugador;
    String puntos;
    public void jugar() 
    {

        panelMenu.setVisible(false);
        panelJuego = new JPanel();
        panelJuego.setLayout(null);//
        panelJuego.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());//posicion 0,0 y el tamano de la ventana
        panelJuego.setVisible(true);

        fondoJuego = new JLabel();
        fondoJuego.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());//posicion 0 entre o, y el tamano de ventana
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/PACMAN_Menu.png"));
        imagenFondoJuego = new ImageIcon(retValue);
        imagenFondoJuego = new ImageIcon(imagenFondoMenu.getImage().getScaledInstance(ventana.getWidth(), ventana.getHeight(), Image.SCALE_DEFAULT));
        fondoJuego.setIcon(imagenFondoMenu);
        fondoJuego.setVisible(true);//haciendole al label visible
        panelJuego.add(fondoJuego, 0);

        //vamos a cargar la matriz
        ventana.add(panelJuego);

    }

    public int[][] tablero(int opcion) {//llama una matriz, para los nivelos
        //los 2 son muros, los 1 comida
        int[][] aux1 = new int[15][15];
        if (opcion == 1) {

            int aux[][] = {
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 2},
                {2, 1, 2, 2, 1, 2, 1, 2, 1, 2, 2, 1, 2, 1, 2},
                {2, 1, 2, 1, 1, 2, 2, 2, 1, 2, 1, 1, 1, 1, 2},
                {2, 1, 1, 1, 2, 2, 2, 1, 2, 1, 1, 1, 1, 1, 2},
                {2, 1, 2, 1, 1, 1, 1, 1, 2, 2, 2, 1, 2, 2, 2},
                {2, 1, 2, 2, 1, 2, 2, 1, 1, 2, 2, 1, 1, 1, 2},
                {2, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 2, 1, 2},
                {2, 2, 2, 1, 2, 1, 2, 2, 2, 1, 2, 1, 2, 1, 2},
                {2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2},
                {2, 1, 2, 1, 1, 1, 2, 2, 2, 1, 2, 1, 2, 1, 2},
                {2, 1, 1, 1, 2, 1, 2, 1, 1, 1, 1, 1, 2, 1, 2},
                {2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2},
                {2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},};
            return aux;
        }
        if (opcion == 2) {
            int aux[][] = {
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 2},
                {2, 2, 2, 2, 1, 2, 1, 2, 1, 2, 2, 1, 2, 1, 2},
                {2, 2, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 1, 2},
                {2, 1, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 1, 1, 2},
                {2, 1, 2, 2, 1, 1, 1, 1, 2, 2, 2, 1, 2, 2, 2},
                {2, 1, 2, 2, 1, 2, 2, 1, 1, 2, 2, 1, 1, 1, 2},
                {2, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 2, 1, 2},
                {2, 2, 2, 1, 2, 1, 2, 2, 2, 1, 2, 1, 2, 1, 2},
                {2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2},
                {2, 1, 2, 1, 1, 1, 2, 2, 2, 1, 2, 1, 2, 1, 2},
                {2, 1, 1, 1, 2, 1, 2, 1, 1, 1, 1, 1, 2, 1, 2},
                {2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2},
                {2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},};
            return aux;
        }
        if (opcion == 3) {
            int aux[][] = {
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 2},
                {2, 1, 2, 2, 1, 2, 1, 2, 1, 2, 2, 1, 2, 1, 2},
                {2, 1, 2, 1, 1, 2, 2, 2, 1, 2, 1, 1, 1, 1, 2},
                {2, 1, 1, 1, 2, 2, 2, 1, 2, 1, 1, 1, 1, 1, 2},
                {2, 1, 2, 1, 1, 1, 1, 1, 2, 2, 2, 1, 2, 2, 2},
                {2, 1, 2, 2, 1, 2, 2, 1, 1, 2, 2, 1, 1, 1, 2},
                {2, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 2, 1, 2},
                {2, 2, 2, 1, 2, 1, 2, 2, 2, 1, 2, 1, 2, 1, 2},
                {2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2},
                {2, 1, 2, 1, 1, 1, 2, 2, 2, 1, 2, 1, 2, 1, 2},
                {2, 1, 1, 1, 2, 1, 2, 1, 1, 1, 1, 1, 2, 1, 2},
                {2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2},
                {2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},};
            return aux;
        }
        return aux1;
    }
}
