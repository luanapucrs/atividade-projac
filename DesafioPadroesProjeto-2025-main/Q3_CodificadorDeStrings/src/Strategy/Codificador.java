import java.util.*;

public class Codificador implements ICodificadorStrategy {
    private CodificadorDesloca codificadorDesloca = new CodificadorDesloca();
    private CodificadorSimples codificadorSimples = new CodificadorSimples();

    @Override
    public String codifica(String str) {
        // Default implementation or logic for codifica
        return codifica(Tipo.SIMPLES, str);
    }

    @Override
    public String decodifica(String str) {
        // Default implementation or logic for decodifica
        return decodifica(Tipo.SIMPLES, str);
    }

    public enum Tipo {SIMPLES,DESLOCA};
    public Map<Character,Character> tabCod;
    public Map<Character,Character> tabDeCod;

    public Codificador(){
        this.tabCod = new HashMap<>();
        this.tabCod.put('a','@');
        this.tabCod.put('e','#');
        this.tabCod.put('i','!');
        this.tabCod.put('o','$');
        this.tabCod.put('u','%');
        this.tabDeCod = new HashMap<>();
        this.tabDeCod.put('@','a');
        this.tabDeCod.put('#','e');
        this.tabDeCod.put('!','i');
        this.tabDeCod.put('$','o');
        this.tabDeCod.put('%','u');
        
    }

    public String codifica(Tipo tipo,String str){
        switch(tipo){
            case SIMPLES:
                return codificadorSimples.codifica(str);
            case DESLOCA:
                return codificadorDesloca.codifica(str);
            default:
                return str;
        }
    }

    public String decodifica(Tipo tipo,String str){
        switch(tipo){
            case SIMPLES:
            return codificadorSimples.codifica(str);
            case DESLOCA:
            return codificadorDesloca.codifica(str);
            default:
                return str;
        }
    }
}
