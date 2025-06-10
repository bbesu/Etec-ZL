/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recup7;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Recup7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int [] vetor1 = new int [5];
        int [] vetor2 = new int [5];
        int [] vetordesoma = new int [5];
      
        System.out.println("Digite 5 numeros");
    for(int i=0; i<vetor1.length;i++){
        vetor1[i]= scanner.nextInt();   }
    
    System.out.println("\nDigite 5 numeros");
    for(int i=0; i<vetor2   .length;i++){
        vetor2[i]= scanner.nextInt();   }
    
    for(int i=0; i<vetordesoma.length;i++){
        vetordesoma[i]= vetor1[i] + vetor2[i];   }
    
    System.out.println("\nA soma dos dois vetores sao: ");
    for (int v: vetordesoma) {
            System.out.println(v);
    }
    }
    }
