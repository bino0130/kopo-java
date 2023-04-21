package ccl;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class PracticeNumberFive {

	public static void main(String[] args) {
		
		try { // try catch 중 try
			File k10_f = new File ("C:\\Users\\Bino\\test1.txt"); // File클래스 객체 k10_f 생성
			FileWriter k10_fw = new FileWriter(k10_f); // FileWriter 클래스 객체 k10_fw 생성
			
			k10_fw.write("안녕 파일\n"); // fw객체 호출 -> write메서드 호출해서 parameter "안녕 파일\n" 전달
			k10_fw.write("hello 헬로\n"); // fw객체 호출 -> write메서드 호출해서 parameter "hello 헬로\n" 전달
			
			k10_fw.close(); // fw객체 호출 -> close 실행
			
			FileReader k10_fr = new FileReader(k10_f); // FileReader 클래스 객체 k10_fr 생성
			
			int k10_n = -1; // int타입 변수 n -1로 초기화
			char [] k10_ch; // char타입 배열 ch배열 선언
			
			while(true) { // 무한루프 생성
				k10_ch = new char[100]; // 100개 단위로 읽음
				k10_n = k10_fr.read(k10_ch); // k10_fr 객체 호출해서 read 메서드에 k10_ch를 parameter로 전달
				
				if (k10_n == -1) break; // n이 -1이면 break
				
				for (int k10_i = 0; k10_i < k10_n; k10_i++) { // i가 0부터 1씩 증가하면서 n보다 작을때까지 작동하는 반복문
					System.out.printf("%c", k10_ch[k10_i]); // k10_ch[i] 출력
				}
			}
			
			k10_fr.close(); // fr객체 호출 -> close메서드 실행
			
			System.out.printf("\nFILE READ END "); // FILE READ END 출력
		} catch (Exception e) { // try catch 중 catch
			System.out.printf("나 에러[%s]\n", e); // 에러에 걸린다면 해당 문장 출력
		}
	}

}