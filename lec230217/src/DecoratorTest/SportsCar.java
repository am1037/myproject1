package DecoratorTest;

public class SportsCar extends CarCenter{
    public SportsCar(Car c){
        super(c);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.println("빠른 자동차가 되었습니다.");
    }

    public void runfast(){
        System.out.println("부부부부부부부부릉");
    }
}
