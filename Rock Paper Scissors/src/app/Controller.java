package app;

import java.lang.Math;
import java.util.Scanner;

public class Controller {
    public static void main(String args[]) {
        //create new Scanner to house user input
        Scanner pick = new Scanner(System.in);
        System.out.println("Type rock, paper or scissors to make your selection");
        //house user input as selection
        String selection = pick.nextLine();
        //if user types valid response
        if (selection.equals("rock") || selection.equals("paper") || selection.equals("scissors")) {
            //choose random number 1 to 3
            int max = 3;
            int min = 1;
            int range = max - min + 1;
            double rand = Math.round((Math.random() * range)) + min;
            //3 equals rock
            if (rand == 3.0) {
                System.out.println("The computer chose rock");
            }
            //2 equals paper
            if (rand == 2.0) {
                System.out.println("The computer chose paper");
            }
            //1 equals scissors
            if (rand == 1.0) {
                System.out.println("The computer choose scissors");
            }
            //Draw scenario
            if (selection.equals("rock") && rand==3.0 || selection.equals("paper") && rand == 2.0 || selection.equals("scissors") && rand == 1.0) {
                System.out.println("Draw!");
                //create Scanner to house replay decision
                Scanner play = new Scanner(System.in);
                System.out.println("Play again? Type yes or no.");
                String decision = play.nextLine();
                //play again scenario. Calls main method.
                if (decision.equals("yes")) {
                    main(null);
                }
                //exits system
                else if (decision.equals("no")){
                    System.exit(0);
                }
                else {
                    System.out.println("Choose yes or no!");
                    System.exit(0);
                }
            }
            //Losing scenario
            if (selection.equals("rock") && rand==2.0 || selection.equals("paper") && rand == 1.0 || selection.equals("scissors") && rand == 3.0) {
                System.out.println("You Lose!");
                Scanner play = new Scanner(System.in);
                System.out.println("Play again? Type yes or no.");
                String decision = play.nextLine();
                if (decision.equals("yes")) {
                    main(null);
                }
                else if (decision.equals("no")){
                    System.exit(0);
                }
                else {
                    System.out.println("Choose yes or no!");
                    System.exit(0);
                }
            }
            //Winning scenario
            if (selection.equals("rock") && rand==1.0 || selection.equals("paper") && rand == 3.0 || selection.equals("scissors") && rand == 2.0) {
                System.out.println("You win!");
                Scanner play = new Scanner(System.in);
                System.out.println("Play again? Type yes or no.");
                String decision = play.nextLine();
                if (decision.equals("yes")) {
                    main(null);
                }
                else if (decision.equals("no")){
                    System.exit(0);
                }
                else {
                    System.out.println("Choose yes or no!");
                    System.exit(0);
                }
            }
        }
        //If user types invalid response
        else {
            System.out.println("Please type one of the three options");
            System.exit(0);
        }
    }
}
