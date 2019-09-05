public class HelloTurtle
{
	public static void main(String[] args)
	{
		Turtle bob = new Turtle();
		for(int i = 0; i < 4; i++)
		{
			bob.forward(100);
			bob.left(90);
		}
	}
}