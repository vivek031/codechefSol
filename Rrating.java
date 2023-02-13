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
        int i=0;
        PriorityQueue<Integer> pqs=new PriorityQueue<>();
		PriorityQueue<Integer> pqe=new PriorityQueue<>();
		while(t-->0)
		{   
		    
            
		    if(scan.nextInt()==1){
                int element=scan.nextInt();
    		    i++;
    		        pqe.add(element);
    		        pqs.add(-pqe.poll());
    		        if(i%3==0)
    		            pqe.add(-pqs.poll());
    		                    
    		            
    		        
    		    }
		    else{
		        if(pqe.isEmpty()){
		            System.out.println("No reviews yet");
		        }else{
		            System.out.println(pqe.peek());
		        }
		    }	    
		}
	}
}
