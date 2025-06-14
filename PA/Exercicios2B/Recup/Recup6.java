/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recup6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Recup6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int [3][3];
        int contador = 0;

        for(int i=0; i<(matriz.length);i++){
                for(int j=0; j<(matriz.length);j++){
                    System.out.print("Digite 9 numero:");
            matriz[i][j] = scanner.nextInt();
            
                if (matriz[i][j]> 10){
               contador++;}
                System.out.print("A qantidade de numeros maiores que 10 sao: "+contador + "/n");
        }
        }
    }
}
    

