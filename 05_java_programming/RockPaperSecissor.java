import java.util.*;

public class RockPaperSecissor {
    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[new Random().nextInt(3)];
    }

    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        }
        return "Computer";
    }

    public static String[][] playGames(int rounds) {
        Scanner sc = new Scanner(System.in);
        String[][] results = new String[rounds][3];
        int userWins = 0, computerWins = 0;

        for (int i = 0; i < rounds; i++) {
            System.out.print("Round " + (i + 1) + " - Enter rock/paper/scissors: ");
            String user = sc.next().toLowerCase();
            String computer = getComputerChoice();
            String winner = getWinner(user, computer);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;

            results[i][0] = user;
            results[i][1] = computer;
            results[i][2] = winner;
        }
        sc.close();

        System.out.println("\nGame Results:");
        System.out.println("User\tComputer\tWinner");
        for (String[] row : results) {
            System.out.println(row[0] + "\t" + row[1] + "\t\t" + row[2]);
        }

        double userPercent = (userWins * 100.0) / rounds;
        double computerPercent = (computerWins * 100.0) / rounds;

        System.out.printf("\nUser Wins: %d (%.2f%%)\n", userWins, userPercent);
        System.out.printf("Computer Wins: %d (%.2f%%)\n", computerWins, computerPercent);

        return results;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rounds: ");
        int rounds = sc.nextInt();
        playGames(rounds);
        sc.close();
    }
}
