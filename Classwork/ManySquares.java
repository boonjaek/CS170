public class ManySquares
{
	public static void main(String[] args) 
	{
		//Initialize the turtle
		Turtle bob = new Turtle();

		//Loop to create multiple squares
		for(int i = 0; i < 5; i++)
		{
			//Loop to create a singular square
			for(int j = 0; j < 4; j++)
			{
				bob.forward(100);
				bob.left(90);
			}
		bob.penup();
		bob.forward(200);
		bob.pendown();
		}
	}
}