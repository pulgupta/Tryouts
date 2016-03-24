package org.study.algos;

/**
 * In merge sort all the processing is in the merge step.
 * In the normal step we just recursively divide the problem into smaller problems.
 * However in case of quick sort we do all the processing in divinding the problems 
 * into smaller problems. The merge step is a fairly simple affair
 * @author pulgupta
 */
public class QuickSort {

	static int[] arr = {1,9,4,7,8,3,2};
	
	public static void quickSort(int low, int high) {
		
		if(low<high) {
			int pivot = partition(low, high);
			quickSort(low, pivot);
			quickSort(pivot+1, high);
		}
	}
	
	public static int partition(int low, int high) {
		//in this step we will just pick the last element as the pivot
		int pivot = arr[high-1];
		
		//lets bring the pivot to the right position
		int pivotpos=low-1;
		int i=low;
		while(i < high) {
			if(arr[i] < pivot ) {
				pivotpos++;
				int temp = arr[pivotpos];
				arr[pivotpos] = arr[i];
				arr[i] = temp;
				
			}
			i++;
		}
		arr[high-1] = arr[pivotpos+1];
		arr[pivotpos+1] = pivot;
		
		System.out.println("\nArray after this iteration");
		for (int ii : arr) {
			System.out.print(ii+ " " );
		}
		
		return pivotpos+1;
	}
	public static void main(String[] args) {
		quickSort(0, arr.length);
		System.out.println("\nArray after this iteration");
		for (int ii : arr) {
			System.out.print(ii+ " " );
		}
	}
}
