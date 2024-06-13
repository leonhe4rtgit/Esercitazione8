package com.esercitazioneotto;

import javax.swing.JOptionPane;

public class ScrivoScrivoScrivo {
	
	/*
	 * Scrivere un programma "ScrivoScrivoScrivo" che 
	 * chiede all’utente di inserire un numero maggiore o uguale a zero 
	 * e stampa il messaggio «sto ciclando» un numero di volte 
	 * pari al numero inserito dall’utente.
	 * 
	 * Se il valore inserito dall’utente è negativo il programma 
	 * stampa un messaggio di errore.
	 */

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Inserire un numero Intero Positivo");
		
		//Verifica dell'input in modo che sia non nullo e diverso da stringa vuota
		if(input != null && !input.equals("")) {
			
			System.out.println("Numero inserito: " + input);
			
			int numero = Integer.parseInt(input);
			
			//Verifico che il numero inserito sia maggiore o uguale a 0
			if(numero >= 0) {
				
				//Indice di riferimento
				int i = 1;
				
				//Eseguo le istruzioni fino a che l'indice sia minore o uguale del numero inserito
				while(i <= numero) {
					
					System.out.println("Sto Ciclando !");
					
					i++;
				}
				
			}
			else {
				
				System.out.println("Il numero inserito è negativo");
				
			}
			
		}
		else {
			
			System.out.println("Input non valido");
		}

	}

}
