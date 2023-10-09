package kick;
import lotr.Character;

public class ElfStrategy implements KickStrategy{

    @Override
    public void kick(Character whokick, Character opponent) {
        if(whokick.getPower() > opponent.getPower()){
            opponent.setHp(0);
        } else{
            whokick.setPower(whokick.getPower() - 1);
        }
    }
}

