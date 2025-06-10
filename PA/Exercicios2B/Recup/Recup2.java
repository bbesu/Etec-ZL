/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recup2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Recup2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        int matriz[][] = new int [2][2];
  
        for(int i=0;matriz.length>=i;i++){ 
        for(int b=0;matriz.length>=b;b++){
            matriz[i][b] = scanner.nextInt();
                System.out.println(matriz[i][b]);
   }
  }
    }
}
