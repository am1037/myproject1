package ClassTest;

public class CoffeeTruck extends Truck {
    public CoffeeTruck(){
        System.out.println("커피 트럭입니다.");
    }

    @Override
    public void run(){
        System.out.println("장사를 할겁니다.");
    }

    @Override
    public void Cargo(){
        System.out.println("짐칸에는 커피가 가득 있습니다.");
    }
}
