import java.util.Scanner;
public class GuessNumber {
    public static void main (String [] args){
    int guess = 0;
    int  correctGuess = 298;
    int attempt = 0;
Scanner sc=new Scanner(System.in);
    System.out.println("Welcome to the number of guess");
    System.out.println("Guess a number between 1 to 298");
    while( guess != correctGuess){
    guess = sc.nextInt();
    attempt++;
    if (guess < correctGuess){
        System.out.println("To low try again");
    }
    else if (guess > correctGuess){
     System.out.println("To high try again");
    }
    else{
        System.out.println("The number of guess" + attempt +"attempts");

    }

    } 
    }
}

