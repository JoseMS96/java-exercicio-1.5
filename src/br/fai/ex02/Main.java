package br.fai.ex02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}
	
	private void start() {
		ArrayList<Integer> valores = reader();
		float media = calculator(valores);
		System.out.println("Media: " + media);
		
	}
	
	private static ArrayList reader() {
		ArrayList<Integer> valores = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		while (true) {
			System.out.println("Digite o valor " + i + ".");
			int valor = scanner.nextInt();
			if (valor != -1) {
				valores.add(valor);
			} else {
				if(i >= 4) {
					break;
				} else {
					System.out.println("Digite pelo menos 4 valores antes de sair.");
				}
			}
			i += 1;
		}
		return(valores);
	}
	
	private static float calculator(ArrayList<Integer> valores) {
		int i = 0;
		float soma = 0;
		while (i < valores.size()) {
			soma += valores.get(i);
			i += 1;
		}
		float media = soma / valores.size();
		System.out.println("Soma: " + soma);
		return media;
	}
}
