public class CricketScorecardTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        String team1 = "Team1"; 
        String team2 = "Team2"; 

       =
        String[] team1Players = new String[11];
        String[] team2Players = new String[11];

        //Team 1
        System.out.println("Enter names of players for " + team1 + ":");
        for (int i = 0; i < 11; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            team1Players[i] = scanner.nextLine();
        }

        //Team 2
        System.out.println("Enter names of players for " + team2 + ":");
        for (int i = 0; i < 11; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            team2Players[i] = scanner.nextLine();
        }

    }
}
