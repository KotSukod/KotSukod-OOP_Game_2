package Unit;

import Unit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Main  {
    public static void main(String[] args) {

        //Peasant peasant         = new Peasant(getName(), 5, 2, 5, 1);
        //Rogue rogue             = new Rogue("Bolt",60,5,5,3);
        //Sniper sniper           = new Sniper("Glor",20,8,8,2);
        //Wizard wizard           = new Wizard("Flex",20,6,5,1);
        //Spearman spearman       = new Spearman("Bob",20,5,5,5);
        //Сrossbowman сrossbowman = new Сrossbowman("Joy",20,5,5,5);

        ArrayList<Character> list = new ArrayList<>();
        list.add(new Monk(getName()));
        list.add(new Peasant(getName()));
        list.add(new Rogue(getName()));
        list.add(new Sniper(getName()));
        list.add(new Spearman(getName()));
        list.add(new Wizard(getName()));
        list.add(new Сrossbowman(getName()));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getInfo());

        }

    }



    private static String getName(){
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }


}
