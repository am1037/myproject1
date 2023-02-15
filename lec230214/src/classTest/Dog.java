package classTest;

public class Dog{
    String name;
    String bark;
    int bitePower;

    public Dog(String name, String bark, int P){
        this.name=name;
        this.bark=bark;
        this.bitePower=P;
    }

    public String getName(){
        System.out.println("이 강아지의 이름은 "+name+"입니다.");
        return name;
    }

    public void barkNum(int N){
        for(int i=0; i<N; i++){
            System.out.println(bark);
        }
        System.out.println(N+"번 울었습니다.");
    }

    public void bite(String who){
        System.out.println(name+"가 "+who+"를 물었습니다.");
        System.out.println(bitePower+"만큼 아팠습니다.");
    }

}
