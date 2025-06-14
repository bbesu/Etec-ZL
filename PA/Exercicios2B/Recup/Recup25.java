/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recup25;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Recup25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numero = new int[10];
        int soma=0;
        
         System.out.println("Coloque as 10 notas: ");
        for(int i =0;i<numero.length;i++){
                System.out.println("nota "+ (i+1));
            numero[i]=scanner.nextInt();}
        
        for(int somav:numero){
            soma+=somav;}
        
        System.out.println("A media das notas é: "+(soma/numero.length));

}
}