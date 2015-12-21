package tests;

import Chaining_list.ListaLigada;

/**
 * Created by vcassiano on 12/18/15.
 */
public class TesteAdicionaNoFim {
    public static void main(String[] args){
        ListaLigada lista = new ListaLigada();

        lista.adiciona("Rafael");
        lista.adiciona("Paulo");

        System.out.println(lista);

        //[Rafael, Paulo]
    }
}
