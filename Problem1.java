import java.util.Random;
import java.util.Scanner;

public class CricketScorecardTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name of Team 1: ");
        String team1 = scanner.nextLine();
        System.out.print("Enter name of Team 2: ");
        String team2 = scanner.nextLine();

      
        Random random = new Random();
        boolean team1BatsFirst = random.nextBoolean();

        
        if (team1BatsFirst) {
            System.out.println(team1 + " won the toss and will bat first.");
        } else {
            System.out.println(team2 + " won the toss and will bat first.");
        }
    }
}

