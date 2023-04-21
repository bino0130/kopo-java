package ccl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PracticeNumberEight {

	public static void main(String[] args) throws IOException {
		// 바탕화면에 전국무료와이파이표준데이터 csv파일을 경로로 하는 File 객체 f 생성
				File k10_f = new File("C:\\Users\\Bino\\Desktop\\전국무료와이파이표준데이터.txt");
				BufferedReader k10_br = new BufferedReader(new FileReader(k10_f)); // 파일을 read하는 BufferedReader 객체 br 생성 
				
				String k10_readtxt; // String 타입 readtxt 선언
				
				if ((k10_readtxt = k10_br.readLine()) == null) { // br에서 해당 line을 read한 값이 null이면
					System.out.printf("빈 파일입니다\n"); // 빈 파일입니다 출력
					return; // 리턴
				}
				String[] k10_field_name = k10_readtxt.split("\t"); // readtxt를 ,를 기준으로 나눈 String타입 배열 field_name 선언
				
				double k10_lat = 37.3095371;
				double k10_lng = 127.0973496;
				
				int k10_LineCnt = 0; // int 타입 변수 LineCnt = 0으로 초기화 
				
				while ((k10_readtxt = k10_br.readLine()) != null) { // 해당 line을 read한 값이 null이 아니면
					String[] k10_field = k10_readtxt.split("\t"); // readtxt를 ,를 기준으로 나눈 String타입 배열 field 선언
					System.out.printf("**[%d번째 항목]**************\n", k10_LineCnt); // n번째 항목 출력
					System.out.printf(" %s : %s\n", k10_field_name[10], k10_field[10]);
					System.out.printf(" %s : %s\n", k10_field_name[13], k10_field[13]);
					System.out.printf(" %s : %s\n", k10_field_name[14], k10_field[14]);
					double k10_dist = Math.sqrt( Math.pow(Double.parseDouble(k10_field[13]) - k10_lat, 2)) 
							+ Math.pow(Double.parseDouble(k10_field[14]) - k10_lng, 2);
					System.out.printf("현재 지점과 거리 : %f\n", k10_dist);
					System.out.printf("*****************************************************\n"); // 별 찍기
					
					k10_LineCnt++; // LineCnt +1 증가
				}
				
				k10_br.close(); // close
	}

}
