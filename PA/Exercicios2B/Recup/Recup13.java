/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recup13;

import java.util.Scanner;


/**
 *
 * @author User
 */
public class Recup13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adicione uma letra do alfabeto");
        char letra= scanner.next().charAt(0);
        
        switch (letra){
            case 'a','e','i','o','u':
              System.out.println("A letra e uma vogal");
            break;
            case 'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z':
              System.out.println("A letra e uma consoante");
            break;
            default:
                 System.out.println("Nao e uma letra valida");
            break;
        } 
    }
    
}
