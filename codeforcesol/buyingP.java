package codeforcesol;

import java.util.Scanner;

public class buyingP {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        long t=scan.nextLong();
        while(t-->0){
            long a=scan.nextLong();
            long b=scan.nextLong();
            long n=scan.nextLong();
            long m=scan.nextLong();
            if(a<=b){
                System.out.println((long)((n/(m+1))*m*a+(n%(m+1))*a));
            }
            else{
                float ta=a,tm=m;
                if(b>=((ta*tm)/(tm+1.0))){
                    System.out.println((long)((n/(m+1))*m*a+(n%(m+1))*b));
                }
                else{
                    System.out.println((long)(n*b));
                }
            }
            

        }
        scan.close();
    }
}
