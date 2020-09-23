package geekbrains.homework;

public class Wall implements Lets {
    private int height;

    public Wall(int height) {
        this.height = height;
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

    public int getHeight() {
        return height;
    }
}
