package Unit;

public abstract class Character implements GameInterface_1 {

    public void setHP(int HP) {
        if (HP >= 0) this.HP = HP;
    }
    public int getHP() { return HP;}

    //String name;
    protected int HP;
    protected int attack;
    protected int defent;
    protected int speed;

    public Character(int HP, int attack, int speed, int defent){

        //this.name = name;
        this.HP = HP;
        this.attack = attack;
        this.speed = speed;
        this.defent = defent;
    }

    public int getAttack(){
        return attack;
    }

    public int getDefent(){
        return 0;
    }
    public int getSpeed(){
        return 0;
    }

    @Override
    public void step(){}

    @Override
    public String getInfo(){
        StringBuilder info = new StringBuilder();
        info

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

