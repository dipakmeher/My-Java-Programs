package frequencyofcharacter;

public class FOCmine {

	public static void main(String[] args) {
		int i,j;
		String str = "dipak";
		char[] string= str.toCharArray();
		int[] freq = new int[str.length()];
		for(i=0;i<str.length();i++) {
			freq[i]=1;
			for(j=i+1;j<str.length();j++) {
				if(string[i]==string[j]) {
					freq[i]++;
				
				string[j]='0';//To avoid duplicates
				}
			}
		}
		for(i=0;i<str.length();i++) {
			if(string[i]!='0' && string[i]!=' ') {
				System.out.println(string[i]+" - "+freq[i]);
			}
		}

	}

}
