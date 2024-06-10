package General;

public class Alphabet {
	public static final String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String lowercase = "abcdefghijklmnopqrstuvwxyz";
	public static final String numbers = "1234567890";
	public static final String symbols = "!@#$%^&*()-_=+\\/~?";
	private final StringBuilder pool;
	
	public Alphabet(boolean upper,boolean lower,boolean number,boolean symbol){
		pool = new StringBuilder();
		if(upper) pool.append(uppercase);
		if(lower) pool.append(lowercase);
		if(number) pool.append(numbers);
		if(symbol) pool.append(symbols);
	}
	
	public String getAlphabet(){
		return pool.toString();
	}
}
