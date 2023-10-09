package kick;

import lotr.Character;
import java.util.Random;

public class KnightStrategy implements KickStrategy {
    
    private Random random = new Random();

    @Override
    public void kick(Character whokick, Character opponent) {
        if (whokick.getPower() > opponent.getPower()) {
            int damage = random.nextInt(whokick.getPower()) + 1;
            opponent.setHp(opponent.getHp() - damage);
        }
    }
}
