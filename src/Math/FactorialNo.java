package Math;

import java.util.Scanner;

public class FactorialNo {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int res=1;

        for (int i = 2; i <=n; i++) {
            res=res*i;
        }
        System.out.println(res);
    }
}
