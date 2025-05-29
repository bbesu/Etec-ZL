/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swexemplo1;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class SwExemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null,"Bem-vindo!");
                String escola = JOptionPane.showInputDialog("Digite o nome da Etec que você estuda \n"
                        + "ETEC ZONA LESTE \n"
                        + "ETEC ITAQUERA \n"
                        + "ETEC SAO PAULO \n");
                
                switch (escola) {
                    case "ETEC ZONA LESTE":
           JOptionPane.showMessageDialog(null,"Voce estuda na Etec Zona Leste");
           break; 
                    case "ETEC ITAQUERA":
           JOptionPane.showMessageDialog(null,"Voce estuda na Etec Itaquera");
           break;
                    case "ETEC SAO PAULO":
           JOptionPane.showMessageDialog(null,"Voce estuda na Etec Sao Paulo");
           break; 
                    default: 
            JOptionPane.showMessageDialog(null,"Opcao Invalida"); 
}                        
    }
    
}
