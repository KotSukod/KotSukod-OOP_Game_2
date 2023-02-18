package Unit;

public class Rogue extends Character {

    public Rogue(String name, int HP, int attack, int speed, int defent) {
        super(name, HP, attack, speed, defent);
    }

    public int getDoubleAttack(){
        return getAttack() * 2;
    }
}
