/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recup8;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Recup8 {


    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[][] matriz = new int [4][4];
            int conta =0;
            
            System.out.println("Digite os valores para a matriz:");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                
            if(matriz[i][j]%2==0){
                conta++;
                System.out.println("A quandidade de numeros pares sao: "+ conta);
            }else{
                System.out.println("A quandidade de numeros pares sao: "+ conta);}
            
    }   
            
}
    }
}
