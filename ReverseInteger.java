import java.util.Scanner;

public class ReverseInteger {

	  public static int reverse(int x) {
	        long reversed = 0;
	        while(x != 0){
	        reversed = reversed * 10 + (x % 10);
	        x /= 10;
	       }
	       if(reversed >  Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
	        return 0;
	       }
	       return (int)reversed;
	    }
	  
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a integer to Reverse:");
		int n = in.nextInt();
		int ans = reverse(n);
		System.out.println("Result:"+ans);

	}

}
