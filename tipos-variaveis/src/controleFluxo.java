import java.util.*;
public class controleFluxo extends ParametrosInvalidosException{
    public static void main(String[] args) {
        int parametroUm;
        int parametroDois;
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

            try{
            System.out.println("Por gentileza informe o parametro Um");
            parametroUm = sc.nextInt();

            System.out.println("Por gentileza informe o paramentro dois");
            parametroDois = sc.nextInt();
            if(parametroUm > parametroDois)
                throw new IllegalArgumentException("O PARAMETRO UM DEVE SER MENOR QUE O PARAMETRO DOIS");
            
            contar(parametroUm, parametroDois);

            }catch(IllegalArgumentException e){
                System.err.println("O PARAMETRO UM DEVE SER MENOR QUE O PARAMETRO DOIS");
            }
           

    }


    static void contar(int parametroUm, int parametroDois){
        for(int i = parametroUm; i <= parametroDois; i++){
            System.out.println("Contador: " + i);
        }
    }

    


  }

