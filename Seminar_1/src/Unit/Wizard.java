package Unit;

public class Wizard extends  Character{

    int manaMax = 30;
    int mana = manaMax;

    public Wizard(String name, int HP, int attack, int speed, int defent) {
        super(name, HP, attack, speed, defent);
    }

    public int getFireBall(){
        mana -= 10;
        return getAttack() * 2;

    }
}
