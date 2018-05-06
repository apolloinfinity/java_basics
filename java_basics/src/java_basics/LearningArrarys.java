package java_basics;

public class LearningArrarys {

	public static void main(String[] args) {
		
		// To initialize an array declare data type and use [].
		// This particular array has a fixed size of 100 slots.
		// This array can only store arrays of the same data type.
		double [] values = new double[100];
		
		// Like JavaScript and Python, indices start at 0
		// This value is assigning 1000 to the 2nd(3rd) slot
		values[0] = 1000;
		values[1] = 64.13;
		values[99] = 93623;
		
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[99]);
		
		// This is an array initializer.
		String [] words = new String[] {"My", "name", "is"};
		
		System.out.println(words[2]);
	}

}
