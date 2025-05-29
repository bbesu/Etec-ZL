
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ScanExc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite a idade");
        int idade = scanner.nextInt();
        
        if (idade>=0 && idade<=12) {
          System.out.println("Crianca");  
        }
        else if (idade>13 && idade<17) {
          System.out.println("Adolecente");  
        }
        else if (idade>18 && idade<59) {
          System.out.println("Adulto");  
        }
        else if (idade>60) {
          System.out.println("Idoso");  
        }
         else if (idade<0) {
          System.out.println("Idade invalida");  
        }
        scanner.close();
        
        
    }
    
    
    
}
