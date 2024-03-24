package myproject;

import java.util.function.Predicate;

class Predicate impl implements Predicate<Integer>
{
	@override
	public boolean test(Integer t)
	{
		if(t>=18)
			return true;
		else
			return false;
	}
}
public class Predicatefunc {

	public static void main(String[] args)	{
	Predicate<Integer> p = new  Predicateimpl ();
	System.out.println(p.test(35));
	
	Predicate<Integer> pl = (t) ->
	{
		if(t>=18)
			return true;
		else
			return false;
	};
	System.out.println(p1.test(10));
	}
}
