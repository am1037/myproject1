package AutoTypeCasting;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        int a = 1;
        double b = 2.2;
        String s = "abc";
        list.add(a);
        list.add(b);
        list.add(s);
        for(Object listE : list) {
            System.out.println(listE.getClass());
        }
        //System.out.println(list.get(0)+1);
        System.out.println((int)list.get(0)+1);
        System.out.println(list.get(1)+"efg");
        System.out.println(list.get(2)+"efg");
    }
}
