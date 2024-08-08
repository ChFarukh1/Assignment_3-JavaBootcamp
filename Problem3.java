public class CricketScorecardTask3 {
    public static void main(String[] args) {     
        String[] team1Players = {"Player1", "Player2", .... }; 
        String[] team2Players = {"Player1", "Player2", .... };
      
        int totalOvers = 20;
        int team1Total = 0;
        int team2Total = 0;
        int team1Wickets = 0;
        int team2Wickets = 0;

        
        int[] team1Scores = new int[11];
        int[] team1Balls = new int[11];

        for (int i = 0; i < 11 && team1Wickets < 10; i++) {
            team1Scores[i] = simulateRunsScored();
            team1Balls[i] = simulateBallsFaced();
            team1Total += team1Scores[i];

            if (simulateWicketFall()) {
                team1Wickets++;
            }
        }
    }

    private static int simulateRunsScored() {
        Random random = new Random();
        return random.nextInt(50); 
    }

    private static int simulateBallsFaced() {
        Random random = new Random();
        return random.nextInt(30); 
    }

    private static boolean simulateWicketFall() {
        Random random = new Random();
        return random.nextBoolean(); 
    }
}
