
public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {-18,-11,-10,-6,-3,0,1,3,5,8,10,11,19,20,27,30};
		int target = 1;
		int ans = search(arr,target);
		System.out.println("Index of the target element:" + ans);

	}
	
	//return the index
	//return -1 if the target element doesn't exists
	static int search(int[] nums,int target) {
		int start = 0;
		int end = nums.length-1;
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(target < nums[mid]) {
				end = mid - 1;
			}else if(target > nums[mid]) {
				start = mid + 1;
			}else {
				//Answer
				return mid;
			}
		}
		return -1;
	}

}
