package ClassTest;

import java.util.ArrayList;
import java.util.List;

public class Account {
    String owner;
    String where;
    int balance;
    List<String> list;
    static int account;

    public Account(String owner, String where, int balance){
        account++;
        this.owner=owner;
        this.where=where;
        this.balance=balance;
        list = new ArrayList<String>();
    }

    public void deposit(int money){
        this.balance += money;
        list.add("<입금> 액수 : "+money+"   잔액 : "+balance);
        System.out.println("잔액은 "+balance+"원 입니다.");
    }

    public void withdraw(int money){
        if(this.balance-money>=0) {
            this.balance -= money;
            list.add("<출금> 액수 : "+money+"   잔액 : "+balance);
            System.out.println("잔액은 "+balance+"원 입니다.");
        }
        else System.out.println("잔액이 0원 미만이 됩니다.");
    }

    public String getOwner(){
        return owner;
    }

    public String getWhere(){
        return where;
    }

    public int getBalance(){
        return balance;
    }

    public void showStatement(){
        System.out.println("통장주 : "+getOwner());
        System.out.println("주거래은행 : "+getWhere());
        for(String str:list){
            System.out.println(str);
        }
    }


}
