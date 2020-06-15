package lesson1.dz1;

import lesson1.dz1.competitors.Cat;
import lesson1.dz1.competitors.Competitor;
import lesson1.dz1.competitors.Human;
import lesson1.dz1.competitors.Robot;
import lesson1.dz1.obstacles.Obstacle;
import lesson1.dz1.obstacles.Track;
import lesson1.dz1.obstacles.Wall;

public class Main {
    public static void main(String[] args) {

        Competitor[] competitors = {
                new Human("Bob", 1000, 1),
                new Cat("Barsik", 500, 1),
                new Cat("Tigr",800, 2),
                new Robot("Terminator", 100_000, 10),
                new Human("John", 1800,2)
        };

        Obstacle[] obstacles = {
                new Track(600),
                new Wall(2),
        };

        for (Competitor c:competitors ) {
            for (Obstacle o:obstacles ) {
                o.doIt(c);
                if(!c.isOnDistance()){
                    break;
                }
            }
        }

    }
}
