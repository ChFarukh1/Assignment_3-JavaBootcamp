public class CricketScorecardTask4 {
    public static void main(String[] args) {
        String[] team1Players = {"Player1", "Player2", ... };
        int[] team1Scores = {30, 50, ...};
        int[] team1Balls = {20, 25, ...};
        int team1Total = 180;
        int team1Wickets = 8;

        // Show score of Team 1
        System.out.println("\n--- " + "Team 1" + " Scorecard ---");
        for (int i = 0; i < 11; i++) {
            if (team1Scores[i] > 0 || team1Balls[i] > 0) { 
                double strikeRate = (double) team1Scores[i] / team1Balls[i] * 100;
                System.out.println(team1Players[i] + ": " + team1Scores[i] + " (" + team1Balls[i] + " balls) - Strike Rate: " + String.format("%.2f", strikeRate));
            }
        }

        // Show the  total score
        System.out.println("Total Score: " + team1Total + " / " + team1Wickets);
    }
}
