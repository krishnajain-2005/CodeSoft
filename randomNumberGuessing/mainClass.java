package randomNumberGuessing;
import java.util.*;
public class mainClass {

	public static void main(String[] args) {
		randomNumberGame games = new randomNumberGame();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of rounds you want to play: ");
		int rounds = sc.nextInt();
		games.numberGame(rounds);
		
	}
}
