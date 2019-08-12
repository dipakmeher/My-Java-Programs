package uniquecharacter1;

public class MyRSLAttempt {
	public final static int s = 256;
	public static char []count= new char[s];
	
	public static void getcharaceterarray(String str) {
		int i;
		for(i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
	}
	public static void UniqueCharacter(String str) {
		int i;
		getcharaceterarray(str);
		for(i=0;i<str.length();i++) {
			if(count[str.charAt(i)]>1) {
				System.out.println("false.\n");
				return;//don't use break use return
			}
		}
		System.out.println("true\n");
	}
	
	public static void main(String[] args) {
		String str1 = "Gegks";
		String str  = str1.toLowerCase();
		UniqueCharacter(str);
	}

}
