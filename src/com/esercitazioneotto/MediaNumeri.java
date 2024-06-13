package com.esercitazioneotto;

import javax.swing.JOptionPane;

/*
 * Scrivere un programma MediaNumeri che chiede all’utente 
 * di inserire una sequenza di numeri interi positivi.
 * 
 * Non appena l’utente inserisce un numero negativo 
 * il programma si arresta e visualizza la media aritmetica 
 * dei valori positivi inseriti.
 */

public class MediaNumeri {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Inserire un numero Intero Positivo");
		
		//Verifico che l'input sia non nullo e diverso da stringa vuota
		if(input != null && !input.equals("")) {
		
			int numeroInput = Integer.parseInt(input);
			
			//Se il primo numero inserito è negativo
			if(numeroInput < 0) {
				
				System.out.println("Numero in Input: " + numeroInput);
				
				System.out.println("Il primo numero inserito è negativo, media non calcolata");
				
			}
			else {
				
				//Somma del numero di input
				int somma = 0 + numeroInput;
				
				//Indice per il conteggio dei numeri inseriti
				int indice = 1;
				
				System.out.println("Numero in Input: " + numeroInput);
				
				while(numeroInput > 0) {
					
					input = JOptionPane.showInputDialog("Inserire un numero Intero Positivo");
					
					if(input != null && !input.equals("")) {
						
						numeroInput = Integer.parseInt(input);
						
						//Se il numero in input è un intero positivo
						if(numeroInput >= 0) {
							
							System.out.println("Numero in Input: " + numeroInput);
							
							//Aggiorno la somma dei numeri interi in input da tastiera
							somma = somma + numeroInput;
							
							indice++;
							
						}
						//In caso di numero negativo
						else if(numeroInput < 0) {
							
							System.out.println("Numero in Input: " + numeroInput);
							
							break;
							
						}
						
					}
					
				}// End While
				
				double mediaAritmetica = somma / indice;
				
				System.out.println("Media Aritmetica: " + mediaAritmetica);
				
			}
			
			
		}
		else {
			
			System.out.println("Input non valido, media non calcolata");
		}
		

	}

}
