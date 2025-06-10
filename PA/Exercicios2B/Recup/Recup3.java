/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recup3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Recup3 {

    public static void main(String[] args) {

        int[] vetor = new int [10];
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Coloque 10 numeros pares: ");
        for(int i=0;i<vetor.length;i++){
            int par = scanner.nextInt();

               do {
                System.out.print("\nNúmero " + (i + 1) + ": ");
                par = scanner.nextInt();
            } while (par < 2 || par > 20 || par % 2 != 0);      
            vetor[i] = par;
        }
            System.out.println("\nOs números foram: ");
            for (int v: vetor) {
            System.out.println(v);
    }
        }
            }
 