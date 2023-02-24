package Toy;

public interface Item {
    // consumable, usable, equipment, none
    int itemType = 0; //
    public boolean consume();
    public boolean use();
    public boolean equip();
}
