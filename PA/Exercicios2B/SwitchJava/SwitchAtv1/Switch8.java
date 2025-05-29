/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switch8;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Switch8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         String fase = JOptionPane.showInputDialog(null,"Informe o numero da fase concluida:");
       
       switch (fase) {
            case "1":
                JOptionPane.showMessageDialog(null,"Sua pontuacao e 1");
            break;
            case "2":
                JOptionPane.showMessageDialog(null,"Sua pontuacao e 2");
            break;
            case "3":
                JOptionPane.showMessageDialog(null,"Sua pontuacao e 3");
            break;
            case "4":
                JOptionPane.showMessageDialog(null,"Sua pontuacao e 4");
            break;
            case "5":
                JOptionPane.showMessageDialog(null,"Sua pontuacao e 5");
            break;
             default:
                JOptionPane.showMessageDialog(null,"Opcao invalida");
            break;
        }
    }       
}
