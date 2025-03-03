import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        String yn = "";
        String trash = "";
        boolean playAgain;
        do {
            boolean done = false;
            do {
                System.out.println("[R-Rock, P-Paper, S-Scissors]\nPlayer A please enter your choice: ");
                playerA = in.nextLine();
                if (playerA.equalsIgnoreCase("R")) {
                    System.out.println();
                    System.out.println("Player A chose Rock!");
                    done = true;
                } else if (playerA.equalsIgnoreCase("P")) {
                    System.out.println();
                    System.out.println("Player A chose Paper!");
                    done = true;
                } else if (playerA.equalsIgnoreCase("S")) {
                    System.out.println();
                    System.out.println("Player A chose Scissors!");
                    done = true;
                } else {
                    trash = in.nextLine();
                    System.out.println("Invalid option. Try Again.");
                    done = false;
                }
            } while (!done);
            do {
                System.out.println();
                System.out.println("[R-Rock, P-Paper, S-Scissors]\nPlayer B please enter your choice: ");
                playerB = in.nextLine();
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println();
                    System.out.println("Player B chose Rock!");
                    done = true;
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println();
                    System.out.println("Player B chose Paper!");
                    done = true;
                } else if (playerB.equalsIgnoreCase("S")) {
                    System.out.println();
                    System.out.println("Player B chose Scissors!");
                    done = true;
                } else {
                    System.out.println("Invalid option. Try Again.");
                    done = false;
                }
            } while (!done);

            if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks Scissors!");
            } else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R")) {
                System.out.println("Paper covers Rock!");
            } else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P")) {
                System.out.println("Scissors cuts Paper!");
            }


            if (playerB.equals(playerA)) {
                System.out.println("It's a tie!");
            } else if (playerB.equalsIgnoreCase("R") && playerA.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks Scissors!");
            } else if (playerB.equalsIgnoreCase("P") && playerA.equalsIgnoreCase("R")) {
                System.out.println("Paper covers Rock!");
            } else if (playerB.equalsIgnoreCase("S") && playerA.equalsIgnoreCase("P")) {
                System.out.println("Scissors cuts Paper!");
            }
            System.out.println();
            System.out.println("[Y-Yes, N-No]\nWould you like to play again?");
            yn = in.nextLine().toUpperCase();
            playAgain = yn.equals("Y");

        }while (playAgain);
            if (yn.equalsIgnoreCase("N")){
                System.out.println("Thanks for playing!");
            }
        in.close();
    }
}
