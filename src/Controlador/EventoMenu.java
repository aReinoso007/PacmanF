package Controlador;

import Vista.VentanaJuego;
import Vista.VentanaMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoMenu implements ActionListener {

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
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.ventanaMenu.getBotonList().get(0))) {
            this.ventanaMenu.setVisible(false);
            VentanaJuego vm = new VentanaJuego();
            vm.juego();

        } else if (e.getSource().equals(this.ventanaMenu.getBotonList().get(1))) {
            //System.exit(0);
        } else if (e.getSource().equals(this.ventanaMenu.getBotonList().get(2))) {
            System.exit(0);
        }
    }

}
