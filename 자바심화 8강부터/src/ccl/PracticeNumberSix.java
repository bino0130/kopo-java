package ccl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeNumberSix {

	public static void FileWrite() throws IOException {
		File k10_f = new File("C:\\Users\\Bino\\test2.txt"); // File 함수의 객체 f 생성. user 폴더에 test1 텍스트파일 생성함
		BufferedWriter k10_bw = new BufferedWriter(new FileWriter(k10_f)); // BufferedWriter 함수의 객체 bw 생성
		
		k10_bw.write("안녕 파일"); // BufferedWriter 함수의 객체 bw에서 write메서드에 parameter로 "안녕 파일" 전달
		k10_bw.newLine(); // 개행
		k10_bw.write("hello 헬로ss"); // BufferedWriter 함수의 객체 bw에서 write메서드에 parameter로 "hello 헬로ss" 전달
		k10_bw.newLine(); // 개행
		
		k10_bw.close(); // close를 사용하지 않으면 파일이 계속 열려있음. close 필수
	}

	public static void FileRead() throws IOException {
		File k10_f = new File("C:\\Users\\Bino\\test1.txt"); // File 함수의 객체 f 생성
		BufferedReader k10_br = new BufferedReader(new FileReader(k10_f)); // BufferedReader 함수의 객체 bw 생성
		
		String k10_readtxt; // String타입 readtxt 선언
		
		while((k10_readtxt = k10_br.readLine()) != null) { // BufferedReader의 readLine 값이 null이 아니면
			System.out.printf("%s\n", k10_readtxt); // readtxt 출력
		}
		
		k10_br.close(); // br객체에서 close메서드 호출
	}
	
	public static void main(String[] args) throws IOException {
		FileWrite(); // main 메서드에서 FileWrite 실행
		FileRead(); // main 메서드에서 FileRead 실행
	}

}