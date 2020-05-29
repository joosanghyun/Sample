public class Exam05_1 {
	public static void main(String[] args) {
//		Object arr;
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// int sum = 0;
//		for(int i=10; i<11; i++);
		for (int i = 0; i < arr.length; i++) {
//			if(i % 2 == 0) {
			if (arr[i] % 2 != 0) {
				String sep = null;
				System.out.print(sep + arr[i]);
				sep = ", ";
			}
		}

//		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	}
}