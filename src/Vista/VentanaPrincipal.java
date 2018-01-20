/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame 
{
    VentanaJuego ventanaJuego;
    JFrame ventana;
    JPanel panelPresentacion;
    JButton botonIniciar;
    JLabel fondoPresentacion;
    JLabel fondoPresentacion2;
    ImageIcon PacmanGif;
    ImageIcon imagenFondoPres;
    JPanel panelMenu;
    JButton botones[];
    JLabel fondoMenu;
    ImageIcon imagenFondoMenu;
    
    
    public void IniciaComponente()
    {
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

        
        fondoPresentacion2 = new JLabel();
        fondoPresentacion2.setBounds(0,120,635,800);
        Image retValue2 = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/pacman.gif"));
        PacmanGif = new ImageIcon(retValue2);
        PacmanGif = new ImageIcon(PacmanGif.getImage().getScaledInstance(900, 150, 0));
        fondoPresentacion2.setIcon(PacmanGif);
        fondoPresentacion2.setVisible(true);
        panelPresentacion.add(fondoPresentacion2, 0);
        
        //menu.. para dar memoria a los botones
        botones = new JButton[3];//vector de 5 botones
        for (int i = 0; i < botones.length; i++) {
            botones[i] = new JButton();
        }

        botonIniciar.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                System.out.println("Iniciar");
                ventanaJuego.menu();
            }
        });

        ventana.add(panelPresentacion, -1);//montar en la ventana, como capa externa

        ventana.setVisible(true);
    }
    
}
