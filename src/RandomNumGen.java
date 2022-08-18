import java.util.Random;
import java.util.Scanner;


public class RandomNumGen {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();

        System.out.println("Well, " + name + ", I am thinking of a number");
        int myNum = getRandomNum(1,21);

        for (int i= 0; i< 6; i++) {
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Take a guess");
            int yourGuess = scan2.nextInt();

            if (yourGuess == myNum) {
                System.out.println("You Are Correct!");
                break;
            } else if (yourGuess < myNum){
                System.out.println("Your guess is too low");
            } else if (yourGuess > myNum){
                System.out.println("Your guess is too high");
            }
            if (i >=5 ) {
                System.out.println();
                System.out.println("You guessed too many times. " + "The number is " + myNum + ".");
            }
        }
    }

    public static int getRandomNum(int min, int max){
        Random random = new Random();
        return random.ints(min,max).findFirst().getAsInt();
    }
}
