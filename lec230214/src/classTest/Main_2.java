package classTest;

public class Main_2 {
    public static void main(String[] args) {
        Dog dog_1 = new Dog("Happy", "haphap", 10);
        Dog dog_2 = new Dog("Saddy", "sadsad", 10);
        Doggy doggy = new Doggy("Smally", "smalsmal", 1);
        dog_1.getName();
        dog_1.barkNum(2);
        dog_2.getName();
        dog_2.barkNum(3);
        dog_2.bite(dog_1.getName());
        doggy.bite("");
    }
}
