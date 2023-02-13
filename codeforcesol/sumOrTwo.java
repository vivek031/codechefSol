package codeforcesol;
import java.util.*;
//import java.lang.*;

public class sumOrTwo {
   public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0){
            int n=scan.nextInt();
            int count2=0;
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scan.nextInt();
                if(arr[i]==2){
                    count2++;
                }
            }
            if((count2&1)==1){
                System.out.println(-1);
            }
            else if(count2==0){
                System.out.println(1);
            }
            else{
                int k=count2/2;
                for(int i=0;i<n;i++){
                    if(arr[i]==2){
                        if(k>1){
                            k--;
                        }else{
                            System.out.println(i+1);
                            break;
                        }
                    }
                }
            }
        }
        scan.close();
   } 
}
