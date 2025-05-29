/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package switchcase;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Switch5 {
     public static void main(String[] args) {
        
    String notaStr = JOptionPane.showInputDialog(null,"Insira o codico do combustivel: \n"
            + "A = Alcool \n"
            + "G = Gasolina \n"
            + "D = Diesel \n"
            + "E = Eletrico \n");
        switch (notaStr) {
            case "A":
                JOptionPane.showMessageDialog(null,"Alcool");
            break;
            case "G":
                JOptionPane.showMessageDialog(null,"Gasolina");
            break;
            case "D":
                JOptionPane.showMessageDialog(null,"Diesel");
            break;
            case "E":
                JOptionPane.showMessageDialog(null,"Eletrico");
            default:
                JOptionPane.showMessageDialog(null,"Opcao invalida");
            break;
}
     }
        }