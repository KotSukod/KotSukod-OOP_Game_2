package Unit;

public class Wizard extends  Character{

    String name;

    int manaMax = 30;
    int mana = manaMax;

    public Wizard(String name, int HP, int attack, int speed, int defent) {
        super(HP, attack, speed, defent);
        this.name = name;
    }

    public Wizard(String name){
        super(25,4,4,4);
        this.name = name;
    }

    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info
                .append("Колдун")
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

    public int getFireBall(){
        mana -= 10;
        return getAttack() * 2;

    }
}
