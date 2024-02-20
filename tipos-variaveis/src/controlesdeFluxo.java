/**
 * controlesdeFluxo
 */
import java.util.Scanner;
import java.util.Locale;

public class controlesdeFluxo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double saldo, retirada;
        
        saldo = 25.5;
        
        System.out.println("Por gentileza digite o valor da retirada que você desejada: ");
        retirada = sc.nextDouble();
        

        if (retirada <= saldo){
            double saldoAtual = saldo - retirada;
            System.out.println("seu saldo atual é de: " + saldoAtual);
        }else{
            System.out.println("Você não possui limite o suficite, sua retirada é de" + retirada + "e o sue saldo é de" + saldo);
        }
    }
    
} 