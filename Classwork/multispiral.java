public class multispiral
{

	// Draws an n-polygon taking in a turtle and a size
	public static void DrawPoly(Turtle t, int n, double size)
	{
		int deg = 360/n; 

		for(int i = 0; i < n; i++)
		{
			t.forward(size);
			t.left(deg);
		}
	}

	public static void Spiral(Turtle t, int size, int numPoly, int n)
	{
		for(int i = 1; i <= numPoly; i++)
		{
			DrawPoly(t, n, size*i);
		}
	}

	public static void main(String[] args)
	{
		Turtle t = new Turtle();
		// t.penup();
		// t.right(90);
		// t.forward(500);
		// t.right(90);
		// t.forward(150);
		// t.right(180);
		// t.pendown();
		Spiral(t, 1, 10, 100);
	}
}