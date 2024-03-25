public class OrderAgnosticBS {

	public static void main(String[] args) {
		int[] arr1 = {-18,-11,-10,-6,-3,0,1,3,5,8,10,11,19,20,27};
		int target1 = 19;
		int[] arr2 = {90,80,68,65,48,43,20,18,13,8,5,2,0,-1,-3,-6,-9};
		int target2 = 18;
		int ans1 = search(arr1,target1);
		System.out.println("Index of the target element 1 :" + ans1);
		int ans2 = search(arr2,target2);
		System.out.println("Index of the target element 2 :" + ans2);

	}
	
	//return the index
	//return -1 if the target element doesn't exists
	static int search(int[] nums,int target) {
		int start = 0;
		int end = nums.length-1;
		boolean isAsc = true;
		if(nums[start] > nums[end]) {
			isAsc = false;
		}
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(nums[mid] == target) {
				return mid;
			} 
			if(isAsc) {
				if(target < nums[mid] ){
					end = mid - 1;
				}else {
					start = mid + 1;
				}	
			}else {
				if(target < nums[mid]) {
					start = mid + 1;
				}else {
					end = mid - 1;
				}
			}
		}
		return -1;
	}
}
