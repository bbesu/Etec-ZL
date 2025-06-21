/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recup27;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Recup27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5];
        double[][] notas = new double[5][2];
        double[] medias = new double[5];

        for (int i = 0; i < 5; i++){
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.print("Digite a primeira nota de " + nomes[i] + ": ");
            notas[i][0] = scanner.nextDouble();

            System.out.print("Digite a segunda nota de " + nomes[i] + ": ");
            notas[i][1] = scanner.nextDouble();
            scanner.nextLine(); 

            medias[i] = (notas[i][0] + notas[i][1]) / 2;
        }

        System.out.println("\n Boletim:");
        for (int i = 0; i < 5; i++){
            System.out.println("\n["+nomes[i] + "\nprimera nota: " + notas[i][0] +
                               "\nsegunda nota: " + notas[i][1] +
                               "\nmedia: " + medias[i]+"]");
    }
        
    }

    }
