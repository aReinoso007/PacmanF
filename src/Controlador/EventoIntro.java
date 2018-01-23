package Controlador;

import Vista.VentanaIntro;
import Vista.VentanaMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoIntro implements ActionListener {

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
        if (e.getSource().equals(this.ventanaIntro.getBotonIniciar())) {
            this.ventanaIntro.setVisible(false);
            VentanaMenu vm = new VentanaMenu();
            vm.menu();
        }
    }

}
