import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LogSimples implements Iterable<String>{
    static private LogSimples instance;
    private List<String> mensagens;

    private LogSimples(){
        mensagens = new LinkedList<>();
    }

    public void log(String m){
        String logM = LocalDate.now().toString() + " : " + m;
        mensagens.add(logM);
    }

    @Override
    public Iterator<String> iterator() {
        return mensagens.iterator();
    }

    static public LogSimples getInstance() {
        if (instance == null) {
            instance = new LogSimples();
        } 
        return instance;
    }
}
