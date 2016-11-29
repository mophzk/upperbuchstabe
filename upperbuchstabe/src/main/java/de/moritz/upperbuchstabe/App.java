package de.moritz.upperbuchstabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Dieses Programm liest einen String kleiner Buchstaben ein und gibt ihn in
 * Großbuchstaben wieder aus.
 *
 */
public class App {
	/**
	 * Hauptprogramm:
	 * 
	 * @param args
	 *            Kommandozeilenparameter
	 */
	public static void main(String[] args) {

		System.out.println("String eingeben: "); // HALLOALLOOD
		System.out.println(read().toUpperCase());
	}

	/**
	 * Readfunktion.
	 * @return readname 
	 * String 
	 */
	public static String read() {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String readname = "leer";
		try {
			readname = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return readname;

	}

}
