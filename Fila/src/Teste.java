/**
 * Created by vcassiano on 1/11/16.
 */
public class Teste {
    public static void main(String[] args){
        Fila fila = new Fila();

        Aluno aluno = new Aluno();

        fila.insere(aluno);

        Aluno alunoRemovido = fila.remove();

        if(fila.vazia()){
            System.out.println("A fila está vazia!");
        }
    }
}
