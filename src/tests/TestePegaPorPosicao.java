package tests;

import Chaining_list.ListaLigada;

/**
 * Created by vcassiano on 12/18/15.
 */
public class TestePegaPorPosicao {
    public static void main(String[] args){
        ListaLigada lista = new ListaLigada();

        lista.adiciona("Rafael");
        lista.adiciona("Bruno");

        System.out.println(lista.pega(0));
        System.out.println(lista.pega(1));
    }
}
