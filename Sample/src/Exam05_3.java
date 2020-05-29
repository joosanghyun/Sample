public class Exam05_3 {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		for(int i = 0; i < nums.length; i++) {
			int ran = (int) (Math.random() * nums.length);
			char temp = ' ';
			temp = nums[0];
			nums[0] = nums[ran];
			nums[ran] = temp;
		}
		System.out.println(nums);
		
		
		
//		for(int i = 0; i < 1000; i++) {
//			int a = nums[0];
//			int ran = (int) (Math.random() * nums.length);
//			int b = nums[ran];
//			int temp = a;
//			a = b;
//			b = temp;
//			nums[0] = (char)a;
//			nums[ran] = (char)b;
//			
//		}
//		
//		System.out.println(nums);

	}
}