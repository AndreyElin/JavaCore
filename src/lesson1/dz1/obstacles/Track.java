package lesson1.dz1.obstacles;

import lesson1.dz1.competitors.Competitor;

public class Track implements Obstacle {
    private int dist;

    public Track(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor c) {
        c.run(dist);
    }
}
