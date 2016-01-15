import java.util.LinkedList;
import java.util.List;

/**
 * Created by vcassiano on 1/6/16.
 */
public class Pilha<T> {
    private List<T> objetos = new LinkedList<T>();

    public void insere(T objeto){
        this.objetos.add(objeto);
    }
    public T remove(){
        return this.objetos.remove(this.objetos.size() - 1);
    }
    public boolean vazia(){
        return this.objetos.size() == 0;
    }
}
