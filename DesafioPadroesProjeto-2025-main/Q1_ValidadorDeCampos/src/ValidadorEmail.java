public class ValidadorEmail implements Validador {
    @Override
    public boolean valida(String valor) {
        int charAt = valor.indexOf('@');
        int charDot = valor.indexOf('.');
        return charAt > 0 && charDot > 0;
    }
}