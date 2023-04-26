package stockData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class L07 {

	public static void main(String[] args) throws IOException {
		// THTSKS010H00.dat를 경로로 하는 파일 객체 f 생성
		File k10_f = new File("C:\\Users\\Bino\\Downloads\\day_data\\THTSKS010H00.dat");
		BufferedReader k10_br = new BufferedReader(new FileReader(k10_f)); // f를 읽어오는 BufferedReader 객체 br 생성
		
		String k10_readtxt; // String타입 변수 readtxt 선언
		int k10_LineCnt = 0; // int타입 변수 LineCnt 0으로 초기화
		int k10_n = -1; // int 타입 변수 n = -1로 초기화
		StringBuffer k10_s = new StringBuffer(); // StringBuffer 객체 s 생성
		while(true) { // 무한루프
			char[] k10_ch = new char[1000]; // 크기 1000의 배열 ch 생성
			k10_n = k10_br.read(k10_ch); // n은 배열 ch를 읽은 값
			
			if (k10_n == -1) break; // n이 -1이면 break
			
			for(char k10_c : k10_ch) { // 배열 ch를 문자형 c에 하나씩 대입하는 for each
				if(k10_c == '\n') { // c가 개행문자면
					System.out.printf("[%s]***\n",k10_s.toString()); // StringBuffer 객체 s를 String형태로 바꾼것을 출력
					k10_s.delete(0, k10_s.length()); // s의 0번째 인덱스부터 s의 길이에 해당하는 인덱스까지 삭제
				} else { // c가 개행문자가 아니면
					k10_s.append(k10_c); // s에 c를 추가
				}
			}
			k10_LineCnt++; // LineCnt +1 증가
		}
		System.out.printf("[%s]***\n",k10_s.toString()); // StringBuffer 객체 s를 String형태로 바꾼것을 출력 
		k10_br.close(); // br close
	}

}
