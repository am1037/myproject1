package TreeGame4;

import java.util.*;

public class GamePlay {
    List<TreeElements> hand = new ArrayList<>();
    List<TreeElements> deck = new ArrayList<>();
    List<TreeElements> tree = new ArrayList<>();
    int numApple = 2;   // number of apples
    Leaf[] leaves;
    Branch[] branches;
    Fruit[] fruits;

    public GamePlay(int seed){
        // hand and deck are created here
        Random r = new Random(seed);
        leaves = new Leaf[10];
        branches = new Branch[10];
        fruits = new Fruit[2];

        for(int i=0; i<10; i++){
            leaves[i] = new Leaf(i);
            branches[i] = new Branch(i);
            deck.add(leaves[i]);
            deck.add(branches[i]);
        }
        for(int i=0; i<numApple; i++){
            fruits[i] = new Fruit();
            deck.add(fruits[i]);
        }
        Collections.shuffle(deck, r); //shuffle
        makeHand();

        while (deck.size()!=0){
            //gamegoes
        }


    }

    public void makeHand(){
        for(int i=0; i<6; i++){
            TreeElements te = deck.remove(0);
            hand.add(te);
        }
    }

    public void printHand(){
        System.out.println("This is hand");
        for(TreeElements t:hand){
            System.out.print(t.name+", ");
        }
        System.out.println("");
    }
    public void printDeck(){
        System.out.println("This is deck");
        for(TreeElements t:deck){
            System.out.print(t.name+", ");
        }
        System.out.println("");
    }
    public void printTree(){ // this method need to be improved to describe shape of tree.
        System.out.println("This is tree");
        for(TreeElements t:tree){
            System.out.print(t.name+", ");
        }
        System.out.println("");
    }
}
