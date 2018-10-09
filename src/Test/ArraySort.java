package Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
           int[] arr={1,3,6,9,3,5,8};
           //从小到大的排序
           Arrays.sort(arr);
           for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
           
	}
}
