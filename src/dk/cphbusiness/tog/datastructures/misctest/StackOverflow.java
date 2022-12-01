package dk.cphbusiness.tog.datastructures.misctest;

public class StackOverflow
{
	public static void main(String[] args)
	{
		recurse();
	}

	public static void recurse()
	{
		recurse();
	}
}
