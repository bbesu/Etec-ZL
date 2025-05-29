/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanecx8;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ScanExc8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        
                System.out.print("Altura do triangulo: ");
            var altura = scanner.nextInt();
        
                System.out.print("Tamanho da base do triangulo: ");
            var base = scanner.nextInt();
            
                System.out.print("Tamanho do lado esquerdo do triangulo: ");
            var es = scanner.nextInt();
            
                    System.out.print("Tamanho do lado direito do triangulo: ");
            var di = scanner.nextInt();
            
        System.out.println("A area do traingulo é "+ altura * base + ". E o perimetro do triangulo é "+ (es + di + base) + ".");
    }
    
}
