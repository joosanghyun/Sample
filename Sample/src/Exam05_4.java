public class Exam05_4 {
	public static void main(String[] args) {
		
		
		
		char[] text = { 'g', ' ', 'f', 'm', 'n', 'c', ' ', 'w', 'm', 's', ' ', 'b', 'g', 'b', 'l', 'r', ' ', 'r', 'p',
				'_', 'l', 'q', 'j', '_', 'r', 'c', ' ', 'g', 'r', ' ', '`', 'w', ' ', 'f', '_', 'l', 'b' };
//		char temp = ' ';
		
		
		for(int i = 0; i < text.length; i++) {
			if(text[i] != ' ') {
			char trans = (char)(text[i] + 2);		
			System.out.print(trans);
		} else {
			System.out.println(text[i]);
		}
	}		
	}	
}
		
		
		
		
		
		
		
		
//			int nums = 0;
		
		
		
//		for(int i = 0; i < nums.length; i++) {
//			int[] chars;
//			int ran;
//			int a = chars[ran];
//			int ran1 = int (Math.random() * nums.length);
//			char temp = ' ';
//			temp = nums[0];
//			nums[0] = nums[ran1];
//			nums[ran1] = temp;
//			 
//			
//		}
//		System.out.println(nums);

