/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recup1;

import javax.swing.JOptionPane;


public class Recup5 {

    public static void main(String[] args) {
            
        
int[] vetor = new int[5];
                
System.out.println("Digite 5 numeros");
    for(int i=0; i<vetor.length;i++){
    System.out.println("\nNumero " +(i+1) + ":");
    String cincoStr =JOptionPane.showInputDialog("Coloque 5 numeros inteiros");
    vetor[i]= Integer.parseInt(cincoStr);}

JOptionPane.showMessageDialog(null,"\nOs números digitados foram: ");
for (int n: vetor) {
JOptionPane.showMessageDialog(null,n);
    }
    }
    }