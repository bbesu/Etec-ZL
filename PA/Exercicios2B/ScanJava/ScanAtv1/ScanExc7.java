/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanexc7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ScanExc7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Adicione o valor da conta: ");
                double preco = scanner.nextDouble();
        
        System.out.print("Adicione a quantidade de pessoas: ");
            var pessoas = scanner.nextInt();
            
        System.out.println(preco/pessoas);
    }
    
}
