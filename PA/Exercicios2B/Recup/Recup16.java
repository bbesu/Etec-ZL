/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recup16;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Recup16 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Coloque o nome do produto");
         String produto = scanner.nextLine().toLowerCase();

        switch (produto) {
            case "arroz":
            case "feijao":
            case "macarrao":
            case "carne":
            case "maca":
            case "laranja":
                System.out.println("Categoria: Alimentícia");
                break;

            case "shampoo":
            case "condicionador":
            case "sabonete":
                System.out.println("Categoria: Higiene");
                break;

            case "camisa":
            case "vestido":
            case "camiseta":
            case "calca":
            case "meia":
            case "saia":
            case "shorts":
                System.out.println("Categoria: Roupa");
                break;

            default:
                System.out.println("Produto não identificado.");
                break;
         }
    }
    
}
