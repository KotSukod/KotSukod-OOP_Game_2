package Unit;

public  class Character {

    String name;
    protected int HP;
    protected int attack;
    protected int defent;
    protected int speed;

    public Character(String name, int HP, int attack, int speed, int defent){

        this.name = name;
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
    public int getHP(){
        return 0;
    }

}

