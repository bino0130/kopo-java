package kr.ac.kopo.ctc.kopo10.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.kopo10.domain.WifiItem;

public class WifiItemDao {
	public WifiItem create(WifiItem wifiItem) { // CRUD 중 C
		return null;
	}

	// read
	public WifiItem selectOne(int id) { // CRUD 중 R
		return null;
	}

	public List<WifiItem> selectAll() { // CRUD 중 R
		File k10_f = new File("C:\\Users\\Bino\\Desktop\\PublicWifi.txt"); // 바탕화면의 텍스트파일 PublicWifi를 경로로하는 파일 객체 f 생성
		BufferedReader k10_br = null; // BufferedReader 객체 br null로 선언
		try { // try catch
			k10_br = new BufferedReader(new FileReader(k10_f)); // br값 BufferedReader(new FileReader(f))로 초기화
		} catch (FileNotFoundException e) { // FileNotFoundException 발생시
			e.printStackTrace(); // printStackTrace 호출
		}
		List<WifiItem> k10_data = new ArrayList<WifiItem>(); // WifiItem을 데이터타입으로 하는 List data 생성

		String k10_readtxt = null; // String 타입 readtxt 선언

		try { // try catch
			if ((k10_readtxt = k10_br.readLine()) == null) { // br에서 해당 line을 read한 값이 null이면
				System.out.printf("빈 파일입니다\n"); // 빈 파일입니다 출력
				return null; // 리턴
			}
		} catch (IOException e) { // FileNotFoundException 발생시
			e.printStackTrace(); // printStackTrace 호출
		}

		try { // try catch
			while ((k10_readtxt = k10_br.readLine()) != null) { // br에서 해당 line을 read한 값이 null이 아니면
				String[] k10_field = k10_readtxt.split("\t"); // readtxt를 \t를 기준으로 나눈 String타입 배열 field 선언
				// WifiItem 데이터 타입의 객체 wi 생성 후 field[]의 요소 중 도로명주소, 위도, 경도 parameter로 넣어줌
				WifiItem k10_wi = new WifiItem(k10_field[9], Double.parseDouble(k10_field[13]),
						Double.parseDouble(k10_field[14]));
				k10_data.add(k10_wi); // data에 wi를 add
			}
		} catch (NumberFormatException | IOException e) { // FileNotFoundException 또는 IOException 발생시
			e.printStackTrace(); // printStackTrace 호출
		}

		try { // try catch
			k10_br.close(); // close
		} catch (IOException e) { // IOException 발생 시
			e.printStackTrace(); // printStackTrace 호출
		}
		return k10_data; // data 리턴
	}

	// ex) 4층 주차관리과가 3층으로 이전했다.
	public WifiItem update(int id, WifiItem wifiItem) { // CRUD 중 U
		return null;
	}

	public WifiItem delete(int id) { // CRUD 중 D
		return null;
	}
}