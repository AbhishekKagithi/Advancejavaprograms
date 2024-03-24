package Corejavapackage;

import java.util.*;

public class Removeduplicates
{
	public static void main(String[] args)
	{	
		String s;
		int count = 0;
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		s=sc.nextLine();
		
		for(i=0; i<s.length(); i++)
		{
			for(j=0; j<s.length(); j++)
			{
				if(s.charAt(i)==s.charAt(j))
					break;
			}		
			if(i==j)
				System.out.print(s.charAt(i));
		}
		
	}
}
