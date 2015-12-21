package tests;

import Chaining_list.ListaLigada;

import java.util.List;

/**
 * Created by vcassiano on 12/18/15.
 */
public class TesteRemovePorPosicao {
    public static void main(String[] args){
        ListaLigada lista = new ListaLigada();

        lista.adiciona("Rafael");
        lista.adiciona("Bruno");
        lista.adiciona("Camila");

        lista.remove(1);
        System.out.println(lista);
    }
}
