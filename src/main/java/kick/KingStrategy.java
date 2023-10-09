package kick;

import lotr.Character;
// import java.util.Random;

public class KingStrategy implements KickStrategy {
    @Override
    public void kick(Character whokick, Character opponent) {
        opponent.setHp(opponent.getHp() - whokick.getPower());
    }
}
