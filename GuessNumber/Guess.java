// Exercise 6.29 Guess The Number
import java.util.Scanner;
import java.security.SecureRandom;
public class Guess
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		SecureRandom randomNumbers = new SecureRandom();
		int userGuess;
		int randomNumb;
		int keepPlaying =1;
		while (keepPlaying ==1)
		{

		//Random Number Selectoon
		randomNumb = 1 + randomNumbers.nextInt(1000);
		System.out.println("Enter first guess");
		System.out.println(randomNumb);  //Testing only
		userGuess = input.nextInt();
		while(randomNumb != userGuess)
		{
			if (userGuess > randomNumb)
			System.out.println("Too high");
			if (userGuess < randomNumb)
			System.out.println("Too low");
			System.out.println("Enter next guess");
			userGuess = input.nextInt();

	}
	System.out.println("You guessed it!");
	System.out.println("Play Again? Enter 1 for yes");
	keepPlaying = input.nextInt();
	}
	System.out.println("Thanks for playing");
}
}