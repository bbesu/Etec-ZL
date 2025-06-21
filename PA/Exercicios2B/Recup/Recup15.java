/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recup15;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Recup15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String acao = JOptionPane.showInputDialog(null, """
                                                        Selecione o item desejado 
                                                        
                                                        (1)Ver Saldo
                                                        (2)Deposito
                                                        (3)Saque""");
        
        int saldo = 2500;
       
       switch (acao) {
            case "1":
                JOptionPane.showMessageDialog(null,"seu saldo atual é "+ saldo+" reais" );
                                JOptionPane.showMessageDialog(null,"Obrigado pela preferencia!");
            break;
            
            case "2":
                String deposito = JOptionPane.showInputDialog(null, """
                                                                     Quanto deseja depositar?
                                                                    (1)10 reais
                                                                    (2)20 reais
                                                                    (3)50 reais
                                                                    (4)100 reais
                                                                   """);
                                switch(deposito){
                                                    case "1":
                                            JOptionPane.showMessageDialog(null,"Seu saldo agora e: "+(saldo+10));
                                        break;
                                                    case "2":
                                            JOptionPane.showMessageDialog(null,"Seu saldo agora e: "+(saldo+20));
                                        break;
                                                    case "3":
                                        JOptionPane.showMessageDialog(null,"Seu saldo agora e: "+(saldo+50));
                                        break;
                                                    case "4":
                                            JOptionPane.showMessageDialog(null,"Seu saldo agora e: "+(saldo+100));
                                        break;}
                            JOptionPane.showMessageDialog(null,"Obrigado pela preferencia!");
                            
            case "3":
                String saque = JOptionPane.showInputDialog(null, """
                                                                     Quanto deseja sacar?
                                                                     (1)10 reais
                                                                     (2)20 reais
                                                                     (3)50 reais
                                                                     (4)100 reais""");
                                switch(saque){
        case "1":
        JOptionPane.showMessageDialog(null,"Seu saldo agora e: "+(saldo-10));
        break;
        case "2":
        JOptionPane.showMessageDialog(null,"Seu saldo agora e: "+(saldo-20));
        break;
        case "3":
        JOptionPane.showMessageDialog(null,"Seu saldo agora e: "+(saldo-50));
        break;
        case "4":
       JOptionPane.showMessageDialog(null,"Seu saldo agora e: "+(saldo-100));
       break;}
                JOptionPane.showMessageDialog(null,"Obrigado pela preferencia!");
            break;
             default:
                JOptionPane.showMessageDialog(null,"Opcao invalida");
            break;
                       
       }
    }
    
}

