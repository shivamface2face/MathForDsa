package Math;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        System.out.println(isPalin(n));
    }

       static boolean isPalin(int n) {
        int rev=0;
        int temp=n;
        while (temp!=0){
            int ld=temp%10;
            rev=rev*10+ld;
            temp=temp/10;
        }
        return (n==rev);
    }
}
