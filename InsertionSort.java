import java.util.Arrays;

public class InsertionSort {

	public static void insertion(int[] arr, int n) {
		for(int i = 0; i < n - 1; i++) {
			for(int j = i ; j >=0 ; j--) {
				if(arr[j+1] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}else {
					break;
				}
			}
		}
	}
	
	public static void printArray(int[] arr, int n) {
		for(int i = 0; i < n ; i++ ) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {12,45,23,2,3,7,10,100,32};
		int n = arr.length;

		System.out.print("Array elements before sorting:");
		printArray(arr,n);
		insertion(arr,n);
		System.out.print("\nArray elements after sorting:");
		printArray(arr,n);

	}

}
