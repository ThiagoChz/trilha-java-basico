import java.util.Scanner;
import java.util.Locale;
public class contaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int numeroConta;
        String agenciaConta, nomeCliente;
        double saldo;


        System.out.println("Olá seja bem vindo ao nosso banco:");
        System.out.println("Por gentileza Digite as informações solicitadas a seguir:");

        System.out.println("Por gentile informe o seu nome");
        nomeCliente = sc.next();

        System.out.println("Por gentileza informe o número da agencia: ");
        agenciaConta = sc.next();

        System.out.println("Por gentileza digite o numero da conta: ");
        numeroConta = sc.nextInt();

        System.out.println("Por gentileza informe o valor inicial que você irá depositar");
        saldo = sc.nextDouble();

        System.out.println("Olá ".concat(nomeCliente) + " obrigado por criar uma conta em nosso banco sua agencia é: ".concat(agenciaConta) +  " o número da sua conta é "  + (numeroConta) + " o seu saldo é de: " + (saldo));
        

    }
}
