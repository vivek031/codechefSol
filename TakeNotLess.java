/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan =new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0)
		{
		    int n=scan.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=scan.nextInt();
		    }
		    Arrays.sort(arr);
		    
		    
		    
		        //ArrayList<Integer>grid=new ArrayList<>();
		        int count=1;
		        int ele=arr[0];
		        Boolean flag=false;
		        for(int i=1;i<n;i++){
		            if(arr[i]==ele){
		                count++;
		            }else{
		                if(count%2==1){
		                    System.out.println("Marichka");
		                    flag=true;
		                    break;
		                }
		                count=1;
		                ele=arr[i];
		            }
		        }
		        if(count%2==1){
		              System.out.println("Marichka");
		              flag=true;
		                    
		        }
		        if(flag==false){
		            System.out.println("Zenyk");
		        }
		        
		        
		        
		    
		}
	}
}
