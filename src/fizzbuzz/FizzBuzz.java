package fizzbuzz;

public class FizzBuzz {

	public static String  fizzbuzz(int i) {
		if(i%3==0) {
			if(i%5==0) {
			return "fizzbuzz";
			}else {
				return "fizz";
			}
		}else if(i%5==0) {
			return "buzz";
		}
		return Integer.toString(i);
	}
}
