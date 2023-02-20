package Unit;

public class Monk extends  Character{

    String name;

    int manaMax = 30;
    int mana = manaMax;

    public Monk(String name, int HP, int attack, int speed, int defent) {
        super(HP, attack, speed, defent);
        this.name = name;
    }

    public Monk(String name){
        super(20, 5, 6, 7);
        this.name = name;
    }



    public int getHealth(){
        mana -= 10;
        return 5;

    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info
                .append("Монах")
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
