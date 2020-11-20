package br.edu.up.others;

import java.util.Scanner;

public class Leitor {

	public static Scanner leitor = new Scanner(System.in);

	public static int lerOp(int op) {

		op = leitor.nextInt();
		leitor.nextLine();
		return op;
	}

	public static String[] lerDados(String [] vetor) {
		
		vetor = leitor.nextLine().split(", ");
		return vetor;
	}
}