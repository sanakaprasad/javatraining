package objectex;

public class Prasad {
	//Java code for using 'this' keyword to
	//refer current class instance variables
	
	
		int a;
		int b;
		
		// Parameterized constructor
		Prasad(int a, int b)
		{
			this.a = a;
			this.b = b;
		}

		void display()
		{
			//Displaying value of variables a and b
			System.out.println("a = " + a + " b = " + b);
		}

		public static void main(String[] args)
		{
			Prasad object = new Prasad(10, 20);
			object.display();
		}
	}



