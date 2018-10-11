package Test;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 找出数组最小值
		int[] a = new int[5];
		a[0] = (int) (Math.random() * 100);
		a[1] = (int) (Math.random() * 100);
		a[2] = (int) (Math.random() * 100);
		a[3] = (int) (Math.random() * 100);
		a[4] = (int) (Math.random() * 100);
		int target=0;
		
		for (int i = 0; i < a.length; i++) {
			if(target<a[i]) {
				target=a[i];
			}			
			System.out.println("最大值是："+ a[i] );
		}
		System.out.println("最大值是："+ target);
	}
}
