package org.study.toTheNew;
import java.io.*;
import java.util.*;

public class Solution1 {
	
	/*
	 * Complete the function below.
	 */

	    static int[] searchMinSumPair(int[] inputArray) {
	        int[] result = new int[2];
	        int lowestPos = 0;
	        for(int i=0;i<inputArray.length; i++) {
	            if(inputArray[i] < result[0]){
	                result[0] = inputArray[i];
	                lowestPos = i;
	            }
	        }
	        for(int i=0;i<inputArray.length; i++) {
	            if((inputArray[i] < result[1]) && (i!=lowestPos))
	                result[1] = inputArray[i];
	        }
	        return result;
	    }


	    public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        final String fileName = "/Users/pulgupta/OUTPUT_PATH";
	        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	        int[] res;
	        
	        int _inputArray_size = Integer.parseInt(in.nextLine());
	        int[] _inputArray = new int[_inputArray_size];
	        int _inputArray_item;
	        for(int _inputArray_i = 0; _inputArray_i < _inputArray_size; _inputArray_i++) {
	            _inputArray_item = Integer.parseInt(in.nextLine());
	            _inputArray[_inputArray_i] = _inputArray_item;
	        }
	        
	        res = searchMinSumPair(_inputArray);
	        for(int res_i=0; res_i < res.length; res_i++) {
	            bw.write(String.valueOf(res[res_i]));
	            bw.newLine();
	        }
	        
	        bw.close();
	        in.close();
	    }
	}
    