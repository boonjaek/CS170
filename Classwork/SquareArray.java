public class SquareArray
{
	public static void main(String[] args)
	{
		Turtle t = new Turtle();

		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				for(int k = 0; k < 3; k++)
				{
					t.forward(100);
					t.left(120);
				}
			t.penup();
			t.forward(200);
			t.pendown();
			}
		t.left(180);
		t.penup();
		t.forward(1000);
		t.left(90);
		t.forward(200);
		t.left(90);
		t.pendown();
		}
	}
}