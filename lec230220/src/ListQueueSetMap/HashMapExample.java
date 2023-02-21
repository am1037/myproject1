package ListQueueSetMap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        for(int i=0; i<10; i++){
            hm.put(i, (char)(i+40));
        }
        System.out.println(hm);
        Iterator iter = hm.keySet().iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
