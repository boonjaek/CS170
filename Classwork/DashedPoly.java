public class DashedPoly
{
	// Draws dashed polygons
	// # of Steps = L / 2(num)
	public static void DashLine(Turtle t, int numDashes, double length)
	{
		for(int i = 0; i < numDashes - 1; i++)
		{
			t.forward(length / (2 * numDashes -1));
			t.penup();
			t.forward(length / (2 * numDashes -1));
			t.pendown();
		}
		t.forward(length / (2 * numDashes -1)); //Last Dash
	}


	// Draws an n-polygon taking in a turtle and a size
	public static void DashPoly(Turtle t, int n, int numDashes, double size)
	{
		int deg = 360/n; 

		for(int i = 0; i < n; i++)
		{
			DashLine(t, numDashes, size);;
			t.left(deg);
		}
	}	

	public static void main(String[] args)
	{
		Turtle t = new Turtle();

		DashPoly(t, 7, 7, 100);
	}
}