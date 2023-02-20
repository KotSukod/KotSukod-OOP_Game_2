package Unit;

public class Sniper extends Character{

    String name;

    int concentration = 20;

    public Sniper(String name, int HP, int attack, int speed, int defent) {
        super(HP, attack, speed, defent);
        this.name = name;
    }

    public Sniper(String name){
        super(30, 5, 5, 5);
        this.name = name;
    }

    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info
                .append("Снайпер")
                .append('\n')
                .append("Имя " + name)
                .append('\n')
                .append("Жизни " + HP)
                .append('\n')
                .append("Скорость " + speed)
                .append('\n')
                .append("Атака " + attack)
                .append('\n')
                .append("Защита " + defent)
                .append('\n');

        return info.toString();
    }

    public int getSniperShot(){
        concentration -= 10;
        return getAttack() * 3;
    }
}
