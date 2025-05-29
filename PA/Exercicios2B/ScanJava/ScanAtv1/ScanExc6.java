/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanexc6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ScanExc6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Adicione o preco da compra: ");
                double preco = scanner.nextDouble();
        
        System.out.print("Adicione o valor do desconto: ");
            var desconto = scanner.nextDouble();
            
        System.out.println(preco-desconto/100*preco);
    }
    
}
