public class CricketScorecardTask5 {
    public static void main(String[] args) {
        int team1Total = 180;
        int team2Total = 150;
        System.out.println("\n--- Match Result ---");
        if (team1Total > team2Total) {
            System.out.println("Team 1 wins by " + (team1Total - team2Total) + " runs!");
        } else if (team2Total > team1Total) {
            System.out.println("Team 2 wins by " + (team2Total - team1Total) + " runs!");
        } else {
            System.out.println("The match is a tie!");
        }
    }
}
