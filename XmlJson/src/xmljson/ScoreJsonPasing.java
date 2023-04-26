package xmljson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ScoreJsonPasing { // 슬라이드 20페이지

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException{
		// JSONParser : .json파일에서 Reader를 통해 텍스트를 읽어 들임
		JSONParser k10_parser = new JSONParser(); 
		// Object 객체 obj 생성 
		Object k10_obj = k10_parser.parse(new FileReader("C:\\Users\\Bino\\Documents\\GitHub\\kopo-java\\XmlJson\\test1.json"));
		// 파일에서 읽은 값이 여러개의 객체라면 JSONArray에 담았다가 JSONObject로 담음
		JSONArray k10_array = (JSONArray)k10_obj;
		
		System.out.println("********************************"); // 별찍기
		for (int k10_i = 0; k10_i < k10_array.size(); k10_i++) { // i가 0부터 array의 size - 1까지 +1씩 증가하는 반복문
			// 파일에서 읽은 값이 단건의 json객체라면 바로 JSONObject에 담음
			JSONObject k10_result = (JSONObject) k10_array.get(k10_i);
			System.out.println("이름 : " + k10_result.get("name")); // result에서 name 부분을 뽑아 이름 출력
			System.out.println("학번 : " + k10_result.get("studentid")); // result에서 studentid 부분을 뽑아 학번 출력
			
			JSONArray k10_score = (JSONArray) k10_result.get("score"); // JSONArray 객체 score 생성
			long k10_kor = (long)k10_score.get(0); // score의 0번째 값을 가져와서 long타입 변수 kor 선언
			long k10_eng = (long)k10_score.get(1); // score의 1번째 값을 가져와서 long타입 변수 eng 선언
			long k10_mat = (long)k10_score.get(2); // score의 2번째 값을 가져와서 long타입 변수 mat 선언
			System.out.println("국어 : " + k10_kor); // 국어 출력
			System.out.println("영어 : " + k10_eng); // 영어 출력
			System.out.println("수학 : " + k10_mat); // 수학 출력
			System.out.println("총점 : " + (k10_kor+k10_eng+k10_mat)); // 총점 출력
			System.out.println("평균 : " + ((k10_kor+k10_eng+k10_mat)/3.0)); // 평균 출력
			System.out.println("********************************");
		}
	}

}