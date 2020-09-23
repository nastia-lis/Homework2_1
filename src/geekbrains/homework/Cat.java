package geekbrains.homework;

public class Cat implements Lets {
    private int maxRunning;
    private int maxJumping;
    private boolean end;

    public Cat(int maxRunning, int maxJumping) {
        this.maxRunning = maxRunning;
        this.maxJumping = maxJumping;
        end = false;
    }

    @Override
    public void run(Track track) {
        if (track.getLength() <= maxRunning) {
            System.out.println("Cat, run the track " + track.getLength() + " meters!");
        } else {
            System.out.println("Can't overcome!");
            end = true;
        }
    }

    @Override
    public void jump(Wall wall) {
        if (wall.getHeight() <= maxJumping) {
            System.out.println("Cat, jump over the wall " + wall.getHeight() + " meters!");
        } else {
            System.out.println("Can't overcome!");
            end = true;
        }
    }

    @Override
    public boolean isEnd() {
        if (end == true) {
            System.out.println("Cat end the distance");
            return true;
        }
        return false;
    }
}
