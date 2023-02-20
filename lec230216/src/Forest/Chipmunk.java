package Forest;

public class Chipmunk extends Animal{
    public Chipmunk(int x_Loc) {
        super(x_Loc);
    }

    @Override
    public void eat(){
        System.out.println("도토리를 먹습니다.");
    }
}
