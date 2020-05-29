public class Exam05_2 {
	public static void main(String[] args) {
		int[] arr = { 10, 0, 12, 0, 14, 0, 16, 0, 18, 0 };
		
			
		int total = 0;
		int count = 0; // 0ÀÇ °³¼ö
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] !=0) {
			total += arr[i];
			count++;
			
		
			}
		
		}
		System.out.println(total);
		System.out.println(total / (double)count);	
		

	}
}