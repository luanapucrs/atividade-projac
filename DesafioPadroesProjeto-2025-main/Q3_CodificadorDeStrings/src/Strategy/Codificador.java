public class Codificador extends ICodificadorStrategy {

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
                return codificaSimples(str);
            case DESLOCA:
                return codificaDesloca(str);
            default:
                return str;
        }
    }

    public String decodifica(Tipo tipo,String str){
        switch(tipo){
            case SIMPLES:
                return deCodificaSimples(str);
            case DESLOCA:
                return deCodificaDesloca(str);
            default:
                return str;
        }
    }
}
