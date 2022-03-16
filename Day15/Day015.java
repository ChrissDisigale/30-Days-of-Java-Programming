//Day 15 - Sorting a List by a specific attribute.
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Day015 {

    public static void main(String[] args) {
        Player bocco = new Player("John Bocco", "Simba SC", "Tanzania", 36);
        Player mayelle = new Player("Fiston Mayelle", "Yanga SC", "Congo", 35);
        Player kapombe = new Player("Shomari Kapombe", "Simba SC", "Tanzania", 33);

        List<Player> players = Arrays.asList(bocco, mayelle, kapombe);

        players.sort(Comparator.comparing(Player::numberOfGoals).reversed());

        System.out.println("Top Scorers:");
        players.forEach(System.out::println);
    }

    private record Player(String name, String club, String coutry, int numberOfGoals) {
    }
}