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
public class Switch3 {
       public static void main(String[] args) {
     
        String mes = JOptionPane.showInputDialog(null,"Insira o numero do mes");
                
            switch (mes){
                    case "1" -> JOptionPane.showMessageDialog(null,"Verão");
                    case "2" -> JOptionPane.showMessageDialog(null,"Verão");
                    case "3" -> JOptionPane.showMessageDialog(null,"Verão");
                    case "4" -> JOptionPane.showMessageDialog(null,"Outono");
                    case "5" -> JOptionPane.showMessageDialog(null,"Outono");
                    case "6" -> JOptionPane.showMessageDialog(null,"Outono");
                    case "7" -> JOptionPane.showMessageDialog(null,"Inverno");
                    case "8" -> JOptionPane.showMessageDialog(null,"Inverno");
                    case "9" -> JOptionPane.showMessageDialog(null,"Inverno");
                    case "10" -> JOptionPane.showMessageDialog(null,"Primavera");
                    case "11" -> JOptionPane.showMessageDialog(null,"Primavera");
                    case "12" -> JOptionPane.showMessageDialog(null,"Primavera");
    }
  }
}
