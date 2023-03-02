package model;

import java.util.ArrayList;

public class Ecosystem {
    private ArrayList<SimElement> elements_list;

    public Ecosystem(ArrayList<SimElement> elements_list){
        this.elements_list = elements_list;
    }

    public Ecosystem(){
        this(new ArrayList<>());
    }

    public boolean isAlive(){
        return !this.elements_list.isEmpty();
    }

    public ArrayList<SimElement> getElements_list() {return elements_list;}
    public void setElements_list(ArrayList<SimElement> elements_list) {this.elements_list = elements_list;}
}
