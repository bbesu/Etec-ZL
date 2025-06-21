/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recup14;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Recup14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                String mes = JOptionPane.showInputDialog(null,"Insira o numero do mes");
                
            switch (mes){
                    case "1" -> JOptionPane.showMessageDialog(null,"Janeiro");
                    case "2" -> JOptionPane.showMessageDialog(null,"Fvereito");
                    case "3" -> JOptionPane.showMessageDialog(null,"Marco");
                    case "4" -> JOptionPane.showMessageDialog(null,"Abril");
                    case "5" -> JOptionPane.showMessageDialog(null,"Maio");
                    case "6" -> JOptionPane.showMessageDialog(null,"Junho");
                    case "7" -> JOptionPane.showMessageDialog(null,"Julho");
                    case "8" -> JOptionPane.showMessageDialog(null,"Agosto");
                    case "9" -> JOptionPane.showMessageDialog(null,"Setembro");
                    case "10" -> JOptionPane.showMessageDialog(null,"Outubro");
                    case "11" -> JOptionPane.showMessageDialog(null,"Novomebro");
                    case "12" -> JOptionPane.showMessageDialog(null,"Dezembro");
    }
    }
}
