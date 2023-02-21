package ListQueueSetMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Random r = new Random(501);

        for(int i=0; i<10; i++){
            al.add(r.nextInt(10));
        }
        Iterator iter = al.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next()+", "+iter.hasNext());
        }

        System.out.println(al);
    }
}
