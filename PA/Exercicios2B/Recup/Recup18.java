/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recup18;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Recup18 {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("O numero para ser convertido");
            int n1=scanner.nextInt();
        System.out.println("""
                         Digite o numero correspondente:
                          (1)km para m
                          (2)m para c
                           """);
            int op=scanner.nextInt();
       
       switch (op){
           case 1 -> System.out.print("O resultado e " + (n1*100));
            case 2 -> System.out.print("O resultado e " + (n1*1000));
            default -> System.out.print("Opcao invalida");
}
    }
    
}

