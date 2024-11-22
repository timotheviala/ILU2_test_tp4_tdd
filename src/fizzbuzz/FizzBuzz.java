package fizzbuzz;

public class FizzBuzz {

	public static String  fizzbuzz(int i) {
		if(i%3==0) {
			return "fizz";
		}else if(i==5) {
			return "buzz";
		}
		return Integer.toString(i);
	}
}
