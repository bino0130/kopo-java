package ccl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PracticeNumberEight {
// 경도 2, 위도 3, 주소 6 or 7
	public static void main(String[] args) {
		
		// 바탕화면에 전국무료와이파이표준데이터 csv파일을 경로로 하는 File 객체 f 생성
		File k10_f = new File("C:\\Users\\Bino\\Desktop\\전국공영주차장정보.txt");
		BufferedReader k10_br = null; // 파일을 read하는 BufferedReader 객체 br null값으로 초기화
		try { // try catch
			k10_br = new BufferedReader(new FileReader(k10_f)); // br값 BufferedReader(new FileReader(f))로 초기화
		} catch (FileNotFoundException e2) { // FileNotFoundException 발생시
			e2.printStackTrace(); // printStackTrace 호출
		} 

		String k10_readtxt = null; // String 타입 readtxt null값으로 초기화

		try { // try catch
			if ((k10_readtxt = k10_br.readLine()) == null) { // br에서 해당 line을 read한 값이 null이면
				System.out.printf("빈 파일입니다\n"); // 빈 파일입니다 출력
				return; // 리턴
			}
		} catch (IOException e1) { // IOException이 발생하면
			e1.printStackTrace(); // printStackTrace 호출
		}
		String[] k10_field_name = k10_readtxt.split("\t"); // readtxt를 \t을 기준으로 나눈 String타입 배열 field_name 선언

		double k10_lat = 37.3095371; // 집 주소 위도
		double k10_lng = 127.0973496; // 집 주소 경도

		int k10_LineCnt = 0; // int 타입 변수 LineCnt = 0으로 초기화

		// 최대거리, 최소거리 각각 Double.MIN_VALUE, Double.MAX_VALUE로 초기화
		double k10_maxDistance = Double.MIN_VALUE, k10_minDistance = Double.MAX_VALUE; 
		String k10_farPlace = ""; // 최장거리주소 초기화
		String k10_nearPlace = ""; // 최단거리 주소
		String k10_maxLat = ""; // 최장거리주소 위도
		String k10_maxLng = ""; // 취장거리주소 경도
		String k10_minLat = ""; // 최장거리주소 위도
		String k10_minLng = ""; // 최장거리주소 경도

		try { //try catch
			while ((k10_readtxt = k10_br.readLine()) != null) { // br에서 해당 line을 read한 값이 null이 아니면

				String[] k10_field = k10_readtxt.split("\t"); // readtxt를 \t을 기준으로 나눈 String타입 배열 field 선언
				double k10_dist = Math.sqrt(Math.pow(Double.parseDouble(k10_field[3]) - k10_lat, 2)
						+ Math.pow(Double.parseDouble(k10_field[2]) - k10_lng, 2)); // 위도 경도 계산

				if (k10_dist < k10_minDistance) { // 최단거리, 최단거리 주소, 최단거리 위도/경도 계산
					k10_minDistance = k10_dist;
					k10_nearPlace = k10_field[6];
					k10_minLat = k10_field[3];
					k10_minLng = k10_field[2];
				}
				if (k10_dist > k10_maxDistance) { // 최장거리, 최장거리 주소, 최장거리 위도/경도 계산
					k10_maxDistance = k10_dist;
					k10_farPlace = k10_field[6];
					k10_maxLat = k10_field[3];
					k10_maxLng = k10_field[2];
				}
				k10_LineCnt++; // LineCnt +1 증가
			}
		} catch (NumberFormatException e) { // NumberFormatException 발생 시
			e.printStackTrace(); // printStackTrace 호출
		} catch (IOException e) { // IOException 발생 시
			e.printStackTrace(); // printStackTrace 호출
		}

		System.out.println("최장 거리 :" + k10_maxDistance); // 최장거리 출력
		System.out.println("최장 거리 주소 : " + k10_farPlace); // 최장거리 주소 출력
		System.out.println("최장거리 주소 위도 : " + k10_maxLat); // 최장거리 주소 위도 출력
		System.out.println("최장거리 주소 경도 : " + k10_maxLng); // 최장거리 주소 경도 출력
		System.out.println(); // 개행
		System.out.println("최단 거리 :" + k10_minDistance); // 최단거리 출력 
		System.out.println("최단 거리 주소 : " + k10_nearPlace); // 최단거리 주소 출력
		System.out.println("최단거리 주소 위도 : " + k10_minLat); // 최단거리 주소 위도 출력
		System.out.println("최단거리 주소 경도 : " + k10_minLng); // 최단거리 주소 경도 출력

		try { // try catch
			k10_br.close(); // close
		} catch (IOException e) { // IOException 발생 시
			e.printStackTrace(); // printStackTrace 호출
		}
	}

}
