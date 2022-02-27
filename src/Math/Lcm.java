package Math;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int p= in.nextInt();
        int res=Math.max(n,p);
        while (true){
            if (res%n==0 && res%p==0){
                System.out.println(res);
            }
            res++;
        }
      
    }
}
