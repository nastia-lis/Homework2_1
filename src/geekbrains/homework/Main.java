package geekbrains.homework;

public class Main {

    public static void main(String[] args) {
        Lets[] members = {
                new Human(10, 5),
                new Human(35, 3),
                new Cat(50, 15),
                new Cat(35, 20),
                new Robot(50, 50),
                new Robot(100, 50)
        };
        Lets[] lets = {
                new Track(10),
                new Wall(3),
                new Track(45),
                new Wall(8),
                new Track(125),
                new Wall(2)
        };

        for (int i = 0; i < members.length; i++) {
            for (int j = 0; j < lets.length; j++) {
                if (lets[j] instanceof Track) {
                    members[i].run((Track) lets[j]);
                    if (members[i].isEnd() == true) {
                        break;
                    }
                }
                if (lets[j] instanceof Wall) {
                    members[i].jump((Wall) lets[j]);
                    if (members[i].isEnd() == true) {
                        break;
                    }
                }
            }
        }
    }
}
