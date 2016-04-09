package org.study.toTheNew;

import java.io.*;
import java.util.*;

public class Solution2 {
	
	static int[] sortArray(int[] arr) {
        Map<Integer, Integer> priority = new HashMap<Integer, Integer>();
        priority.put(0,10);
        priority.put(1,5);
        priority.put(2,9);
        priority.put(3,8);
        priority.put(4,3);
        priority.put(5,2);
        priority.put(6,7);
        priority.put(7,6);
        priority.put(8,1);
        priority.put(9,4);
        
        
        int temp;
        for(int i = 0; i<arr.length; i++) {
            for(int j = i+1; j<arr.length;j++) {
                if(priority.get(arr[j]) < priority.get(arr[i])){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i]=temp;    
                }
            }
        }
        return arr;
    }
	
	public static int[] Sort(int [] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        
        // Split the array in half
        int[] first = new int[arr.length / 2];
        int[] second = new int[arr.length - first.length];
        System.arraycopy(arr, 0, first, 0, first.length);
        System.arraycopy(arr, first.length, second, 0, second.length);
        
        // Sort each half
        Sort(first);
        Sort(second);
        
        // Merge the halves together, overwriting the original array
        merge(first, second, arr);
        return arr;
    }
    
    private static void merge(int[] first, int[] second, int [] result) {
        // Merge both halves into the result array
        // Next element to consider in the first array
        int iFirst = 0;
        // Next element to consider in the second array
        int iSecond = 0;
        
        // Next open position in the result
        int j = 0;
        // As long as neither iFirst nor iSecond is past the end, move the
        // smaller element into the result.
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                result[j] = first[iFirst];
                iFirst++;
                } else {
                result[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        // copy what's left
        System.arraycopy(first, iFirst, result, j, first.length - iFirst);
        System.arraycopy(second, iSecond, result, j, second.length - iSecond);
    }
	
	
	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int[] res;
        
        int _arr_size = Integer.parseInt(in.nextLine());
        int[] _arr = new int[_arr_size];
        int _arr_item;
        for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
            _arr_item = Integer.parseInt(in.nextLine());
            _arr[_arr_i] = _arr_item;
        }
        
        res = sortArray(_arr);
        for(int res_i=0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }
        
        bw.close();
        in.close();
    }
}
