package ClassTest;

import java.util.List;

public class workers {
    static int workersNum = 0;
    String name;
    int age;
    char gender;
    int workerNum;

    public workers(String str, int age, char gender){
        name = str;
        this.age = age;
        this.gender = gender;
        this.workerNum = workersNum;
        workersNum++;
    }

    public void printInfo(){
        System.out.println("사원번호 : "+workerNum+". 이름 : "+name+", 나이 : "+age+", 성별 : "+gender);
    }
    public static void printInfo2(){
        System.out.println("총 사원수 : "+workersNum);
    }
}
