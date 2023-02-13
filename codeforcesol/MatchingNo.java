package codeforcesol;

import java.util.Scanner;

public class MatchingNo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0){
            int n=scan.nextInt();
            if((n&1)==0){
                System.out.println("No");
                continue;
            }
            else{
                System.out.println("Yes");
            }
            int j=2*n;
            
            for(int i=1;i<=(n+1)/2;i++){
                System.out.println(j+" "+i);
                j-=2;
            }
            j=2*n-1;
            for(int i=(n+3)/2;i<=n;i++){
                System.out.println(i+" "+j);
                j-=2;
            }

        }
    }
}
