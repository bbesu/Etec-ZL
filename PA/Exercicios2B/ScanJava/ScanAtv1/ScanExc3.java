/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ScanExc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite o codigo do produto^: ");
        int codigo = scanner.nextInt();
        
        if (codigo==1){
            System.out.print("Alimento");
        } 
        else if (codigo==2){
            System.out.print("Limpeza");
        }
        else if (codigo==3){
            System.out.print("Vestuario");
        }
         else if (codigo!=1 || codigo!=2 || codigo!=3){
            System.out.print("Categoria desconhecida");
        }
 
             
    }
}
