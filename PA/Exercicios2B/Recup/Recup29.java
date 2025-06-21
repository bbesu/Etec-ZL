/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recup29;

import java.util.Scanner;

public class Recup29 {

    public static void main(String[] args) {
        System.out.println("Coloque um numero");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int primo=0;
        for(int i=0;i<numero;i--){
            if(numero!=1 && numero%2!=0 && numero%3!=0 ){
               primo=1; }}
        
        if(primo==1){
        System.out.println(numero+" e um numero primo");
            }else{System.out.println(numero +" nao e um numero primo");}
    }
    
}
