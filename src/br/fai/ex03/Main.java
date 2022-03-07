package br.fai.ex03;
import java.io.*;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}
	
	private void start() {
		String inverter = "Hello world.";
		String invertida = "";
		char letras;
		
		for (int i =0; i<inverter.length(); i++) {
			letras = inverter.charAt(i);
			invertida = letras+invertida;
		}
		System.out.println(invertida);
	}
}
