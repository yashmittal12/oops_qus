import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int n = sc.nextInt();
		    int rev=0;
		    while(n>0){
		        rev = rev+ (n%10);
		        n/=10;
		    }
		    System.out.println(rev);
		}
	}
}
