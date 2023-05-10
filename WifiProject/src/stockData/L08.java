package stockData;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class L08 {

//	public static void main(String[] args) throws IOException { // 슬라이드 11페이지
//		// THTSKS010H00.dat를 경로로 하는 파일 객체 f 생성
//		File k10_f = new File("C:\\Users\\Bino\\Downloads\\day_data\\THTSKS010H00.dat");
//		BufferedReader k10_br = new BufferedReader(new FileReader(k10_f)); // f를 읽어오는 BufferedReader 객체 br 생성
//		
//		// 바탕화면의 StockDailyPrice를 경로로하는 파일 객체 f1 생성
//		File k10_f1 = new File("C:\\Users\\Bino\\Desktop\\StockDailyPrice.csv");
//		BufferedWriter k10_bw1 = new BufferedWriter(new FileWriter(k10_f1)); // f1을 작성하는 BufferedWriter 객체 bw1 생성
//		
//		String k10_readtxt; // String 변수 readtxt 생성
//		
//		int k10_cnt = 0, k10_wcnt = 0; // int 변수 cnt, wcnt 0으로 초기화
//		while((k10_readtxt = k10_br.readLine()) != null) { // readtxt를 읽은 값이 null이 아니면
//			StringBuffer k10_s = new StringBuffer(); // StringBuffer 객체 s 생성
//			String[] k10_field = k10_readtxt.split("%_%"); // readtxt를 %_%로 구분한 String배열 field 생성
//			
//			// field의 길이가 2보다 크고 필드의 2번째 인덱스에서 ^제거, 빈칸 제거 후 첫번째 자리가 A라면
//			if(k10_field.length > 2 && k10_field[2].replace("^", "").trim().substring(0, 1).equals("A")) { 
//				k10_s.append(k10_field[0].replace("^", "").trim()); // field의 0번째 인덱스에서 ^, 빈칸 제거 후 s에 넣는다
//				for (int k10_j = 1; k10_j < k10_field.length; k10_j++) { // j가 1부터 field.length - 1까지 +1씩 증가하는 반복문
//					k10_s.append("."+ k10_field[k10_j].replace("^", "").trim()); // . + field의 j-1번째 인덱스에서 ^,빈칸 제거 후 s에 넣는다
//				}
//				k10_bw1.write(k10_s.toString()); // s를 String형태로 바꿔서 bw1에 write
//				k10_bw1.newLine(); // 개행
//				k10_wcnt++; // wcnt +1 증가
////				System.out.printf("write [%d][%d][%s]\n", cnt,wcnt,s.toString());
//			}
//			
//			k10_cnt++; // cnt +1 증가
//		}
//		
//		k10_br.close(); // br close
//		k10_bw1.close(); // bw1 close
//		
//		System.out.printf("Program End[%d][%d]records\n",k10_cnt,k10_wcnt); // 컴파일이 끝나면 해당 문장 출력
//	}
	
	public static void main(String[] args) throws IOException { // 슬라이드 11페이지 - utf8버전
		// THTSKS010H00.dat를 경로로 하는 파일 객체 f 생성
		File k10_f = new File("C:\\Users\\Bino\\Downloads\\day_data\\THTSKS010H00.dat");
		BufferedReader k10_br = new BufferedReader(new FileReader(k10_f)); // f를 읽어오는 BufferedReader 객체 br 생성
		
		// 바탕화면의 StockDailyPrice를 경로로하는 파일 객체 f1 생성
		File k10_f1 = new File("C:\\Users\\Bino\\Desktop\\StockDailyPrice.csv");
		BufferedWriter k10_bw1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(k10_f1), "UTF-8")); // f1을 작성하는 BufferedWriter 객체 bw1 생성
		
		String k10_readtxt; // String 변수 readtxt 생성
		
		int k10_cnt = 0, k10_wcnt = 0; // int 변수 cnt, wcnt 0으로 초기화
		while((k10_readtxt = k10_br.readLine()) != null) { // readtxt를 읽은 값이 null이 아니면
			StringBuffer k10_s = new StringBuffer(); // StringBuffer 객체 s 생성
			String[] k10_field = k10_readtxt.split("%_%"); // readtxt를 %_%로 구분한 String배열 field 생성
			
			// field의 길이가 2보다 크고 필드의 2번째 인덱스에서 ^제거, 빈칸 제거 후 첫번째 자리가 A라면
			if(k10_field.length > 2 && k10_field[2].replace("^", "").trim().substring(0, 1).equals("A")) { 
				k10_s.append(k10_field[0].replace("^", "").trim()); // field의 0번째 인덱스에서 ^, 빈칸 제거 후 s에 넣는다
				for (int k10_j = 1; k10_j < k10_field.length; k10_j++) { // j가 1부터 field.length - 1까지 +1씩 증가하는 반복문
					k10_s.append("."+ k10_field[k10_j].replace("^", "").trim()); // . + field의 j-1번째 인덱스에서 ^,빈칸 제거 후 s에 넣는다
				}
				k10_bw1.write(k10_s.toString()); // s를 String형태로 바꿔서 bw1에 write
				k10_bw1.newLine(); // 개행
				k10_wcnt++; // wcnt +1 증가
//				System.out.printf("write [%d][%d][%s]\n", cnt,wcnt,s.toString());
			}
			
			k10_cnt++; // cnt +1 증가
		}
		
		k10_br.close(); // br close
		k10_bw1.close(); // bw1 close
		
		System.out.printf("Program End[%d][%d]records\n",k10_cnt,k10_wcnt); // 컴파일이 끝나면 해당 문장 출력
	}
	
	
