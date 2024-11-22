package fizzbuzz;

public class FizzBuzz {

	public static String  fizzbuzz(int i) {
		StringBuilder resultat=new StringBuilder("");
		if(i%3==0) {
			resultat.append("fizz");
		}
		if(i%5==0) {
			resultat.append("buzz");
		}
		if(resultat.length()==0) {
			resultat.append(i);
		}
		return resultat.toString();
	}
}
