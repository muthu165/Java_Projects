package General;
import java.util.Scanner;
public class MainPassword {
	public static final Scanner keyboard = new Scanner(System.in);
	public static void main(String args[]){
		Generator generator = new Generator(keyboard);
		generator.mainloop();
		keyboard.close();
	}
}


















