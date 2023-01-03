// https://www.codechef.com/problems/PETSTORE

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		        arr[i] = sc.nextInt();
		    HashMap<Integer, Integer> hm = new HashMap<>();
		    for(int a : arr)
		        hm.put(a, hm.getOrDefault(a, 0)+1);
		    boolean f = true;
		    for(int a : arr)
		        if(hm.get(a) % 2 == 1){
		            System.out.println("NO");
		            f = false;
		            break;
		        }
		    if(f)
		        System.out.println("YES");
		}
	}
}
