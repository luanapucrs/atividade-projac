public class ValidadorMatricula implements Validador {
    @Override

//validador com CHECKSUM: Soma os valores da string exceto o ultimo, 
// (converte LETRAS em seus respectivos valores numéricos )
// faz o módulo/resto dessa soma e logo após ele verifica se o resultado é igual ao ultimo 
// digito da matricula

    public boolean valida(String valor) {
        if (!new ValidadorInteiro().valida(valor)) {
            return false;
        } else {
            int sum = 0;
            for (int i = 0; i < valor.length() - 1; i++) {
                sum += Character.getNumericValue(valor.charAt(i));
            }
            int verificador = sum % 10;
            return verificador == Character.getNumericValue(valor.charAt(valor.length() - 1));
        }
    }
}