package Math;

import java.awt.*;
import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(isPrime(n));
        System.out.println(isPrime2(n));
    }

      static boolean isPrime(int n) {
        if (n==1){
            return false;
        }
          for (int i = 2; i <n; i++) {
                 if (n%i==0){
                     return false;
                 }
          }
          return true;
    }
    static boolean isPrime2(int n) {
        if (n==1){
            return false;
        }
        for (int i = 2; i*i<n; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
