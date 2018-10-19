package Test;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class StringByteArrayExamples {
	public static void main(String[] args) throws Exception {

		int[] num = { 1, 5, 4, 6, 8, 7, 6 };
		int index = -1;
		int[] delete = new int[7];

		for (int i = 0; i < num.length; i++) {
			delete[i] = num[i];
			if (num[i] == 4) {
				index = i;
		
				break;
			}
		}

		for (int j = index; j < num.length - 1; j++) {
			delete[j] = num[j + 1];
		}
		num[delete.length - 1] = 0;
		for (int v = 0; v < num.length; v++) {
			System.out.println(delete[v] + " ");
		}

	}
}
