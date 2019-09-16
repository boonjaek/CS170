// Problem 1 for Homework 1
public class prob1 
{
	/*
	Methods needed to be written 
	1. Method to draw an n-polygon X
	2. Method to draw columns X
	3. Method to draw a brick wall X
	4. Method to draw arches
	5. Method to draw trees
	7. Method to draw window arrays
	8. Method to draw stars
	*/


	// Draws an n-sided polygon. Takes in a a turtle t, the number of sides n,
	// and the size of each side size.
	public static void DrawPoly(Turtle t, int n, double size)
	{
		int deg = 360/n; 

		for(int i = 0; i < n; i++)
		{
			t.forward(size);
			t.left(deg);
		}
	}	

	public static void Move(Turtle t, int n)
	{
		t.penup();
		t.forward(n);
		t.pendown();
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

		t.right(180);
		Move(t, 10);
		t.left(90);
		Move(t, 80);
		t.right(90);

		Windows(t);
	}

	/*
	Method to draw first variation of brick wall taking in Turtle t as an input
	*/
	public static void Brick1(Turtle t)
	{
		//For loop to draw the line of bricks
		for(int j = 0; j < 8; j++)
			{
				for(int k = 0; k < 2; k++)
				{
					t.forward(10);
					t.left(90);
					t.forward(5);
					t.left(90);
				}
				t.forward(10);
			}
	}
	
	/*
	Method to draw second variation of brick wall taking in Turtle t as an input
	*/
	public static void Brick2(Turtle t)
	{
		// For loop for the entire line
		for(int i = 0; i < 9; i++)
		{
			if(i == 0 || i == 8)// First and last brick are unique
			{
				for(int j = 0; j < 4; j++)
				{
					t.forward(5);
					t.left(90);
				}
				t.forward(5);
			}
			else
			{
				for(int k = 0; k < 2; k++)//For loop to draw the rest of the bricks
				{
					t.forward(10);
					t.left(90);
					t.forward(5);
					t.left(90);
				}
				t.forward(10);
			}
		}
	}

	/*
	Method that combines Brick1 & Brick2 to form the entire brick wall taking Turtle
	t as an input
	*/
	public static void Brick(Turtle t)
	{
		//For loop for the entire wall, uses variation 2 on odd levels
		for(int i = 0; i < 7; i++)
		{
			if(i%2 != 0)
			{
				Brick2(t);
			}
			else
			{
				Brick1(t);
			}
			t.backward(80);
			t.left(90);
			t.forward(5);
			t.right(90);
		}
	}

	public static void Windows(Turtle t)
	{
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				DrawPoly(t,4,10);
				Move(t,20);
			}
			t.left(180);
			Move(t,40);
			t.left(90);
			Move(t,20);
			t.left(90);
		}
	}


	public static void Arch(Turtle t)
	{
		// Variables needed
		// Radius, # of sides, Degree of turn, circumferance 
		// Radius = a/cos(180/n) a = inradius, n = numSides

		int n = 500;
		double radius1 = 20.0/Math.cos(Math.PI/n);
		double circum1 = 2*Math.PI*radius1;

		
		t.forward(30);

		for(int i = 0; i < n/2; i++)
		{
			t.forward(circum1/n);
			t.right(360.0/n);

		}

		t.forward(30);
		t.right(90);
		t.forward(10);
		t.right(90);
		t.forward(30);

		double radius2 = 10.0/Math.cos(Math.PI/n);
		double circum2 = 2*Math.PI*radius2;

		for(int i = 0; i < n/2; i++)
		{
			t.forward(circum2/n);
			t.left(360.0/n);
		}

		t.forward(30);
		t.right(90);
		t.forward(10);
		t.right(180);
	}

	public static void Star(Turtle t)
	{
		for(int i = 0; i < 3; i++)
		{
			t.forward(10);
			t.backward(20);
			t.forward(10);
			t.right(45);
		}
		t.right(135);
	}

	public static void Tree(Turtle t)
	{
		t.forward(20);
		for(int i = 0; i < 5; i++)
		{
			t.right(135);
			t.forward(Math.sqrt(200));
			t.left(180);
			t.forward(Math.sqrt(200));
			t.left(90);
			t.forward(Math.sqrt(200));
			t.backward(Math.sqrt(200));
			t.right(135);
			if(i == 4)
			{
				Move(t,5);
			}
			else
			{
				t.forward(5);
			}

		}
		t.penup();
		t.backward(40);
		t.pendown();
	}

	public static void main(String[] args)
	{
		Turtle t = new Turtle();
		
		// Drawing column 1
		t.left(90);

		Column(t);

		t.right(90);
		Move(t,20);
		t.left(90);
		Move(t,40);

		Brick(t);

		t.right(90);
		Move(t, 35);
		t.left(90);
		Move(t,80);
		t.left(90);

		Arch(t);

		Move(t,40);

		Brick(t);

		Move(t,80);
		t.right(90);
		Move(t,35);
		t.right(180);

		Column(t);

		t.right(90);
		Move(t,20);
		t.left(90);
		Move(t,40);

		Move(t,20);
		t.left(90);
		Move(t,30);

		for(int i = 0; i < 3; i++)
		{
			Arch(t);
			Move(t,60);
			t.left(90);
			Move(t,20);

		}

	}


}