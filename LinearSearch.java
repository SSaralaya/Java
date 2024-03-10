import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//User input for the size of array
		System.out.println("Enter the Size of the array:");
		int n = in.nextInt();
		int[] nums = new int[n];
		//User input for array elements
		System.out.printf("Enter %d elements:",n);	
		for(int i = 0; i < n; i++) {
			nums[i] = in.nextInt();
		}
		//User input for Search Element
		System.out.println("Enter search element:");
		int ele = in.nextInt();
		System.out.println(search(nums,ele));
		

	}
	
	static boolean search(int[] nums,int ele) {
		//returns true if the search element is present
		//returns false if the search element is not present
		for(int i = 0; i < nums.length; i++) {
			if(ele == nums[i]) {
				return true;
			}
		}
		return false;
	}

}

