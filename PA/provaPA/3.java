/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provapa2b_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ProvaPA2B_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showInputDialog(null,"Coloque o numero correspondente ao dia da semama"
                + "\n 1"
                + "\n 2"
                + "\n 3"
                + "\n 4"
                + "\n 5"
                + "\n 6"
                + "\n 7");
        
        int dia = 1;
    
        switch (dia){
            case 1:
            System.out.println("Domingo");
                break;
                
            case 2: 
                System.out.println("Segunda");
                break;
                
            case 3 :
                System.out.println("terca");
                break;
                
            case 4:
                System.out.println("quarta");
                break;
                
            case 5:
                System.out.println("quinta");
                break;
                
            case 6:
                System.out.println("sexta");
                break;
                
            case 7:
                System.out.println("sabado");
                break;
                
             default:
                 System.out.println("opcao invalida");
                break;
        }
       }      
};
