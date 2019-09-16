public class top
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

	public static void Concentric(Turtle t, int n,int numPoly, int size)
	{
		for(int i = 1; i <= numPoly; i++)
		{
			DrawPoly(t, n, size);
			
		}
	}

	public static void main(String[] args)
	{
		Turtle t = new Turtle();
		Concentric(t, 4, 5, 10);
	}
}