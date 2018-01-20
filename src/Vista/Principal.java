/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Alex Reinoso
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        VentanaPrincipal vPrin = new VentanaPrincipal();
        vPrin.IniciaComponente();
        VentanaJuego vJuego = new VentanaJuego();
        vJuego.menu();
        vJuego.jugar();
    }
    
}
