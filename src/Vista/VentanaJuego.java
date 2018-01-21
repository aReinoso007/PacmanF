
package Vista;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class VentanaJuego extends JFrame
{
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
    
    public VentanaJuego()
    {
        super("PACMAN-Juego");
        this.juego();
        this.setVisible(true);
        this.setSize(700, 700);
        this.setLocation(650, 210);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
    
    public void juego()
    {
        panelPresentacion = new JPanel();
        panelPresentacion.setLayout(null);
        panelPresentacion.setBounds(0, 0, this.getWidth(), this.getHeight());
        panelPresentacion.setVisible(true);
        panelPresentacion.setBackground(Color.red);
        
        fondoPresentacion = new JLabel();
        fondoPresentacion.setBounds(0, 0,683,660);
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/mapa.png"));
        imagenFondoPres = new ImageIcon(retValue);
        imagenFondoPres = new ImageIcon(imagenFondoPres.getImage().getScaledInstance(700,700,0));
        fondoPresentacion.setIcon(imagenFondoPres);
        fondoPresentacion.setVisible(true);
        panelPresentacion.add(fondoPresentacion);
        
        this.add(panelPresentacion);
    }

    public List<JButton> getBotonList() {
        return botonList;
    }

    public void setBotonList(List<JButton> botonList) {
        this.botonList = botonList;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JPanel getPanelMenu() {
        return panelMenu;
    }

    public void setPanelMenu(JPanel panelMenu) {
        this.panelMenu = panelMenu;
    }

    public JPanel getPanelPresentacion() {
        return panelPresentacion;
    }

    public void setPanelPresentacion(JPanel panelPresentacion) {
        this.panelPresentacion = panelPresentacion;
    }

    public JPanel getPanelJuego() {
        return panelJuego;
    }

    public void setPanelJuego(JPanel panelJuego) {
        this.panelJuego = panelJuego;
    }

    public JButton getBotonIniciar() {
        return botonIniciar;
    }

    public void setBotonIniciar(JButton botonIniciar) {
        this.botonIniciar = botonIniciar;
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

    public ImageIcon getImagenFondoMenu() {
        return imagenFondoMenu;
    }

    public void setImagenFondoMenu(ImageIcon imagenFondoMenu) {
        this.imagenFondoMenu = imagenFondoMenu;
    }

    public ImageIcon getImagenFondoJuego() {
        return imagenFondoJuego;
    }

    public void setImagenFondoJuego(ImageIcon imagenFondoJuego) {
        this.imagenFondoJuego = imagenFondoJuego;
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

    public JLabel getFondoMenu() {
        return fondoMenu;
    }

    public void setFondoMenu(JLabel fondoMenu) {
        this.fondoMenu = fondoMenu;
    }

    public JLabel getFondoJuego() {
        return fondoJuego;
    }

    public void setFondoJuego(JLabel fondoJuego) {
        this.fondoJuego = fondoJuego;
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

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public String getPuntos() {
        return puntos;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }
    
}
