/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recup24;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Recup24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);
    String[] vetor = new String[10];
    
        System.out.println("Adicione 10 nomes");
    for(int i=0; i<vetor.length;i++){
            System.out.println("nome "+ (i+1));
        vetor[i]= scanner.nextLine();}
    
        System.out.println("Os nome digitados foram: ");
    for(String n:vetor){
        System.out.println(n);}
    }
    
}
