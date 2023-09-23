import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) throws Exception {
       Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Digite o seu nome: ");
       String nome = entrada.next();
       System.out.println("Digite o sua idade: ");
       int idade = entrada.nextInt(); 
       System.out.println("Digite o sua altura: ");
       double altura = entrada.nextDouble();
    

       System.out.println("Seu nome é " + nome + " e sua idade é " + idade+".");
       System.out.println("Sua altura é: " + altura);
       

    }
}
