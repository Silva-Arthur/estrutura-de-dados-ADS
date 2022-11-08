package br.com.arthur.atividade02_ADS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Atividade02 {

	public static void main(String[] args) {
		Integer[] lista = new Integer[5];
		
		for (int i = 0; i < lista.length; i++) {
			lista[i] = i+1;
		}
		
		Stack<Integer> pilha = new Stack<Integer>();
		
		for (int i = 0; i < lista.length; i++) {
			pilha.add(lista[i]);
			lista[i] = null;
		}
		
		Queue<Integer> fila = new LinkedList<Integer>();
		
		for (int i = 0; i < lista.length; i++) {
			fila.add((pilha.pop()));
		}
		
		for (int i = 0; i < lista.length; i++) {
			lista[i] = i+6;
		}
		
		for (int i = 0; i < lista.length; i++) {
			pilha.add(lista[i]);
			lista[i] = null;
		}
		
		for (int i = 0; i < lista.length; i++) {
			fila.add((pilha.pop()));
		}
		
		int tamanhoFila = fila.size();
		for (int i = 0; i < tamanhoFila; i++) {
			System.out.println(fila.poll());
		}
		
		/**
		 * A ordem de impressão desse código é a seguinte:
		 * 
		 * 5
		 * 4
		 * 3
		 * 2
		 * 1
		 * 10
		 * 9
		 * 8
		 * 7
		 * 6
		 *
		 * Isso se dá porque a pilha insere e remove os itens a partir do topo, em contrapartida, a fila insere no fim da lista e remove os itens que entraram primeiro 
		 *
		 * */
		
	}

}
