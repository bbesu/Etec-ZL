/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recup11;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Recup11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      
        String opcao = JOptionPane.showInputDialog(null,"Escolha uma fruta: \n"
                + "\n 1- maca"
                + "\n 2- banana"
                + "\n 3- pera");
        
        
        
        switch (opcao){
           case "1":
                JOptionPane.showMessageDialog(null, "maca");
            break;
            case "2":
                JOptionPane.showMessageDialog(null,"banana");
            break;
            case "3":
                JOptionPane.showMessageDialog(null,"pera");
            break;
             default:
                JOptionPane.showMessageDialog(null,"opcao invalida");
            break;
    }
    }
    
}
