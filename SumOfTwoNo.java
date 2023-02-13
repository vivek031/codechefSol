import java.util.Scanner;

public class SumOfTwoNo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0){
            long n=scan.nextInt();
            String x="",y="";
            int i=0;
            while(n!=0){
                long temp=n%10;
                n/=10;
                if(temp%2==1){
                    i++;
                    if(i%2==0){
                        x=(temp/2)+x;
                        y=((temp+1)/2)+y;
                    }
                    else{
                        x=((temp+1)/2)+x;
                        y=(temp/2)+y;
                    }
                }
                else{
                    x=temp/2+x;
                    y=temp/2+y;
                }
            }
            System.out.println(Long.parseLong(y)+" "+Long.parseLong(x));
        }
        scan.close();
    }
}
