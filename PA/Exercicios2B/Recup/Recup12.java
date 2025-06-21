/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recup12;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Recup12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dia = JOptionPane.showInputDialog(null,"Digite um numero de 1 a 7(apenas o numero) \n"
                + "1 -> Domingo \n"
                + "2 -> Segunda-feira \n"
                + "3 -> Terca-feira \n"
                + "4 -> Quanta-feira \n"
                + "5 -> Quinta-feira \n"
                + "6 -> Sexta-feira \n"
                + "7 -> Sabado \n");
    
        switch (dia) {
           case "1":
                JOptionPane.showMessageDialog(null,"O dia da semana é domingo");
            break;
            case "2":
                JOptionPane.showMessageDialog(null,"O dia da semana é segunda-feira");
            break;
            case "3":
                JOptionPane.showMessageDialog(null,"O dia da semana é terca-feira");
            break;
            case "4":
                JOptionPane.showMessageDialog(null,"O dia da semana é quanta-feira");
            break;
            case "5":
                JOptionPane.showMessageDialog(null,"O dia da semana é quinta-feira");
            break;
            case "6":
                JOptionPane.showMessageDialog(null,"O dia da semana é sexta-feira");
            break;
            case "7":
                JOptionPane.showMessageDialog(null,"O dia da semana é sabado");
            break;
            default:
                JOptionPane.showMessageDialog(null,"Opcao invalida");
            break;
        }
    }
    
}
