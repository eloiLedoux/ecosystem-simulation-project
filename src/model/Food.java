package model;

public class Food implements SimElement {
    private int pos_x;
    private int pos_y;

    public Food(int pos_x, int pos_y){
        this.pos_x = pos_x;
        this.pos_y = pos_y;
    }

    @Override
    public void playTurn() {
        System.out.println("x :" + pos_x + ",y :" + pos_y);
    }

    @Override
    public boolean isAlive() {
        return true;
    }

    public int getPos_x() {return pos_x;}
    public int getPos_y() {return pos_y;}
    public void setPos_x(int pos_x) {this.pos_x = pos_x;}
    public void setPos_y(int pos_y) {this.pos_y = pos_y;}
}
