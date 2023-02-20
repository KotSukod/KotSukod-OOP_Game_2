package Unit;

public class Сrossbowman extends Character{

    String name;

    int concentration = 20;

    public Сrossbowman(String name, int HP, int attack, int speed, int defent) {
        super(HP, attack, speed, defent);
        this.name = name;
    }

    public Сrossbowman(String name){
        super(25,5,5,5);
        this.name = name;
    }

    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info
                .append("Арбалетчик")
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
        return getAttack() * 2;
    }
}
