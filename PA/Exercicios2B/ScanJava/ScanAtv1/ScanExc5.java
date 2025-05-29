/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanexc5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ScanExc5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Adicione o valor do salario bruto: ");
                double salario = scanner.nextDouble();
        
        System.out.print("Adicione o valor do desconto do INSS(%): ");
            int desconto = scanner.nextInt();
            
        System.out.println(salario-(desconto/100*salario)+"é o valor do seu salario liquido");
    }
    
}
