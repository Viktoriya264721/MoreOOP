package lotr;

import java.util.Random;
import kick.KingStrategy;

public class Knight extends Character {
    public Knight() {
        super(generateRandomValue(), generateRandomValue(), new KingStrategy());
    }

    public static int generateRandomValue() {
        Random random = new Random();
        return 2 + random.nextInt(13);
    }
}
