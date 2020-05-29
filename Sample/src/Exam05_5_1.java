import java.util.Scanner;

public class Exam05_5_1 {
	public static void main(String[] args) {
// 무한반복 상태
		boolean isRun = true;
// 학생 수
		int studentNum = 0;
// 학생별 점수
		int[] scores = null;
		Scanner scan = new Scanner(System.in);
		
		while (isRun) {
			
			System.out.println("======================================");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("======================================");
			System.out.print("선택 > ");

			int selectNo = scan.nextInt();
			
			
			if (selectNo == 1) {
				
				System.out.println("학생수 입력 >");
				
				studentNum = Scan.nextint();
				scores = new int[studentNum];
				

			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					scores [i] = Scan.nextint();
				}
// 코드 작성
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println(scores[i]);
				}
// 코드 작성
			} else if (selectNo == 4) {
// 코드 작성
			} else if (selectNo == 5) {
				isRun = false;
			}
		}
		
		System.out.println("프로그램 종료");
		scan.close();
	}
}

//public class Exam05_5 {
//	public static void main(String[] args) {
//// 무한반복 상태
//		boolean isRun = true;
//// 학생 수
//		int studentNum = 0;
//// 학생별 점수
//		int[] scores = null;
//		Scanner scan = new Scanner(System.in);
//		while (isRun) {
//			System.out.println("======================================");
//			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
//			System.out.println("======================================");
//			System.out.print("선택 > ");
//			int selectNo = scan.nextInt();
//			if (selectNo == 1) {
//				System.out.print("학생수 입력 >");
//				studentNum = scan.nextInt();
//				scores = new int[studentNum];
//			} else if (selectNo == 2) {
//				for (int i = 0; i < scores.length; i++) {
//					scores[i] = scan.nextInt();
//				}
//			} else if (selectNo == 3) {
//				for (int i = 0; i < scores.length; i++) {
//					System.out.println(scores[i]);
//				}
//			} else if (selectNo == 4) {
//// 코드 작성
//			} else if (selectNo == 5) {
//				isRun = false;
//			}
//		}
//		System.out.println("프로그램 종료");
//		scan.close();
//	}
//}