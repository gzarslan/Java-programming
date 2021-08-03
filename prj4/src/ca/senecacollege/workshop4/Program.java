
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
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Program {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Hangman obj = new Hangman();
		String fileName = "hangman.txt";
		String[] wordsInFile = obj.scanWords(fileName);
		Scanner scan = new Scanner(System.in);
		while (true) {
			String word = obj.getRandomWord(wordsInFile);
			char[] initWord = obj.getInitWords(word);
			char[] inputVal = new char[word.length()];
			int missGuessCounter = 0;

			while (!word.equals(String.copyValueOf(initWord))) {
				System.out.printf("Enter a letter in word %s > ", String.copyValueOf(initWord));
				char guess = scan.next().charAt(0);

				if (obj.init(inputVal, missGuessCounter, guess)) {
					System.out.printf("You have already tried %c, try a new letter\n", guess);
				} else if (obj.init(initWord, initWord.length, guess)) {
					System.out.printf("        %c is already in the word\n", guess);
				} else {
					int currReplacement = 0;
					for (int i = 0; i < initWord.length; ++i) {
						if (word.charAt(i) == guess) {
							initWord[i] = guess;
							++currReplacement;
						}
					}
					if (currReplacement == 0) {
						if (missGuessCounter == inputVal.length) {
							inputVal = Arrays.copyOf(inputVal, missGuessCounter * 2);
						}
						inputVal[missGuessCounter++] = guess;
						System.out.printf("        %c is not in the word\n", guess);
					}
				}
			}

			System.out.printf("The word is %s. You missed %d time%s\n", word, missGuessCounter,
					(missGuessCounter == 1 ? "" : "s"));
			System.out.print("Enter a new word to be added in the memory> ");
			wordsInFile = Arrays.copyOf(wordsInFile, wordsInFile.length + 1);
			wordsInFile[wordsInFile.length - 1] = scan.next();
			String input = "";
			while (!input.equals("y") && !input.equals("Y") && !input.equals("n") && !input.equals("N")) {
				System.out.print("would you like continue to game? \n Enter y/Y or n/N : ");
				input = scan.next();
			}

			if (input.equals("n") || input.equals("N"))
				break;

		}
		scan.close();

		obj.flushWords(wordsInFile, fileName);

	}

}
