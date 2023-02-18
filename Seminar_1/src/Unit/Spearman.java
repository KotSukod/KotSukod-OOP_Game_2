package Unit;

public class Spearman extends Character{

    public Spearman(String name, int HP, int attack, int speed, int defent) {
        super(name, HP, attack, speed, defent);
    }

    public int getStrongAttack(){
        return getAttack() * 2;
    }
}
