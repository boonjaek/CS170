public class Polygons
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

	// Moves a turtle t forward n units without drawing 
	public static void Move(Turtle t, int n)
	{
		t.penup();
		t.forward(n);
		t.pendown();
	}

	public static void main(String[] args)
	{
		Turtle t = new Turtle(); 
		DashLine(t, 5, 100);
	}
}