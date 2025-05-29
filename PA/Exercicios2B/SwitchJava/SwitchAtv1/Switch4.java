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
public class Switch4 {
    public static void main(String[] args) {
        
        String notaStr = JOptionPane.showInputDialog(null,"Insira uma nota de 0 a 10");
        switch (notaStr) {
            case "0" -> JOptionPane.showMessageDialog(null,"A nota equivalente e F");
            case "1" -> JOptionPane.showMessageDialog(null,"A nota equivalente e F");
            case "2" -> JOptionPane.showMessageDialog(null,"A nota equivalente e F");
            case "3" -> JOptionPane.showMessageDialog(null,"A nota equivalente e D");
            case "4" -> JOptionPane.showMessageDialog(null,"A nota equivalente e D");
            case "5" -> JOptionPane.showMessageDialog(null,"A nota equivalente e C");
            case "6" -> JOptionPane.showMessageDialog(null,"A nota equivalente e C");
            case "7" -> JOptionPane.showMessageDialog(null,"A nota equivalente e B");
            case "8" -> JOptionPane.showMessageDialog(null,"A nota equivalente e B");
            case "9" -> JOptionPane.showMessageDialog(null,"A nota equivalente e A");
            case "10" -> JOptionPane.showMessageDialog(null,"A nota equivalente e A");
            default -> JOptionPane.showMessageDialog(null,"Numero invalido");
            
    }
}
}