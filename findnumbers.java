import java.util.Scanner;
import java.util.Random;
public class findnumbers {
    public static void main(String[] args) throws Exception{
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int number = random.nextInt(101);
        //for my reference of the generated number I'm printing it in the console to verify the functionality
        //of the program
        System.out.println(number);
        System.out.println("You have only 5 attempts");
        System.out.print("Guess the number:");
            int Guess = sc.nextInt();
            if(Guess == number){
                System.out.println("You guessed it right");
            }else {
                for (int i = 2; i <= 5; i++) {
                    System.out.print("(attempt:" + i + ")" + "Guess again:");
                    int guess = sc.nextInt();
                    if (guess == number) {
                        sc.close();
                        System.out.println("You Guessed it right");
                        break;
                    } else if (guess < number) {
                        System.out.println("You guessed a bit lower than the original number");
                    } else {
                        System.out.println("You guessed a bit higher than the original number");
                    }
                }
                System.out.println("You have out of attempts");
            }

    }

}