package br.fai.ex04;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}
	
	private void start() {
		String doze = "12";
		int digito = Integer.parseInt(doze);
		System.out.printf("%s%d", "Int: " , digito);
	}
}
