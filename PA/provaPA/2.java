/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provapa2b_2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ProvaPA2B_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = ;
            System.out.print("Coloque a priemira nota do  aluno");
            int mediaA =  ;
            System.out.print("Coloque a segunda nota do  aluno");
            int mediaB = ;
            System.out.print("Coloque a tterceira nota do  aluno");
            int mediaC = ;
            
            if(mediaA+mediaB+mediaC>=7){
                System.out.println("Aprovado");} 
            else if(mediaA+mediaB+mediaC<=7){
                System.out.println("Em recuperacao");} 
            else if(mediaA+mediaB+mediaC>=5) {
                System.out.println("Reprovado");}
            
        
    }
    
}
