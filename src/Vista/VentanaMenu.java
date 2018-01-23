package Vista;

import Controlador.EventoMenu;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaMenu extends JFrame {

    private List<JButton> botonList;
    private JPanel panel;
    private JPanel panelMenu;
    private JPanel panelPresentacion;
    private JPanel panelJuego;

    JButton botonIniciar;

    ImageIcon PacmanGif;
    ImageIcon imagenFondoPres;
    ImageIcon imagenFondoMenu;
    ImageIcon imagenFondoJuego;

    JLabel fondoPresentacion;
    JLabel fondoPresentacion2;
    JLabel fondoMenu;
    JLabel fondoJuego;

    int matris[][];//es una matriz logica para realizar cambios, y otra de imagen en donde se muestran esos cambios
    JLabel matrizl[][];
    JLabel nombre;
    JLabel records;//para mostrar la puntuacion con cada pedazo de comida que come Pac-Man
    String jugador;
    String puntos;

    public VentanaMenu() {
        super("PACMAN-Menu");
        this.menu();
        this.setVisible(true);
        this.setSize(700, 700);
        this.setLocation(650, 210);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void menu() {
        panelMenu = new JPanel();
        panelMenu.setLayout(null);
        panelMenu.setBounds(0, 0, this.getWidth(), this.getHeight());
        panelMenu.setVisible(true);

        fondoMenu = new JLabel();
        fondoMenu.setBounds(0, 0, this.getWidth(), this.getHeight());
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/PACMAN_Menu.png"));
        imagenFondoMenu = new ImageIcon(retValue);
        imagenFondoPres = new ImageIcon(imagenFondoMenu.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT));
        fondoMenu.setIcon(imagenFondoMenu);
        fondoMenu.setVisible(true);
        panelMenu.add(fondoMenu);

        this.botonList = new ArrayList<JButton>();

        this.botonList.add(new JButton("JUGAR"));
        this.botonList.get(0).setForeground(Color.white);
        this.botonList.get(0).setBounds(240, 230, 200, 40);
        this.botonList.get(0).setBackground(Color.blue);
        this.botonList.get(0).setVisible(true);

        this.botonList.add(new JButton("RECORDS"));
        this.botonList.get(1).setForeground(Color.white);
        this.botonList.get(1).setBounds(240, 280, 200, 40);
        this.botonList.get(1).setBackground(Color.blue);
        this.botonList.get(1).setVisible(true);

        this.botonList.add(new JButton("SALIR"));
        this.botonList.get(2).setForeground(Color.white);
        this.botonList.get(2).setBounds(240, 330, 200, 40);
        this.botonList.get(2).setBackground(Color.blue);
        this.botonList.get(2).setVisible(true);

        this.botonList.get(0).addActionListener(new EventoMenu(this));
        //this.botonList.get(1).addActionListener(new EventoMenu(this));
        this.botonList.get(2).addActionListener(new EventoMenu(this));

        fondoMenu.add(this.botonList.get(0));
        fondoMenu.add(this.botonList.get(1));
        fondoMenu.add(this.botonList.get(2));

        this.add(panelMenu);

        /*jugador = JOptionPane.showInputDialog(ventana, "NOmbre del jugador", "Escribe aqui");
                while (jugador == null || jugador.compareTo("Escribe aqui") == 0 || jugador.compareTo("") == 0) {
                    jugador = JOptionPane.showInputDialog(ventana, "Ingrese un usuario", "Escribe aqui");
                }
                jugar();*/
    }

    public JPanel getPanelJuego() {
        return panelJuego;
    }

    public void setPanelJuego(JPanel panelJuego) {
        this.panelJuego = panelJuego;
    }

    public JLabel getFondoJuego() {
        return fondoJuego;
    }

    public void setFondoJuego(JLabel fondoJuego) {
        this.fondoJuego = fondoJuego;
    }

    public ImageIcon getImagenFondoJuego() {
        return imagenFondoJuego;
    }

    public void setImagenFondoJuego(ImageIcon imagenFondoJuego) {
        this.imagenFondoJuego = imagenFondoJuego;
    }

    public int[][] getMatris() {
        return matris;
    }

    public void setMatris(int[][] matris) {
        this.matris = matris;
    }

    public JLabel[][] getMatrizl() {
        return matrizl;
    }

    public void setMatrizl(JLabel[][] matrizl) {
        this.matrizl = matrizl;
    }

    public JLabel getNombre() {
        return nombre;
    }

    public void setNombre(JLabel nombre) {
        this.nombre = nombre;
    }

    public JLabel getRecords() {
        return records;
    }

    public void setRecords(JLabel records) {
        this.records = records;
    }

    public String getPuntos() {
        return puntos;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }

    public JPanel getPanelPresentacion() {
        return panelPresentacion;
    }

    public void setPanelPresentacion(JPanel panelPresentacion) {
        this.panelPresentacion = panelPresentacion;
    }

    public JButton getBotonIniciar() {
        return botonIniciar;
    }

    public void setBotonIniciar(JButton botonIniciar) {
        this.botonIniciar = botonIniciar;
    }

    public JLabel getFondoPresentacion() {
        return fondoPresentacion;
    }

    public void setFondoPresentacion(JLabel fondoPresentacion) {
        this.fondoPresentacion = fondoPresentacion;
    }

    public JLabel getFondoPresentacion2() {
        return fondoPresentacion2;
    }

    public void setFondoPresentacion2(JLabel fondoPresentacion2) {
        this.fondoPresentacion2 = fondoPresentacion2;
    }

    public ImageIcon getPacmanGif() {
        return PacmanGif;
    }

    public void setPacmanGif(ImageIcon PacmanGif) {
        this.PacmanGif = PacmanGif;
    }

    public ImageIcon getImagenFondoPres() {
        return imagenFondoPres;
    }

    public void setImagenFondoPres(ImageIcon imagenFondoPres) {
        this.imagenFondoPres = imagenFondoPres;
    }

    public JPanel getPanelMenu() {
        return panelMenu;
    }

    public void setPanelMenu(JPanel panelMenu) {
        this.panelMenu = panelMenu;
    }

    public List<JButton> getBotonList() {
        return botonList;
    }

    public void setBotonList(List<JButton> botonList) {
        this.botonList = botonList;
    }

    public JLabel getFondoMenu() {
        return fondoMenu;
    }

    public void setFondoMenu(JLabel fondoMenu) {
        this.fondoMenu = fondoMenu;
    }

    public ImageIcon getImagenFondoMenu() {
        return imagenFondoMenu;
    }

    public void setImagenFondoMenu(ImageIcon imagenFondoMenu) {
        this.imagenFondoMenu = imagenFondoMenu;
    }

}
