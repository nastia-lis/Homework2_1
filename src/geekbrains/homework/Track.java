package geekbrains.homework;

public class Track implements Lets {
    private int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public void run(Track track) {
        System.out.println("Run the track!");
    }

    @Override
    public void jump(Wall wall) {
        System.out.println("Jump over the wall!");
    }

    @Override
    public boolean isEnd() {
        return false;
    }

    public int getLength() {
        return length;
    }
}
