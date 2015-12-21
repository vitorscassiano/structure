package tests;

import Chaining_list.ListaLigada;

/**
 * Created by vcassiano on 12/18/15.
 */
public class TesteContemElemento {
    public static void main(String[] args){
        ListaLigada lista = new ListaLigada();

        lista.adiciona("Rafael");
        lista.adiciona("Bruno");

        System.out.println(lista.contem("Rafael"));
        System.out.println(lista.contem("Camila"));
    }
}
