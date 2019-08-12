package sumofeachnumberwithrecursion;

public class SumOfEachNumber {

	int sum = 0;
    
    public int getNumberSum(int number){
         
        if(number == 0){
            return sum;
        } else {
            sum += (number%10);
            getNumberSum(number/10);
        }
        return sum;
    }
     
    public static void main(String a[]){
    	SumOfEachNumber mns = new SumOfEachNumber();
        System.out.println("Sum is: "+mns.getNumberSum(223));
    }
//	public static void main(String[] args) {
//			int n=1235;
//			int ans = SED(n);
//			System.out.println("answer = "+ ans);
//	}
//
//	private static int SED(int n) {
//		int sum = 0,r = 0;
//		if(n==0) {
//			return sum;
//		}
//		else {
//			r=n%10;
//			sum = sum + r;
//			SED(n/10);
//		}
//		return sum;
////		while(n>0) {
////			r = r%10;
////			sum =sum+r;
////			n=n/10;
////		}
////		if(sum<=9) {
////			return sum;
////		}
////		else {
////			return SED(sum);		}
//	}

}
