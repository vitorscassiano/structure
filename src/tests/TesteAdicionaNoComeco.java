package tests;

import Chaining_list.ListaLigada;

/**
 * Created by vcassiano on 12/18/15.
 */
public class TesteAdicionaNoComeco {
    public static void main(String[] args){
        ListaLigada lista = new ListaLigada();

        lista.adicionaNoComeco("Rafael");
        lista.adicionaNoComeco("Paulo");

        System.out.println(lista);
    }
}
