public class CodificadorSimples implements ICodificadorStrategy {

    public enum Tipo {SIMPLES,DESLOCA};
    public Map<Character,Character> tabCod;
    public Map<Character,Character> tabDeCod;

    public CodificadorSimples(){
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


    @Override
    public String codifica(String str){
        char[] aux = str.toCharArray();
        char[] resp = new char[str.length()];
        for(int i=0;i<aux.length;i++){
            if (tabCod.containsKey(aux[i])){
                resp[i] = tabCod.get(aux[i]);
            }else{
                resp[i] = aux[i];
            }
        }
        return(new String(resp));
    }

      @Override
    public String decodifica(String str){
        char[] aux = str.toCharArray();
        char[] resp = new char[str.length()];
        for(int i=0;i<aux.length;i++){
            if (tabDeCod.containsKey(aux[i])){
                resp[i] = tabDeCod.get(aux[i]);
            }else{
                resp[i] = aux[i];
            }
        }
        return(new String(resp));
    }
}
