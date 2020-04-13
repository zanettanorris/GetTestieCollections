package rocks.zipcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {

     class Player implements Comparable<Player> {
        private int ranking;
        private String name;
        private int age;

        public void setRanking(int ranking) {
            this.ranking = ranking;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getRanking() {
            return ranking;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public Player(int ranking, String name, int age) {
            this.ranking = ranking;
            this.name = name;
            this.age = age;

        }

        // constructor, getters, setters
        @Override
        public int compareTo(Player otherPlayer) {
            return (this.getRanking() - otherPlayer.getRanking());
        }
    }
            List<Player> footballTeam = new ArrayList<>();
            Player player1 = new Player(59, "John", 20);
            Player player2 = new Player(67, "Roger", 22);
            Player player3 = new Player(45, "Steven", 24);
            footballTeam.add(player1);
            footballTeam.add(player2);
            footballTeam.add(player3);

            System.out.println("Before Sorting : " + footballTeam);
            Collections.sort(footballTeam);
            System.out.println("After Sorting : " + footballTeam);
        }
}

