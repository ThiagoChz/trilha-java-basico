public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765049");
            System.out.println(cepFormatado);
        } catch (CepInvalido e) {
            System.out.println("O cep não corresponde com as regras de negocio");
        }
    }

    static String formatarCep(String cep) throws CepInvalido{
        if(cep.length() != 8){
            throw new CepInvalido();     
        }
        return "23.765-064";
    }
}
