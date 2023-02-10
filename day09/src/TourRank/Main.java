package TourRank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lastYear = sc.nextLine().split(" ");
        String[] thisYear = sc.nextLine().split(" ");
        for(int i=0; i<lastYear.length;i++){
            if(thisYear[i].equals(lastYear[i])) System.out.println(thisYear[i]);
        }
    }
}
