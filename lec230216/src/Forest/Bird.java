package Forest;

public class Bird extends Animal{
    public Bird(int x_Loc) {
        super(x_Loc);
    }

    public void fly(){
        x_Loc++;
        x_Loc++;
        System.out.println("현재 위치는 "+x_Loc+"입니다.");
    }

    @Override
    public void eat(){
        System.out.println("지렁이를 먹습니다.");
    }
}
