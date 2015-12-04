package org.study.algos;

public class MergeSort {
	
	static int[] arr = {4,7,9,10,1,8,6,3,5};
	static int [] tempMergArr = {};
	public static void mergeSort(int low, int high) {
		
		if(high>low) {
			int middle = (low + high)/2;
			mergeSort(low ,middle);
			mergeSort(middle+1, high);
			merge(low, middle, high);
		}
	}
	
	public static void merge(int lowerIndex, int middle, int higherIndex) {
		for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = arr[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                arr[k] = tempMergArr[i];
                i++;
            } else {
                arr[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            arr[k] = tempMergArr[i];
            k++;
            i++;
        }
	}
	
	public static void main(String args[]) {
		
	}
	
}
