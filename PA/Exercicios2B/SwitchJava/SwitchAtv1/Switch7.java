/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switch7;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Switch7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String valor = JOptionPane.showInputDialog(null,"Digite o valor de saque dejesado \n"
             + "10 \n"
             + "20 \n"
             + "50 \n"
             + "100 \n");
       
       switch (valor) {
            case "10":
                JOptionPane.showMessageDialog(null,"Obrigado pela preferencia!");
            break;
            case "20":
                JOptionPane.showMessageDialog(null,"Obrigado pela preferencia!");
            break;
            case "50":
                JOptionPane.showMessageDialog(null,"Obrigado pela preferencia!");
            break;
            case "100":
                JOptionPane.showMessageDialog(null,"Obrigado pela preferencia!");
            break;
             default:
                JOptionPane.showMessageDialog(null,"Opcao invalida");
            break;
                       
       }
    }
    
}
