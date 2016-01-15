import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by vcassiano on 1/15/16.
 */
public class ConjuntoEspalhamento {

    private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();

    public ConjuntoEspalhamento(){
        for(int i = 0; i < 26; i++){
            LinkedList<String> lista = new LinkedList<String>();
            tabela.add(lista);
        }
    }


    public void adiciona(String palavra){}
    public void remove(String palavra){}
    public boolean contem(String palavra){}
    public List<String> pegaTodas(){}
    public int tamanho(){return 0;}

}
