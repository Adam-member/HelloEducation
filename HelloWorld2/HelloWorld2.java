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
		
		
		if(cosine == 60){
			System.out.println("Hello");
		}
		else if(cosine == 40){
			System.out.println("Bye");
		}
		else{
			System.out.println("never mind");
		}
		
		
		if(sentence.equals("Hi") ){
			System.out.println("I don't like you");
		}
		else if(sentence.equals("Bye")){
			System.out.println("Don't go!");
		}
		
		
		String sentence2 = scan.nextLine();
		
		if(sentence2.equals("hi")){
			System.out.println("No");
			}
		else if(sentence2.equals("there")){
			System.out.println("there");
		}
		}

}
