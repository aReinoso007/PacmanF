/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Jugar;
import Vista.VentanaJuego;
import Vista.VentanaMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Daniel
 */
public class EventoMenu implements ActionListener
{
    private VentanaMenu ventanaMenu;
    private VentanaJuego ventanaJuego;

    public EventoMenu(VentanaMenu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
    }

    public VentanaMenu getVentanaMenu() {
        return ventanaMenu;
    }

    public void setVentanaMenu(VentanaMenu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource().equals(this.ventanaMenu.getBotonList().get(0)))
        {
            this.ventanaMenu.setVisible(false);
            VentanaJuego vm = new VentanaJuego();
            vm.juego();
            
        }
        else if(e.getSource().equals(this.ventanaMenu.getBotonList().get(1)))
        {
            //System.exit(0);
        }
        else if(e.getSource().equals(this.ventanaMenu.getBotonList().get(2)))
        {
            System.exit(0);
        }
    }

    
}
