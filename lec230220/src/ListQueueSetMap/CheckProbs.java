package ListQueueSetMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CheckProbs {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.addAll(List.of(new String[]{"서울", "부산", "대구", "광주", "대전"}));
        System.out.println(hs);

        HashMap hm = new HashMap<>();
        String[] strs1 = {"안방", "거실", "부엌", "현관"};
        String[] strs2 = {"침대", "소파", "냉장고", "신발"};
        for(int i=0; i<strs1.length; i++){
            hm.put(strs1[i], strs2[i]);
        }
        System.out.println(hm);
        System.out.println(hm.get("현관"));
        hm.replace("거실", "책상");
        System.out.println(hm);

        ArrayList<String> toDo = new ArrayList<>();
        String[] toDos = {"아침먹기", "점심먹기", "저녁먹기", "씻기", "자기"};
        for (String str:toDos) {
            toDo.add(str);
        }
        System.out.println(toDo.get(0)+", "+toDo.get(toDo.size()-1));
        toDo.add(1, "청소"
        );
        System.out.println(toDo);
    }
}
