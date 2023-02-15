package MethodNameTest;

public class Calc {
    double a, b, r;

    Calc(double a, double b){
        this.a=a;
        this.b=b;
    }

    void add(){
        r = a+b;
    }
    void minus(){
        r = a-b;
    }
    void multiple(){
        r = a*b;
    }
    void divide(){
        r = a/b;
    }
    void change(){
        double temp = b;
        this.b = a;
        a = temp;
    }

}