//	public static void main(String[] args) throws IOException { // 슬라이드 12페이지 - 실습 1
//		// THTSKS010H00.dat를 경로로 하는 파일 객체 f 생성
//		File k10_f = new File("C:\\Users\\Bino\\Downloads\\day_data\\THTSKS010H00.dat");
//		BufferedReader k10_br = new BufferedReader(new FileReader(k10_f)); // f를 읽어오는 BufferedReader 객체 br 생성
//		
//		// 바탕화면의 A005930를 경로로하는 파일 객체 f1 생성
//		File k10_f1 = new File("C:\\Users\\Bino\\Desktop\\A005930.csv");
//		BufferedWriter k10_bw1 = new BufferedWriter(new FileWriter(k10_f1)); // f1을 작성하는 BufferedWriter 객체 bw1 생성
//		
//		String k10_readtxt; // String 변수 readtxt 생성
//		
//		int k10_cnt = 0, k10_wcnt = 0; // int 변수 cnt, wcnt 0으로 초기화
//		while((k10_readtxt = k10_br.readLine()) != null) { // readtxt를 읽은 값이 null이 아니면
//			StringBuffer k10_s = new StringBuffer(); // StringBuffer 객체 s 생성
//			String[] k10_field = k10_readtxt.split("%_%"); // readtxt를 %_%로 구분한 String배열 field 생성
//			
//			// field의 길이가 2보다 크고 필드의 2번째 인덱스에서 ^제거, 빈칸 제거 한 7자리의 값이 A005930이라면
//			if(k10_field.length > 2 && k10_field[2].replace("^", "").trim().substring(0, 7).equals("A005930")) {
//				k10_s.append(k10_field[0].replace("^", "").trim()); // field의 0번째 인덱스에서 ^, 빈칸 제거 후 s에 넣는다
//				for (int k10_j = 1; k10_j < k10_field.length; k10_j++) { // j가 1부터 field.length - 1까지 +1씩 증가하는 반복문
//					k10_s.append("."+ k10_field[k10_j].replace("^", "").trim()); // . + field의 j-1번째 인덱스에서 ^,빈칸 제거 후 s에 넣는다
//				}
//				k10_bw1.write(k10_s.toString()); // s를 String형태로 바꿔서 bw1에 write
//				k10_bw1.newLine(); // 개행
//				k10_wcnt++; // wcnt +1 증가
////				System.out.printf("write [%d][%d][%s]\n", cnt,wcnt,s.toString());
//			}
//			
//			k10_cnt++; // cnt +1 증가
//		}
//		
//		k10_br.close(); // br close
//		k10_bw1.close(); // bw1 close
//		
//		System.out.printf("Program End[%d][%d]records\n",k10_cnt,k10_wcnt); // 컴파일이 끝나면 해당 문장 출력
//	}

//	public static void main(String[] args) throws IOException { // 슬라이드 12페이지 - 실습 2
//		// THTSKS010H00.dat를 경로로 하는 파일 객체 f 생성
//		File k10_f = new File("C:\\Users\\Bino\\Downloads\\day_data\\THTSKS010H00.dat");
//		BufferedReader k10_br = new BufferedReader(new FileReader(k10_f)); // f를 읽어오는 BufferedReader 객체 br 생성
//		
//		// 바탕화면의 20150112를 경로로하는 파일 객체 f1 생성
//		File k10_f1 = new File("C:\\Users\\Bino\\Desktop\\20150112.csv");
//		BufferedWriter k10_bw1 = new BufferedWriter(new FileWriter(k10_f1)); // f1을 작성하는 BufferedWriter 객체 bw1 생성
//		
//		String k10_readtxt; // String 변수 readtxt 생성
//		
//		int k10_cnt = 0, k10_wcnt = 0; // int 변수 cnt, wcnt 0으로 초기화
//		while((k10_readtxt = k10_br.readLine()) != null) { // readtxt를 읽은 값이 null이 아니면
//			StringBuffer k10_s = new StringBuffer(); // StringBuffer 객체 s 생성
//			String[] k10_field = k10_readtxt.split("%_%"); // readtxt를 %_%로 구분한 String배열 field 생성
//			
//			// field의 길이가 2보다 크고 필드의 1번째 인덱스에서 ^제거, 빈칸 제거 한 8자리의 값이 20150112이라면
//			if(k10_field.length > 2 && k10_field[1].replace("^", "").trim().substring(0, 8).equals("20150112")) {
//				k10_s.append(k10_field[0].replace("^", "").trim()); // field의 0번째 인덱스에서 ^, 빈칸 제거 후 s에 넣는다
//				for (int j = 1; j < k10_field.length; j++) { // j가 1부터 field.length - 1까지 +1씩 증가하는 반복문
//					k10_s.append("."+ k10_field[j].replace("^", "").trim()); // . + field의 j-1번째 인덱스에서 ^,빈칸 제거 후 s에 넣는다
//				}
//				k10_bw1.write(k10_s.toString()); // s를 String형태로 바꿔서 bw1에 write
//				k10_bw1.newLine(); // 개행
//				k10_wcnt++; // wcnt +1 증가
////				System.out.printf("write [%d][%d][%s]\n", cnt,wcnt,s.toString());
//			}
//			
//			k10_cnt++; // cnt +1 증가
//		}
//		
//		k10_br.close(); // br close
//		k10_bw1.close(); // bw1 close
//		
//		System.out.printf("Program End[%d][%d]records\n",k10_cnt,k10_wcnt); // 컴파일이 끝나면 해당 문장 출력
//	}
	
