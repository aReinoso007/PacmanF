package Vista;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Alex Reinoso
 */
public class VentanaJuego {

    JFrame ventana;
    //Presentacion
    JPanel panelPresentacion;
    JButton botonIniciar;
    JLabel fondoPresentacion;
    JLabel PacmanGif;
    ImageIcon imagenFondoPres;

    //menu del juego
    JPanel panelMenu;
    JButton botones[];
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

    public VentanaJuego() {
        ventana = new JFrame("PACMAN");
        ventana.setSize(700, 700);
        ventana.setLayout(null);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelPresentacion = new JPanel();
        panelPresentacion.setLayout(null);
        panelPresentacion.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
        panelPresentacion.setVisible(true);
        panelPresentacion.setBackground(Color.red);

        botonIniciar = new JButton("Iniciar");

        botonIniciar.setBounds(ventana.getWidth() - 120, 20, 100, 30);
        botonIniciar.setVisible(true);
        botonIniciar.setBackground(Color.white);
        panelPresentacion.add(botonIniciar, 0);

        fondoPresentacion = new JLabel();
        fondoPresentacion.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/PACMAN_Inicio.png"));
        imagenFondoPres = new ImageIcon(retValue);
        imagenFondoPres = new ImageIcon(imagenFondoPres.getImage().getScaledInstance(ventana.getWidth(), ventana.getHeight(), Image.SCALE_DEFAULT));
        fondoPresentacion.setIcon(imagenFondoPres);
        fondoPresentacion.setVisible(true);
        panelPresentacion.add(fondoPresentacion, 0);

        PacmanGif = new JLabel();
        PacmanGif.setBounds(350, 320, ventana.getWidth(), ventana.getHeight());

        PacmanGif.setIcon(new ImageIcon("Imagenes/pacman.gif"));
        PacmanGif.getBackground();
        PacmanGif.setVisible(true);

        panelPresentacion.add(PacmanGif);
        //menu.. para dar memoria a los botones
        botones = new JButton[3];//vector de 5 botones
        for (int i = 0; i < botones.length; i++) {
            botones[i] = new JButton();
        }

        botonIniciar.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                System.out.println("Iniciar");
                menu();
            }
        });

        ventana.add(panelPresentacion, -1);//montar en la ventana, como capa externa

        ventana.setVisible(true);
    }

    public void menu() {

        panelPresentacion.setVisible(false);
        panelMenu = new JPanel();
        panelMenu.setLayout(null);
        panelMenu.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
        panelMenu.setVisible(true);

        fondoMenu = new JLabel();
        fondoMenu.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/PACMAN_Menu.png"));
        imagenFondoMenu = new ImageIcon(retValue);
        imagenFondoPres = new ImageIcon(imagenFondoMenu.getImage().getScaledInstance(ventana.getWidth(), ventana.getHeight(), Image.SCALE_DEFAULT));
        fondoMenu.setIcon(imagenFondoMenu);
        fondoMenu.setVisible(true);
        panelMenu.add(fondoMenu, 0);

        botones[0].setText("JUGAR");
        botones[0].setForeground(Color.white);
        botones[1].setText("RECORDS");
        botones[1].setForeground(Color.white);
        botones[2].setText("SALIR");
        botones[2].setForeground(Color.white);

        for (int i = 0; i < botones.length; i++) {
            botones[i].setBounds(ventana.getWidth() - (400 + 50), (i + 4) * 50, 200, 40);
            botones[i].setVisible(true);
            botones[i].setBackground(Color.blue);
            panelMenu.add(botones[i], 0);
        }
        ventana.add(panelMenu);

        botones[0].addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                System.out.println("JUGAR");
                jugador = JOptionPane.showInputDialog(ventana, "NOmbre del jugador", "Escribe aqui");
                while (jugador == null || jugador.compareTo("Escribe aqui") == 0 || jugador.compareTo("") == 0) {
                    jugador = JOptionPane.showInputDialog(ventana, "Ingrese un usuario", "Escribe aqui");
                }
                jugar();
                //fondojuegp
            }
        });

        botones[1].addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                System.out.println("RECORDS");
                //teblaBASE_DE_DATOS
            }
        });

        botones[2].addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                System.err.println("SALIR");
                System.exit(0);
            }
        });
    }//fin del menu

    public void jugar() {

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
