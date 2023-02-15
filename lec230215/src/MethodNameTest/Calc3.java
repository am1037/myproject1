package MethodNameTest;

public class Calc3 {
    int am, pm, price;
    int temp;
    Calc3(int am, int pm, int price){
        this.am=am;
        this.pm=pm;
        this.price=price;
    }

    public void getCustomer(){
        System.out.println("오늘 온 손님은 총 "+(am+pm)+"명 입니다.");
    }

    public void getAMPMd(){
        String str="두 손님이 같습니다.";
        if(am>pm) str="오전 손님이 더 많습니다.";
        if(pm>am) str="오후 손님이 더 많습니다.";
        System.out.println("오전 오후 손님의 차이는 "+Math.abs(am-pm)+"명으로 "+str);
    }

    public void getAMPrice(){
        System.out.println("오전 손님이 낸 가격의 합은 "+am*price+"원 입니다.");
    }
    public void getPMPrice(){
        System.out.println("오전 손님이 낸 가격의 합은 "+pm*price+"원 입니다.");
    }

    public void getTotalPrice(){
        temp = ((am+pm)*price);
        System.out.println("오전 손님이 낸 가격의 합은 "+temp+"원 입니다.");
    }

    public void getAvgCost(){
        if(temp>0) System.out.println("손님의 평균 계산액은 "+(double)temp/(am+pm)+"원 입니다");
        else System.out.println("총 액수를 먼저 계산해주세요");
    }
}