//	public static void main(String[] args) throws IOException { // 슬라이드 12페이지 - 실습 3 (종가 구하기)
//		// THTSKS010H00.dat를 경로로 하는 파일 객체 f 생성
//		File k10_f = new File("C:\\Users\\Bino\\Downloads\\day_data\\THTSKS010H00.dat");
//		BufferedReader k10_br = new BufferedReader(new FileReader(k10_f)); // f를 읽어오는 BufferedReader 객체 br 생성
//		
//		// 바탕화면의 2015년삼성전자최고최저종가를 경로로하는 파일 객체 f1 생성
//		File k10_f1 = new File("C:\\Users\\Bino\\Desktop\\2015년삼성전자최고최저종가.csv");
//		BufferedWriter k10_bw1 = new BufferedWriter(new FileWriter(k10_f1)); // f1을 작성하는 BufferedWriter 객체 bw1 생성
//		
//		String k10_readtxt; // String 변수 readtxt 생성
//		
//		int k10_cnt = 0, k10_wcnt = 0; // int 변수 cnt, wcnt 0으로 초기화
//		int k10_maxPrice = Integer.MIN_VALUE, k10_minPrice = Integer.MAX_VALUE; // 최대,최소값 변수 maxPrice, minPrice 생성
//		String k10_maxDay = null; // 최대값 날짜 null로 초기화
//		String k10_minDay = null; // 최소값 날짜 null로 초기화
//		
//		while((k10_readtxt = k10_br.readLine()) != null) { // readtxt를 읽은 값이 null이 아니면
//			StringBuffer k10_s = new StringBuffer(); // StringBuffer 객체 s 생성
//			String[] k10_field = k10_readtxt.split("%_%"); // readtxt를 %_%로 구분한 String배열 field 생성
//			
//			// field의 1번째 인덱스 값이 2015를 포함하고 2번째 인덱스값이 A005930과 일치한다면 
//			if((k10_field.length > 2 && k10_field[2].replace("^", "").trim().substring(0, 7).equals("A005930"))
//					&& (k10_field.length > 2 && k10_field[1].replace("^", "").trim().substring(0, 7).contains("2015"))) {
//				int k10_tmp = Integer.parseInt(k10_field[3].replace("^", "").trim().substring(0, 7)); // field의 0번째 인덱스에서 ^, 빈칸 제거 후 s에 넣는다
//				if (k10_tmp < k10_minPrice) { // 최저 종가, 일자 구하는 식
//					k10_minPrice = k10_tmp;
//					k10_minDay = k10_field[1].replace("^", "").trim().substring(0, 8);
//				}
//				if (k10_tmp > k10_maxPrice) { // 최고 종가, 일자 구하는 식
//					k10_maxPrice = k10_tmp;
//					k10_maxDay = k10_field[1].replace("^", "").trim().substring(0, 8);
//				}
//			}
//			
//			k10_cnt++; // cnt +1 증가
//		}
//		
//		k10_br.close(); // br close
//		k10_bw1.close(); // bw1 close
//		
////		System.out.printf("Program End[%d][%d]records\n",cnt,wcnt);
//		System.out.println("2015년 삼성전자 최고 종가 : " + k10_maxPrice); // 2015년 삼성전자 최고 종가 출력
//		System.out.println("최고 종가 일자 : " + k10_maxDay); // 최고종가 일자 출력
//		System.out.println("2015년 삼성전자 최저 종가 : " + k10_minPrice); // 2015년 삼성전자 최저 종가 출력
//		System.out.println("최저 종가 일자 : " + k10_minDay); // 최저종가 일자 출력
//	}
	
}