/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recup10;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Recup10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
            Scanner scanner = new Scanner(System.in);
            int[][] matriz = new int [3][3];
            int erro=0;
            System.out.println("Digite os valores para a matriz:");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }  
            }  

             for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            if(matriz[i][j]!=matriz[j][i]){
                erro=1;}         
            }
}  
            if(erro==1){
                System.out.println("A matriz nao e simetrica");
            }else {
                System.out.println("A matriz e simetrica");}
}       
}

