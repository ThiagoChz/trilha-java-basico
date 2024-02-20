public class ParametrosInvalidosException extends Exception{
   static void numeroInvalido(int parametroUm, int parametroDois){
      if(parametroUm > parametroDois){
        System.out.println("O parametro UM deve ser menor que o parametro DOis");
      }
  }

}