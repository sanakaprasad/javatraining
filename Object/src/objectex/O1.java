package objectex;

public class O1 {
	 

		private int age; // Private is using to hide the data

		public int getAge() { return age; } // getter

		public void setAge(int age)
		{
			this.age = age;
		} // setter
	}

	class GFG {
		public static void main(String[] args)
		{

			 O1 o = new O1();

			o.setAge(19);

			System.out.println("The age of the person is: "
							+ o.getAge());
		}
	}


