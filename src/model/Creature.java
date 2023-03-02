package model;

public class Creature implements SimElement{
    private static final int HUNGER = 10;
    private int food_reserve;
    private int movement;
    private int pos_x;
    private int pos_y;
    public Creature(int food_reserve, int movement, int pos_x, int pos_y){
        this.food_reserve = food_reserve;
        this.movement = movement;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
    }

    @Override
    public void playTurn() {
        System.out.println("x :" + pos_x + ",y :" + pos_y);
        food_reserve-=HUNGER;
        System.out.println("food : " + food_reserve );
    }

    @Override
    public boolean isAlive() {
        return food_reserve>0;
    }

    public static int getHUNGER() {return HUNGER;}
    public int getFood_reserve() {return food_reserve;}
    public int getMovement() {return movement;}
    public int getPos_x() {return pos_x;}
    public int getPos_y() {return pos_y;}
    public void setFood_reserve(int food_reserve) {this.food_reserve = food_reserve;}
    public void setMovement(int movement) {this.movement = movement;}
    public void setPos_x(int pos_x) {this.pos_x = pos_x;}
    public void setPos_y(int pos_y) {this.pos_y = pos_y;}
}
