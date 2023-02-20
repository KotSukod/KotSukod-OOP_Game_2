package Unit;

public class Peasant extends Character {

    String name;


    public Peasant(String name, int HP, int attack, int speed, int defent) {

        super(HP, attack, speed, defent);
        this.name = name;
    }

    public Peasant(String name){

        super(20,6,6,6);
        this.name = name;
    }

    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info
                .append("Крестьянен")
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
}
