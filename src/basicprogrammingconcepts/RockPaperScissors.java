package basicprogrammingconcepts;


import java.util.Scanner;

public class RockPaperScissors {
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";

    private static final String[] keys = { "rock", "paper", "scissors" };


    private static String getWinner(int user, int computer) {
            if(user==0){ 
                    if (computer== 0)
                        return TIE;
                    if (computer==1)
                        return COMPUTER_PLAYER;
                    if( computer==2)
                        return USER_PLAYER;
                }
            else if (user==1){
                    if (computer==0)
                        return USER_PLAYER;
                    if (computer==1)
                        return TIE;
                    if (computer ==2)
                        return COMPUTER_PLAYER;
                }
             else if  (user==2){
                    if (computer==0)
                        return COMPUTER_PLAYER;
                    if (computer ==1)
                        return USER_PLAYER;
                    if (computer== 2)
                        return TIE;
                }
            
                 return TIE;
    }

    public static int getUserChoice(Scanner s) {

        int userChoice = 0;
        System.out.print("Enter your choice: 1.rock 2.paper 3.scissors : ");

        boolean valid = false;
        while (!valid) {
            userChoice = Integer.parseInt(s.nextLine());
            if (userChoice >= 1 && userChoice <= 3) {
                valid = true;
            } else {
                System.out.println("invalid Response. Try again: ");
            }
        }
        // to make it between 0 to 2
        userChoice--;

        return userChoice;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        char c = 'Y';
        while (c == 'Y' || c == 'y') {

            int rounds= 0;
            System.out.print("how many rounds you want to play: ");
            rounds = Integer.parseInt(s.nextLine());
            if(rounds < 1 || rounds > 10) {
                System.out.println("Invalid rounds.");
                System.exit(1);
            }

            int currentRound = 0;
            int ties=0, userWins=0, compWins=0;

            while(currentRound < rounds) {

                int userChoice = getUserChoice(s);
                int computerChoice = (int) (Math.random() * 3);

                System.out.println("Round " + (currentRound + 1) + ":");
                System.out.println("User picked " + keys[userChoice]);
                System.out.println("Computer picked " + keys[computerChoice]);

                String winner = getWinner(userChoice, computerChoice);
                System.out.println(winner);

                if(winner.equals(USER_PLAYER)) {
                    userWins++;
                }if(winner.equals(COMPUTER_PLAYER)) {
                    compWins++;
                }if(winner.equals(TIE)) {
                    ties++;
                }
                System.out.println();
                currentRound++;
            }

            System.out.println("Match finished");
            System.out.println("User won " + userWins);
            System.out.println("Computer won " + compWins);
            System.out.println("Ties " + ties);
            if(userWins > compWins) {
                System.out.println("Player won!");
            } else if(compWins > userWins) {
                System.out.println("Computer won!");
            } else {
                System.out.println("Match drawn!");
            }

            System.out.print("Do you want to play again(y/n): ");
            c = s.nextLine().charAt(0);
        }

        System.out.println("Thanks for playing!");
        s.close();
    }
}

        
    
    
