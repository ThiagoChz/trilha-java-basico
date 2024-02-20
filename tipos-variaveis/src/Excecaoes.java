import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Excecaoes {
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome");
        String nome = sc.next();

        System.out.println("Digite o seu sobrenome");
        String sobrenome = sc.next();

        System.out.println("Digite a sua idade");
        int idade = sc.nextInt();

        System.out.println("Digite a sual altura");
        double altura = sc.nextDouble();

        System.out.println("Olá me chamo "+ nome.toUpperCase() + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos" );
        System.out.println("Minha altura é " + altura);
        sc.close();

        }
         catch (InputMismatchException e){
            System.err.println("Os campos idade e altura devem ser preencheidos por caracteres númericos");
         }
      

    }
}
