package geekbrains.homework;

public class Human implements Lets {
    private int maxRunning;
    private int maxJumping;
    private boolean end;

    public Human(int maxRunning, int maxJumping) {
        this.maxRunning = maxRunning;
        this.maxJumping = maxJumping;
        end = false;
    }

    @Override
    public void run(Track track) {
        if (track.getLength() <= maxRunning) {
            System.out.println("Human, run the track " + track.getLength() + " meters.");
        } else {
            System.out.println("Can't overcome!");
            end = true;
        }
    }

    @Override
    public void jump(Wall wall) {
        if (wall.getHeight() <= maxJumping) {
            System.out.println("Human, jump over the wall " + wall.getHeight() + " meters.");
        } else {
            System.out.println("Can't overcome!");
            end = true;
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "maxRunning=" + maxRunning +
                ", maxJumping=" + maxJumping +
                ", end=" + end +
                '}';
    }

    @Override
    public boolean isEnd() {
        if (end == true) {
            System.out.println("Human end the distance");
            return true;
        }
        return false;
    }
}
