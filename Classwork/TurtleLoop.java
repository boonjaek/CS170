public class TurtleLoop
{
	public static void main(String[] args)
	{
		Turtle bob = new Turtle();
		bob.forward(100);
		bob.left(90);
		bob.forward(120);
		bob.penup();
		bob.forward(30);
		bob.pendown();
		bob.forward(30);
		bob.color("red");
		bob.left(120);
		bob.backward(45);
		
	}
}