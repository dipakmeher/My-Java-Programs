package primenumbers;

public class nearestprimenumbers {

	public static boolean isPrime(int n) {
		int i;
		int count=0;
		for(i=1;i<=n;i++) {
			if(n%i == 0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		int i,num;
		num = 30;
		int diff1=0,diff2=0;
        int num1=0,num2=0;
        for(i=num;;i++)//No end limit as when prime will be found we will break the loop.
        {
            if(isPrime(i))
            {
                diff1=i-num;
                num1=i;
                break;
            }
        }
        for(i=num;;i--)//No end limit as when prime will be found we will break the loop.
        {
            if(isPrime(i))
            {
                diff2=num-i;
                num2=i;
                break;
            }
        }
        if(diff1<diff2)//Nearest Prime number will have least difference from given number.
            System.out.println("Nearest Prime Number from "+num+" is "+num1);
        else if(diff2<diff1)
            System.out.println("Nearest Prime Number from "+num+" is "+num2);
            else//There can be more than 1 nearest prime like for 6 we have 5 and 7 as nearest prime.
            System.out.println("Nearest Prime Number from "+num+" is "+num2+" and "+num1);
    }
}