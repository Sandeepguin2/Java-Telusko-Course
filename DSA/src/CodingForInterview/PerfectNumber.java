package CodingForInterview;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PerfectNumber->6!----->1 + 2 + 3=6
		//28 ---> 1 + 2 + 4 + 7 +14=28
		
		
		
		int n=28;
		boolean b =isPerfect(n);
		
		if(b) {
			System.out.println("It is a pefect number");
		}else {
			System.out.println("It is not a perfect number");
		}

	}

	public static boolean isPerfect(int n) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum + i;
			}
			if(n==sum) 
				return true;
	
		
		
	}
		return false;

}}
