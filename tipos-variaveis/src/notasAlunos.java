import java.util.Scanner;
import java.util.Locale;

public class notasAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double nota1, nota2, nota3, media;

        System.out.println("Por gentileza informe a primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.println("Por gentileza informe a segunda nota: ");
        nota2 = sc.nextDouble();

        System.out.println("Por gentileza a terceira nota: ");
        nota3 = sc.nextDouble();

        media = (nota1 + nota2 + nota3)/3;

        if(media >= 7){
            System.out.println("Aprovado");
        }
        else if(media >= 4 && media <= 6){
            System.out.println("Prova final");
        }else{
            System.out.println("Reprovado!");
        }

    }
}
