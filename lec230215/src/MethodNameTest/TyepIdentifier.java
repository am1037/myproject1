package MethodNameTest;

public class TyepIdentifier {
    public TyepIdentifier(){

    }

    public void print(String str){
        System.out.println("String이 들어갔습니다.");
    }
    public void print(short a){
        System.out.println("숏");
    }
    public void print(int i){
        System.out.println("int가 들어갔습니다.");
    }
    public void print(double d){
        System.out.println("double이 들어갔습니다.");
    }
    public void print(){
        System.out.println("아무도 없었다");
    }
    public void print(int a, double b){
        System.out.println("좌인트우더블");
    }
    public void print(double a, int b){
        System.out.println("우인트좌더블");
    }
    public void print(int a, int b){
        System.out.println("쌍인트");
    }
}
