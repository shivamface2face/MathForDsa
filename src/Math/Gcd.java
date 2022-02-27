package Math;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int res=Math.min(n,p);
        while (res>0){
            if (n%res==0 && p%res==0){
             break;
            }
            res--;
        }
        System.out.println(res);
    }
}
