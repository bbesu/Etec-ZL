/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recup26;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Recup26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
         System.out.println("Digite um numero");
        int n = scanner.nextInt();
      
      for(int i=1; i<11;i++){
          System.out.println("A tabuada dele e: "+ i*n);
       }
    }
}
