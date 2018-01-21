/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Jugar;
import Vista.VentanaMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Daniel
 */
public class EventoMenu implements MouseListener
{
    private VentanaMenu ventanaMenu;

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
    public void mouseClicked(MouseEvent e) 
    {
        if(e.getSource().equals(this.ventanaMenu.getBotonList().get(0)))
        {
            this.ventanaMenu.setVisible(true);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getSource().equals(this.ventanaMenu.getBotonList().get(0)))
        {
            this.ventanaMenu.setVisible(true);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(e.getSource().equals(this.ventanaMenu.getBotonList().get(1)))
        {
            this.ventanaMenu.setVisible(true);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource().equals(this.ventanaMenu.getBotonList().get(2)))
        {
            //this.ventanaMenu
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource().equals(this.ventanaMenu.getBotonList().get(1)))
        {
            this.ventanaMenu.setVisible(true);
        }
    }

    
}
