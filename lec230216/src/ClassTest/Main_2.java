package ClassTest;

public class Main_2 {
    public static void main(String[] args) {
        workers worker0 = new workers("홍길동", 12, 'M');
        workers worker1 = new workers("김길동", 34, 'M');
        workers worker2 = new workers("박길동", 56, 'F');
        workers worker3 = new workers("최길동", 78, 'F');
        worker2.printInfo();
        System.out.println(workers.workersNum);
    }
}
