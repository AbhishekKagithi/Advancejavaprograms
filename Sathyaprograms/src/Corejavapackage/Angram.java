package Corejavapackage;
import java.util.*;
public class Angram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2;
		
		int i,j,count = 0; 
		System.out.println("Enter the strings");
		Scanner s = new Scanner(System.in);
		s1 = s.nextLine();
		s2 = s.nextLine();
		if(s1.length() == s2.length()) {
			System.out.println("Anagram is possible");
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray(),temp1,temp2;
		for(i =0;i<ch1.length;i++)
		{
			for(j = i+1;j<ch2.length;j++)
			{
				if(ch1[i] >ch1[j] )
				{
					temp1 = ch1[i];
				    ch1[i] = ch1[j];
				    ch1[j] = temp1;
				}
				if(ch2[i]>ch2[j])	
				{
					temp2 = ch2[i];
				    ch2[i] = ch2[j];
				    ch2[j] = temp2;
				}
			}
			}
		for(i = 0;i<ch1.length;i++)
		{
			if(ch1[i] == ch2[i])
				count++;
		}
		if(count == s1.length())
			System.out.println("the given strings are anagram");
		else
			System.out.println("the given strings are not anagram");
		}
		else
			System.out.println("anagram is not possible");

	}

}
