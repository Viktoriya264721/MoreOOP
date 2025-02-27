package lotr;

import lombok.Setter;
import kick.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @Setter @AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;
    private KickStrategy KickStrategy;

    public void kick(Character opponent){
        KickStrategy.kick(this, opponent);
    }

    public boolean isAlive() {
        return getHp() > 0;
    }

    public void setHp(int hp){
        this.hp = hp > 0 ? hp:0;
    }

    public String toString(){
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power +"}";
    }

}
