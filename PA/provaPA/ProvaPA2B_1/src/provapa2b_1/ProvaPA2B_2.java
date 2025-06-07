/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provapa2b_1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ProvaPA2B_2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in) ;
            
    System.out.print("Coloque a priemira nota do  aluno");
            int mediaA = scanner.nextInt() ;
            System.out.print("Coloque a segunda nota do  aluno");
            int mediaB = scanner.nextInt();
            System.out.print("Coloque a tterceira nota do  aluno");
            int mediaC = scanner.nextInt();
            int media = (mediaA+mediaB+mediaC)/3;
            

            if(media>=7){
                System.out.println("Aprovado");
            }else if(media<=7){
                System.out.println("Em recuperacao");
            }else if(media>=5){
                System.out.println("Reprovado");}
            
}
}