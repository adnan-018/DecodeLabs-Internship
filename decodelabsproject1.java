
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class decodelabsproject1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        boolean playAgain = true;
        int totalRounds = 0;

        System.out.println("Guess the number game start ho chuki he!");

        // Outer Loop: Multiple rounds control karne ke liye 
        while (playAgain) {
            totalRounds++;
            int guessno = rand.nextInt(100) + 1; // 1 se 100 tak 
            int count = 0;
            int guess = 0;
            int maxAttempts = 10; // limit 
            boolean roundWon = false;

            System.out.println(" ROUND " + totalRounds + " STARTED!");
            System.out.println(" Maximum allowed limit: " + maxAttempts + " attempts.");

            // Inner Feedback Loop
            while (count < maxAttempts && !roundWon) {
                System.out.print("Enter a number (Attempt " + (count + 1) + "/" + maxAttempts + "): ");

                try {
                    guess = sc.nextInt();
                    count++;

                    if (guess > guessno) {
                        System.out.println("-> Too High ");
                    } else if (guess < guessno) {
                        System.out.println("-> Too Low ");
                    } else {
                        System.out.println("\n[SUCCESS] Guess number find successfully in " + count + " attempts!");
                        roundWon = true;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("\n[WARNING] Input Exception captured!");
                    System.out.println("System cannot process non-integer streams.");

                    sc.nextLine();
                    System.out.println("Memory stream cleared. Please enter a numerical entity.\n");
                }
            }

            if (!roundWon) {
                System.out.println("\n[TERMINATION] Attempt limits exhausted. Target number tha: " + guessno);
            }

            sc.nextLine();
            System.out.print("\nKya aap ek aur round khelna chahte hain? (yes/no): ");
            String choice = sc.nextLine().trim().toLowerCase();

            if (!choice.startsWith("y")) {
                playAgain = false;
            }
        }

        System.out.println(" Total Rounds Conducted: " + totalRounds);
        System.out.println(" Verification Phase Code: PASS");

        sc.close();
    }
}
