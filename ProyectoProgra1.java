/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jorge
 */
public class ProyectoProgra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Menu ab = new Menu(); 
        try {
            ab.MostrarMenu();
        } catch (IOException ex) {
            Logger.getLogger(ProyectoProgra1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
