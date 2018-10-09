package Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraySort01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Integer[] arr={1,3,6,9,3,5,8};
         //从大到小的排序
		 Arrays.sort(arr,Collections.reverseOrder() );
		 for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
