import model.Creature;
import model.Ecosystem;
import model.Food;
import model.SimElement;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Creature c1 = new Creature(35, 1, 0, 0);
        Food f1 = new Food(5, 5);
        ArrayList<SimElement> l1 = new ArrayList<>(){{ add(c1); add(f1); }};
        Ecosystem ecosystem = new Ecosystem(l1);

        while(ecosystem.isAlive()){
            System.out.println("New day\n");
            //Joue le tour de chaque joueur
            for(SimElement e : ecosystem.getElements_list()){
                e.playTurn();
                if(!e.isAlive()){
                    ecosystem.getElements_list().remove(e);
                }
                if(ecosystem.getElements_list().isEmpty()){
                    break;
                }
            }
        }
    }
}