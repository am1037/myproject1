package mapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Example{
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("one", "하나");
        map.put("two", "둘");
        map.put("three", "셋");
        map.put("four", "넷");
        map.put("five", "다섯");
        // 해쉬맵 루프 돌리기.
        // -Map계열은 순서가 없어서 루프 돌리기 힘들다.

        //Collection > List - Set
        Set<String> keys = map.keySet(); // 해쉬맵의 키의 집합.
        Iterator<String> iter = keys.iterator();
        while(iter.hasNext()) {
            String key = iter.next(); //*****
            System.out.printf("map.get(\"%s\")=%s\n",key,map.get(key));
        }
    }
}
