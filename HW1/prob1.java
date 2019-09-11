
public class prob1 
{

	// Draws an n-polygon of a certain size
	public static void DrawPoly(Turtle t, int n, double size)
	{
		int deg = 360/n; 

		for(int i = 0; i < n; i++)
		{
			t.forward(size);
			t.left(deg);
		}
	}	

	// Draws a castle column with turtle t 
	public static void Column(Turtle t)
	{	

		// Drawing left side of the wall
		t.forward(100);
		t.left(60);
		t.forward(Math.sqrt(500));//20^2 + 10^2 = Length ^ 2
		t.right(60);
		t.forward(20);
		t.right(90);

		//Loop to draw the top wall 
		for(int i = 0; i < 4; i++)
		{
			t.forward(10);
			t.right(90);
			t.forward(10);
			t.left(90);
			t.forward(10);
			t.left(90);
			t.forward(10);
			t.right(90);
		}

		//Drawing right side of the wall
		t.forward(10);
		t.right(90);
		t.forward(20);
		t.right(60);
		t.forward(Math.sqrt(500));
		t.left(60);
		t.forward(100);
		t.right(90);
		t.forward(50);
	}

	public static void Brick(Turtle t)
	{
		//For loop for the entire wall
		for(int i = 0; i < 7; i++)
		{
			
		

		}
	}	

	public static void main(String[] args)
	{
		Turtle t = new Turtle();
		t.left(90);
		Column(t);
		t.right(180);

		t.forward(50);

		Brick(t);
	}


}