// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		// Replace the following statement with your code
		int cnt=x2;
		int sum=x1;
		while(cnt>0)
		{
			if(x2>0)
			{
				sum++;
			}
			else
			{
				sum--;
			}
			cnt--;
		}
		return sum;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		// Replace the following statement with your code
		int cnt=x2;
		int sum=x1;
		while(cnt>0)
		{
			if(x2>0)
			{
				sum--;
			}
			else
			{
				sum++;
			}
			
			cnt--;
		}
		return sum;
		
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		// Replace the following statement with your code
		int cnt=x2;
		int total=0;
		if(x2<0)cn2*=(-1);
		while(cnt>0)
		{

			total=plus(total,x1); 
			
			
			cnt--;
		}
		if(x2<0)total*=(-1);
		return total;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		// Replace the following statement with your code
		int cnt=n;
		int total=x;
		
		while(cnt>1)
		{
			total=times(total, x);
			cnt--;
			

		}
		if(cnt==0)total=1;
		return total;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		// Replace the following statement with your code
		int left=x1;
		int cnt=0;
		while(left>=x2)
		{
			left=minus(left, x2);
			cnt++;
		}

		return cnt;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		// Replace the following statement with your code
		int left=x1;
		while(left>=x2)
		{
			left=minus(left, x2);
		}
		return left;
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		// Replace the following statement with your code
		int sol=1;
		while(times(sol,sol)<=x)
		{
			sol++;
		}
		sol--;
		return sol;
	}	  	  
}