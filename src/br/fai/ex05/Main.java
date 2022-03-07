package br.fai.ex05;


public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}
	
	private void start() {
        String frase = "Boa noite Tiburssinho!";
        String[] listadepalavras = frase.split(" ", 0);
        if (listadepalavras == null) {
        	System.out.println("Nada foi digitado.");
        } else {
        	System.out.println(listadepalavras[listadepalavras.length - 2]);
        }
	}
}
