package ClassTest;

import java.util.ArrayList;
import java.util.List;

public class Daughter {
    String name;
    int birth_year;
    static int howmany = 0;
    static int dad_money = 0;
    static List<Daughter> list = new ArrayList<>();

    public Daughter(String name, int birth_year){
        this.name=name;
        this.birth_year=birth_year;
        howmany++;
        list.add(this);
    }

    public static void setDad_money(int M){
        dad_money = M;
    }

    public static void papaMoney(){
        System.out.println("아버지 재산은 "+(-1000*howmany+10000)+"원");
    }

    public static void daughterAssemble(){
        for(Daughter d : list){
            System.out.print("이름 : "+d.name+", 생년 : "+d.birth_year+"\n");
        }
    }
}
