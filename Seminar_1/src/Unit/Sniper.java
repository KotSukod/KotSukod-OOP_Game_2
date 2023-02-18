package Unit;

public class Sniper extends Character{

    int concentration = 20;

    public Sniper(String name, int HP, int attack, int speed, int defent) {
        super(name, HP, attack, speed, defent);
    }

    public int getSniperShot(){
        concentration -= 10;
        return getAttack() * 3;
    }
}
