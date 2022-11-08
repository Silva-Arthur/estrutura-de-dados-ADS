package br.com.arthur.atividade01_ADS;

import javax.swing.JOptionPane;

public class Atividade01 {

	public static void main(String[] args) {
		
		String[] listaAlunos = new String[30];
		
		for (int i = 0; i < 25; i++) {
			listaAlunos[i] = JOptionPane.showInputDialog("Digite o nome do Aluno nº " + (i+1));
		}
		
		for (int i = 25; i < 30; i++) {
			listaAlunos[i] = JOptionPane.showInputDialog("Digite o nome do Aluno nº " + (i+1));
		}
	}
}
