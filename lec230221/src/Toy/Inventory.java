package Toy;

import java.util.ArrayList;

public class Inventory {
    ArrayList<Item> inventory;

    public Inventory(){
        inventory = new ArrayList<>();
    }

    public void add(Object obj){
        inventory.add((Item) obj);
    }
}
