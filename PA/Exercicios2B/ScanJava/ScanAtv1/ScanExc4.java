/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanexc4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ScanExc4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Valor coordenada Z: ");
                int y = scanner.nextInt();
        
        System.out.print("Valor coordenada x: ");
            int x = scanner.nextInt();
            
            if (x>=0 && y>=0) {
        System.out.println("Esta no primeiro quadrante");}
            else if (x<0 && y>=0) {
        System.out.println("Esta no segundo quadrante");}
            else if (x<0 && y<0) {       
        System.out.println("Esta no terceito quadrante");}    
            else if (x>=0 && y<0) {
        System.out.println("Esta no quarto quadrante");}
           
         
    }
    
}
