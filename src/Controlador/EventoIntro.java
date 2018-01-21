
package Controlador;

import Vista.VentanaIntro;
import Vista.VentanaMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Daniel
 */
public class EventoIntro implements ActionListener
{
    private VentanaIntro ventanaIntro;
    private VentanaMenu ventanaMenu;

    public EventoIntro(VentanaIntro ventanaIntro) {
        this.ventanaIntro = ventanaIntro;
    }

    public VentanaIntro getVentanaIntro() {
        return ventanaIntro;
    }

    public void setVentanaIntro(VentanaIntro ventanaIntro) {
        this.ventanaIntro = ventanaIntro;
    }

    public VentanaMenu getVentanaMenu() {
        return ventanaMenu;
    }

    public void setVentanaMenu(VentanaMenu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.ventanaIntro.getBotonIniciar()))
        {
            this.ventanaIntro.setVisible(false);
            VentanaMenu vm = new VentanaMenu();
            vm.menu();
        }
    }
    
    
    
}
