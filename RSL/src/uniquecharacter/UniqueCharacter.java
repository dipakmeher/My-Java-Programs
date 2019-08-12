//Time complexity: O(nlogn)
package uniquecharacter;
import java.util.*;
public class UniqueCharacter {
	boolean uniqueCharacter(String str) {
		int i;
		char []x = str.toCharArray();
		Arrays.sort(x);
		for(i=0;i<x.length-1;i++) {
			if(x[i] != x[i+1]) {
				continue;
			}
			else {
				return false;
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		UniqueCharacter uc = new UniqueCharacter();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		if(uc.uniqueCharacter(input)){
			System.out.println("Unique Character");
		}else {
			System.out.println("Not a Unique Character");
		}
	}

}
