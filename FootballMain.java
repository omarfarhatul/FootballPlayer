abstract class FootballPlayer {
    String name;
    int goal;
    double salary;

    FootballPlayer(String name, int goal) {
        this.name = name;
        this.goal = goal;
    }

    abstract double calculateGoalRate(int matchPlayed);

    // Set salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Get salary
    public double getSalary() {
        return salary;
    }
}

class LaLigaPlayer extends FootballPlayer {
        @Override
    double calculateGoalRate(int matchPlayed) {
        return (double) goal / matchPlayed;
    }

    LaLigaPlayer(String name, int goal) {
        super(name, goal);
    }
}

class PremierLeaguePlayer extends FootballPlayer {
        @Override
    double calculateGoalRate(int matchPlayed) {
        return (double) goal / matchPlayed;
    }

    PremierLeaguePlayer(String name, int goal) {
        super(name, goal);
    }
}

// Main Class
public class FootballMain {

    public static void main(String[] args) {

        // Messi - LaLiga
        LaLigaPlayer p1 = new LaLigaPlayer("Messi", 33);
        p1.setSalary(2500000);

        // Ronaldo - Premier League
        PremierLeaguePlayer p2 = new PremierLeaguePlayer("Ronaldo", 29);
        p2.setSalary(2250000);

        System.out.println("Player Name: " + p1.name);
        System.out.println("League: LaLiga");
        System.out.println("Goals: " + p1.goal);
        System.out.println("Goal Rate: " + p1.calculateGoalRate(38));

        System.out.println("-------------------------");

        System.out.println("Player Name: " + p2.name);
        System.out.println("League: Premier League");
        System.out.println("Goals: " + p2.goal);
        System.out.println("Goal Rate: " + p2.calculateGoalRate(36));
    }
}