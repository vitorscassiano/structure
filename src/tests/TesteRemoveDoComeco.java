package tests;

import Chaining_list.ListaLigada;

/**
 * Created by vcassiano on 12/18/15.
 */
public class TesteRemoveDoComeco {
    public static void main(String[] args){
        ListaLigada lista = new ListaLigada();

        lista.adiciona("Rafael");
        lista.adiciona("Bruno");

        lista.removeDoComeco();

        System.out.println(lista);
    }
}
