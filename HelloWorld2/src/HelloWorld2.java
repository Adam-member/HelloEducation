import java.lang.Math.*;
import java.util.Scanner;
public class HelloWorld2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		Scanner scan = new Scanner(System.in);
		
		String sentence = scan.nextLine();
		
		System.out.println(sentence);
		
		int num2;
		num2 = 6;
		
		int num1;
		num1 = 3;
		
		boolean truefalse;
		truefalse = true;
		
		double dubble = 4.4576;
		
		System.out.println("The number you seek is: " + dubble);
		
		System.out.println(num1);
		System.out.println(truefalse);
		System.out.println(num1 + num2);
		
		double cosine = Math.cos(dubble);
		
		System.out.println(cosine);
		

		
	}

}
