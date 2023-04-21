package ccl;

import java.io.*;

public class PracticeNumberSeven {

	public static void main(String[] args) throws IOException {
		// 바탕화면에 전국무료와이파이표준데이터 csv파일을 경로로 하는 File 객체 f 생성
		File k10_f = new File("C:\\Users\\Bino\\Desktop\\전국무료와이파이표준데이터.csv");
		BufferedReader k10_br = new BufferedReader(new FileReader(k10_f)); // 파일을 read하는 BufferedReader 객체 br 생성 
		
		String k10_readtxt; // String 타입 readtxt 선언
		
		if ((k10_readtxt = k10_br.readLine()) == null) { // br에서 해당 line을 read한 값이 null이면
			System.out.printf("빈 파일입니다\n"); // 빈 파일입니다 출력
			return; // 리턴
		}
		String[] k10_field_name = k10_readtxt.split(","); // readtxt를 ,를 기준으로 나눈 String타입 배열 field_name 선언
		
		int k10_LineCnt = 0; // int 타입 변수 LineCnt = 0으로 초기화 
		
		while ((k10_readtxt = k10_br.readLine()) != null) { // 해당 line을 read한 값이 null이 아니면
			String[] k10_field = k10_readtxt.split(","); // readtxt를 ,를 기준으로 나눈 String타입 배열 field 선언
			System.out.printf("**[%d번째 항목]**************\n", k10_LineCnt); // n번째 항목 출력
			for (int k10_j = 0; k10_j < k10_field_name.length; k10_j++) { // j가 field_name보다 작을때까지만 0부터 +1씩 증가하는 반복문 실행
				System.out.printf(" %s : %s\n", k10_field_name[k10_j], k10_field[k10_j]); // 각각의 배열 field_name, field의 j번째 인덱스 출력 
			}
			System.out.printf("*****************************************************\n"); // 별 찍기
			if (k10_LineCnt == 100) break; // LineCnt가 100이 되면 break
			k10_LineCnt++; // LineCnt +1 증가
		}
		
		k10_br.close(); // close
	}

}