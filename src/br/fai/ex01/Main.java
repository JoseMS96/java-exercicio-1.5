package br.fai.ex01;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}
	
	private void start() {
		ArrayList<Integer> valores = reader();
		ArrayList<Integer> maxmin = calculator(valores);
		System.out.println("O menor valor é: " + maxmin.get(1));
		System.out.println("O maior valor é: " + maxmin.get(0));
		if (maxmin.get(0) > 50) {
			System.out.println("Valor muito alto.");
		} else {
			System.out.println("Valor normal.");
		}
	}

	private static ArrayList reader() {
		ArrayList<Integer> valores = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		while (i <= 4) {
			System.out.println("Digite o valor " + i + ".");
			valores.add(scanner.nextInt());
			i += 1;
		}
		return(valores);
	}
	
	private static ArrayList calculator(ArrayList<Integer> valores) {
		ArrayList<Integer> maxmin = new ArrayList<Integer>();
		maxmin.add(Collections.max(valores));
		maxmin.add(Collections.min(valores));
		return(maxmin);
	}
}
