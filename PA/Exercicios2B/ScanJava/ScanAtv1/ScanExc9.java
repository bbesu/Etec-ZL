/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanexc9;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ScanExc9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("quantos ingressos voce tem ingresso ");
        var ingresso = scanner.nextInt();
        
        System.out.print("Digite sua idade ");
        var idade = scanner.nextInt();
        
        if (ingresso>=1 && idade>=18) {
            System.out.print(true);
        }
        else {
             System.out.print(false);
        }
}
}