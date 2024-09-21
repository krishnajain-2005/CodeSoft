package randomNumberGuessing;

import java.util.Scanner;

public class randomNumberGame {
	static void numberGame(int rounds) {
		Scanner sc= new Scanner(System.in);
		int roundNumber;
		for(roundNumber=0;roundNumber<rounds;roundNumber++)
		{
		int RandomNumber=(int)(100*Math.random());
		int MaxAttempts=5;
		int attempt=0,guessedNumber=0;
		System.out.println("ROUND : "+(roundNumber+1));
		System.out.println();
		System.out.println("Welcome To The Random Number Guess Game !");
		System.out.println("Guess The Number Within The Maximum Attempts");
		System.out.println();
		
		for(attempt=0;attempt<MaxAttempts;attempt++) {
			System.out.println("Attempt Number: "+(attempt+1));
			System.out.print("Number Guessed: ");
			System.out.println();
			guessedNumber=sc.nextInt();
			 
			if(guessedNumber==RandomNumber) {
				System.out.println("Congratulations You Guessed The Number ! At Attempt: "+(attempt+1));
				break;
			}
			else if(guessedNumber<RandomNumber && attempt<MaxAttempts-1) {
				System.out.println("The Random Number is greater than your guess !");
			}
			else if(guessedNumber>RandomNumber && attempt<MaxAttempts-1) {
				System.out.println("The Random Number is less than your guess !");
			}
			else {
				System.out.println("Failed to guess The number!!");
			}
		}
		if(attempt == MaxAttempts) {
			System.out.println();
			System.out.println("No more Attempts Left!!");
			System.out.println("The Number was:" +RandomNumber);
		}
		continue;

	}
		
	}	
}


