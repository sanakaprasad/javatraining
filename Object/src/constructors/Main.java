package constructors;

public class Main {
	// Java program to demonstrate the working of method
	// overloading in static methods
	

	  public static int foo(int a) { return 10; }
	  public static char foo(int a, int b) { return 'a'; }

	  public static void main(String args[])
	  {
	    System.out.println(foo(1));
	    System.out.println(foo(1, 2));
	  }
	}



