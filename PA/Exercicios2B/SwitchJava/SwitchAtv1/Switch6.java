/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switch6;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Switch6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       String planeta = JOptionPane.showInputDialog(null,"Digite o planeta:");
       
       switch (planeta) {
            case "VENUS":
                JOptionPane.showMessageDialog(null,"o planeta e ROCHOSO");
            break;
            case "TERRA":
                JOptionPane.showMessageDialog(null,"o planeta e ROCHOSO");
            break;
            case "MARTE":
                JOptionPane.showMessageDialog(null,"o planeta e ROCHOSO");
            break;
            case "MERCURIO":
                JOptionPane.showMessageDialog(null,"o planeta e ROCHOSO");
            break;
            case "JUPITER":
                JOptionPane.showMessageDialog(null,"o planeta e GASOSSO");
            break;
            case "SATURNO":
                JOptionPane.showMessageDialog(null,"o planeta e GASOSSO");
            break;
            case "URANO":
                JOptionPane.showMessageDialog(null,"o planeta e GASOSSO");
            break;
            case "NETUNO":
                JOptionPane.showMessageDialog(null,"o planeta e GASOSSO");
            break;
             default:
                JOptionPane.showMessageDialog(null,"Opcao invalida");
            break;
       
    }
  }  
}
