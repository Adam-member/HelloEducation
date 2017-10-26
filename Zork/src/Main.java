import java.util.Scanner;
public class Main {
public static void main ( String[] args){
	PrintStatement();
	String.Math();
	
	}
static void PrintStatement(){
	//String chara = "welcome";
	Scanner scan = new Scanner(System.in);
	
	java.lang.String words = scan.nextLine();
	
	if(words.equals("Welcome")){
		System.out.println("Likewise. What path do you wish to take?");
	}
	else if(words.equals("Get away from me!")){
		System.out.println("x");
	}
	else{
		System.out.println("Y");
	}
	
	java.lang.String words2 = scan.nextLine();
	
	System.out.println(words2);
	
	System.out.println("Hello");
}
}
