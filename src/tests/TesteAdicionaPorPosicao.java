package tests;

import Chaining_list.ListaLigada;

/**
 * Created by vcassiano on 12/18/15.
 */
public class TesteAdicionaPorPosicao {
    public static void main(String[] args){
        ListaLigada lista = new ListaLigada();

        lista.adiciona("Rafael");
        lista.adiciona(0,"Bruno");
        lista.adiciona(1,"Camila");

        System.out.println(lista);
    }
}
