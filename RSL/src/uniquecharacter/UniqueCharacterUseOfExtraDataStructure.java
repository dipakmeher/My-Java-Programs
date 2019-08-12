//Time complexity: O(n)
package uniquecharacter;
import java.util.*;
public class UniqueCharacterUseOfExtraDataStructure {
	private static final int MAX_CHAR = 256;

	private static boolean UniqueCharacter(String input) {
		int i;
		if(input.length()> MAX_CHAR) {
			return false;
		}
		
		boolean chars[]= new boolean[MAX_CHAR];
		Arrays.fill(chars,false);
		for(i=0;i<input.length();i++) {
			int index = (int)input.charAt(i);//return interger value of character
			if(chars[index] == true) {
				return false;
			}
			chars[index]=true;
		}
		return true;
	}
	public static void main(String[] args) {
		UniqueCharacterUseOfExtraDataStructure uc = new UniqueCharacterUseOfExtraDataStructure();
		String input = "Dipak";
		if(UniqueCharacter(input)) {
			System.out.println("Unique Character");
		}
		else {
			System.out.println("Not a Unique Character");
		}

	}

}
