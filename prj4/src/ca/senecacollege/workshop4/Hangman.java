
 /**********************************************
 * Workshop 4 (Part 1-2) 
 * Course: JAC444 -summer 2021 
 * Last Name: Arslan
 * First Name: Gozde
 * ID: 150320190
 * Section: NCC
 * This assignment represents my own work in accordance with Seneca Academic Policy.
 * Signature G.A
 * Date: 21/06/2021
 * **********************************************/

package ca.senecacollege.workshop4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
	public String[] scanWords(String filename) throws FileNotFoundException {
		Scanner scan = new Scanner(new File(filename));
		int counter = 0;
		do {
			scan.nextLine();
			++counter;
		} while (scan.hasNext());
		scan = new Scanner(new File(filename));
		String[] word = new String[counter];
		while (scan.hasNext()) {
			for (int i = 0; i < word.length; ++i) {
				word[i] = scan.nextLine();
			}
		}
		scan.close();
		return word;
	}

	public String getRandomWord(String[] wordList) {
		int random = new Random().nextInt(wordList.length);
		return wordList[random];
	}

	public void flushWords(String[] words, String filename) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
		for (int i = 0; i < words.length; i++) {
			writer.write(words[i]);
			writer.newLine();
		}
		writer.close();
	}

	public char[] getInitWords(String str) {
		char[] guess = new char[str.length()];
		Arrays.fill(guess, '*');
		return guess;
	}

	public boolean init(char[] array, int size, char ch) {
		for (int i = 0; i < size; ++i)
			if (array[i] == ch) {
				return true;
			}
		return false;
	}

}
