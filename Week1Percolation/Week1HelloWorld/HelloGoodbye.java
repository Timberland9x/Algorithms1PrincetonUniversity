package Week1HelloWorld;

/*Command-line arguments. Write a program HelloGoodbye.java that takes two names as command-line arguments and prints hello 
and goodbye messages as shown below (with the names for the hello message in the same order as the command-line arguments 
and with the names for the goodbye message in reverse order).
~/Desktop/hello> javac HelloGoodbye.java

~/Desktop/hello> java HelloGoodbye Kevin Bob
Hello Kevin and Bob.
Goodbye Bob and Kevin.

~/Desktop/hello> java HelloGoodbye Alejandra Bahati
Hello Alejandra and Bahati.
Goodbye Bahati and Alejandra. */
import java.util.Scanner; // Import the Scanner class

public class HelloGoodbye {
	public static void main(String[] args) {

		String[] names = new Scanner(System.in).nextLine().split(" ");

		System.out.println("Hello " + names[0] + " and " + names[1] + ".");
		System.out.println("Goodbye " + names[1] + " and " + names[0] + ".");

	}

}
