package Math;

import java.util.Scanner;

public class NoOfTrailingZero {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int fact=1;
        for (int i = 2; i <=n ; i++) {
            fact=fact*i;
        }
        int res=0;
        while (fact%10==0){
            res++;
            fact=fact/10;
        }
        System.out.println(res);

    }
}
