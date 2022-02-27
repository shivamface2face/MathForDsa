package Math;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int x=in.nextInt();
        int ans=Po(n,x);
        System.out.println(ans);
    }

           static int Po(int n, int x) {
               int res=1;
               for (int i = 0; i <n; i++) {
                   res=res*x;
               }
               return res;
    }
}
