public class ValidadorFactory {
    public enum Tipo { EMAIL, INTEIRO, MATRICULA }

    public static Validador getValidador(Tipo tipo) {
        switch (tipo) {
            case EMAIL:
                return new ValidadorEmail();
            case INTEIRO:
                return new ValidadorInteiro();
            case MATRICULA:
                return new ValidadorMatricula();
            default:
                throw new IllegalArgumentException("Tipo de validador desconhecido: " + tipo);
        }
    }
}