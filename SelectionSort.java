import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array Elements:");
        for(int k = 0; k < size; k++) {
            arr[k] = in.nextInt();
        }
        

        System.out.println("Array Sorted in Ascending Order using Selection Sort" + Arrays.toString(AscendingSort(arr)));
        System.out.println("Array Sorted in Descending Order using Selection Sort" + Arrays.toString(DescendingSort(arr)));
    }
    static int[] AscendingSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1;i++) {
            int min_index = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[min_index]) {
                    min_index = j; 
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    static int[] DescendingSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int max_index = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] > arr[max_index]) {
                    max_index = j;
                }
            }
            
            int temp = arr[max_index];
            arr[max_index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

}
