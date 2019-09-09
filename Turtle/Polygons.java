public class Polygons
{
	public static void DrawPoly(Turtle t, int n)
	{
		int deg = 360/n; 

		for(int i = 0; i < n; i++)
		{
			t.forward(100);
			t.left(deg);
		}
	}

	public static void main(String[] args)
	{
		Turtle t = new Turtle();
		DrawPoly(t, 5);
		t.forward(200);
		DrawPoly(t,8);
	}
}