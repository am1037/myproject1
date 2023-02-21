package ListQueueSetMap;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList list3 = new ArrayList();
        ArrayList list4 = new ArrayList();
        for(int a:new int[]{1, 2, 3})
        {list1.add(a); list2.add(a+3);}
        for(int a:new int[]{0, 1, 2})
        {list2.set(a, list1.set(a, list2.set(a, a)));}
        //System.out.println(list2.set(1, list1.set(1, list2.set(1, 1))));
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list2.addAll(list1));

        list3.add("박스키");
        list3.add("송스키");
        list3.add("김스키");
        list3.add("송스키");
        list3.add("정스키");
        //list3.remove("송스키");
        System.out.println(list3.indexOf("송스키"));
        System.out.println(list3.lastIndexOf("송스키"));
        String banchik = (String) list3.remove(1);
        System.out.println(list3);
        System.out.println(banchik);

        list4.add(list4);
        list4.addAll(list4);
        System.out.println(list4);


        Random r = new Random(1);
        for(int i=0; i<10; i++){
            list.add(r.nextInt(10));
        }
        System.out.println(list);
        r.setSeed(1);
        for(int i=0; i<10; i++){
            list.add(r.nextInt(10));
        }
        System.out.println(list);

        //add, remove, contain, set
    }
}
