/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoalfa;

import javax.swing.JOptionPane;

/**
 *
 * @author plago-bergonpazos
 */
public class Proyectoalfa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      float base, altura;
         
    String resposta = JOptionPane.showInputDialog("Base=");
    base= Float.parseFloat(resposta);
    JOptionPane.showMessageDialog(null,"Base="+base);
    
    String resposta1= JOptionPane.showInputDialog("Altura=");
    altura= Float.parseFloat(resposta1);
    JOptionPane.showMessageDialog(null,"Altura="+altura);
    
    JOptionPane.showMessageDialog(null,"Area="+base*altura/2);
    
    }
    
}

  