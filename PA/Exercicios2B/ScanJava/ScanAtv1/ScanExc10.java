/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanexc10;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ScanExc10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Nota do aluno: ");
                var nota = scanner.nextInt();
        
        System.out.print("Frequencia do aluno(%): ");
            var frequencia = scanner.nextInt();
            
         if (nota<7 && frequencia>=75) {
            System.out.print("fazer recuperacao");
        }
        else {
             System.out.print("nao fazer recuperacao");
        }
    }
}

