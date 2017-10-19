
public class Method3 {
	static boolean yesno;
	static int mainInt = 0;
	public static boolean returnBool(){
		if(mainInt == 0){
			yesno = true;
		}
		return yesno;
	}
}
