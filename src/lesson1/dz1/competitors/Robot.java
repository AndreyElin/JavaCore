package lesson1.dz1.competitors;

public class Robot implements Competitor {
    String type;
    String name;

    int maxRunDistance;
    int maxJumpHeight;

    boolean onDistance;

    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        this.type = "Robot";
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.printf("%s %s успешно пробежал %d  метров\n", type, name, dist);
        } else {
            System.out.printf("%s %s не смог пробежать %d  метров\n", type, name, dist);
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.printf("%s %s успешно прыгнул %d  метров\n", type, name, height);
        } else {
            System.out.printf("%s %s не смог прыгнуть %d  метров\n", type, name, height);
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }
}
