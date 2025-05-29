/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanexc2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ScanExc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner scanner = new Scanner (System.in);
        System.out.print("Digite sua senha: ");
    String senha = scanner.nextLine();
            
            if (senha.equals("java123")) {
                System.out.println("Acesso permitido");
            }
            else {
                System.out.println("Senha incorreta");
            }
             scanner.close();
}
}
