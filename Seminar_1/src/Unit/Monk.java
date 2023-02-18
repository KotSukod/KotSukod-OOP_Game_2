package Unit;

public class Monk extends  Character{

    int manaMax = 30;
    int mana = manaMax;

    public Monk(String name, int HP, int attack, int speed, int defent) {
        super(name, HP, attack, speed, defent);
    }

    public int getHealth(){
        mana -= 10;
        return 5;

    }
}
