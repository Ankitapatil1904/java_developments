package random;
import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {
        int mynum = (int)(Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        int usernum = 0;

        do {
            System.out.println("GUESS THE NUMBER:");
            usernum = sc.nextInt();

            if (usernum == mynum) {
                System.out.println("You guessed the right number!");
                break;
            } else if (usernum > mynum) {
                System.out.println("Number selected is greater.");
            } else {
                System.out.println("Number selected is smaller.");
            }

        } while (usernum >= 0);

        System.out.println("My number was: " + mynum);
        sc.close();
    }
}
