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
    		        if(i%3==1||i%3==2){
    		            if(pqe.isEmpty()){
    		                pqs.add(-element);
    		            }
    		            else{
    		                if(pqe.peek()<element){
    		                    pqs.add(-pqe.poll());
    		                    pqe.add(element);
    		                }
    		                else{
    		                    pqs.add(-element);
    		                }
    		            }
    		        }else{
    		            
    		                if(-pqs.peek()>element){
    		                    pqe.add(-pqs.poll());
    		                    pqs.add(-element);
    		                }
    		                else{
    		                    pqe.add(element);
    		                }
    		            
    		        }
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
