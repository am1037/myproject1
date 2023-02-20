package DecoratorTest;

public class LuxuryCar extends CarCenter{
    public LuxuryCar(Car c){
        super(c);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.println("비싼 자동차가 되었습니다.");
    }

    public void runLuxury(){
        System.out.println("번쩍부릉");
    }
}
