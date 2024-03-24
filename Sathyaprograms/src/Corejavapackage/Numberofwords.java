package Corejavapackage;

public class Numberofwords 
{
	public static void main(String[] args) {
		String s = "Six sixes in an over what an over";
		int count = 0;
		for(int i = 0;i<s.length();i++)
		{
			if(s.charAt(i) == ' ')
				count++;
		}
		System.out.print(count+1);
	}

}
