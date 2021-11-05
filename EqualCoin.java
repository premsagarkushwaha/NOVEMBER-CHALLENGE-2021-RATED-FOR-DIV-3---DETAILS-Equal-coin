/*Chef has X coins worth 1 rupee each and Y coins worth 2 rupees each. He wants to distribute all of these X+Y coins to his two sons so that the total value 
of coins received by each of them is the same. Find out whether Chef will be able to do so.

Input Format
The first line of input contains a single integer T, denoting the number of testcases. The description of T test cases follows.
Each test case consists of a single line of input containing two space-separated integers X and Y.
Output Format
For each test case, print "YES" (without quotes) if Chef can distribute all the coins equall
y and "NO" otherwise. You may print each character of the string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES"
will all be treated as identical).
*/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =0;i<n;i++)
		{
		    ArrayList<Integer> list = new ArrayList<>();
		    for(int j=0;j<2;j++)
		    {
		        int a = sc.nextInt();
		        list.add(a);
		    }
		    int one = list.get(0)*1;
		    int two = list.get(1)*2;
		    if((one+two)>0&&(one+two)%2==0)
		    {
		        
		        if(list.get(0)%2==0)
		        {
		            if(list.get(0)==0)
		            {
		                if(list.get(1)%2==0)
		                {
		                    System.out.println("YES");
		                }
		                else{
		                    System.out.println("NO");
		                }
		            }
		            else{
		                System.out.println("YES");
		            }
		        }
		        else
		            System.out.println("NO");
		        //System.out.println(one);
		        //System.out.println(two);
		    }//
		    
		    else{
		        System.out.println("NO");
		    }
		        
		    }
		}
	}
