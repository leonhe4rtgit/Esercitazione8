package com.esercitazioneotto;

import javax.swing.JOptionPane;

public class IndovinaZero {

	/*
	 * Il software deve chiedere all’utente di inserire in Input da Tastiera un
	 * numero intero e ripete l’operazione fino a quando non si inserisce il numero
	 * 0;  
	 * 
	 * A quel punto viene stampato a video «Inserito valore 0 programma terminato».
	 */

	public static void main(String[] args) {

		// Input da Tastiera
		String input = JOptionPane.showInputDialog("Inserire un Numero Intero");

		//Verifica che l'input sia non nullo e diverso da stringa vuota
		if (input != null && !input.equals("")) {

			//Conversione in numero intero
			int numero = Integer.parseInt(input);

			// Se viene inserito come primo numero il valore 0, il programma termina immediatamente
			if (numero == 0) {
				
				System.out.println("Inserito valore 0 programma terminato");
				
			} 
			//In caso che il numero inserito sia diverso da 0
			else {

				/* Ciclo che ripete il messaggio di input fino a
				 * che l'input è diverso da 0
				 */
				while (numero != 0) {

					input = JOptionPane.showInputDialog("Inserire un Numero Intero");

					numero = Integer.parseInt(input);

					if (numero == 0) {

						System.out.println("Inserito valore 0 programma terminato");
						break;

					}
				}
			}

		} else {

			System.out.println("Input non valido");

		}

	}

}
