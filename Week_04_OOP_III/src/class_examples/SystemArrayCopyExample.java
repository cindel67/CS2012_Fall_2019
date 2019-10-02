package class_examples;

public class SystemArrayCopyExample {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		
		int[] temp = {1, 1, 1, 1, 1, 1, 1, 1, 1};
		
		
		//Deep copy
		System.arraycopy(arr, 2, temp, 4, 3);
		
		//printArr(arr);
		printArr(temp); //{}
		
//		System.out.println();
//		temp[3] = 100;
//		
//		printArr(arr);
//		printArr(temp);
		
	}
	
	public static void printArr(int[] arr) {
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
