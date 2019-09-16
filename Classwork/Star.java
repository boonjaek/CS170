public class Star 
{
	public static void Star(Turtle t, double length)
	{
		for(int i = 0; i < 5; i++)
		{
			t.forward(length);
			t.right(144);
		}
	}

	public static void main(String[] args)
	{
		Turtle t = new Turtle();
		t.left(144);
		Star(t,100);
	}
}