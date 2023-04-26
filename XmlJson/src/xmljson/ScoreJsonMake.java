package xmljson;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ScoreJsonMake { // 슬라이드 18페이지
	
	public static JSONObject oneRec(String k10_name, int k10_studentid, int k10_kor, int k10_eng, int k10_mat) {
		JSONObject k10_dataObject = new JSONObject(); // JSONObject의 객체 dataObject 생성
		k10_dataObject.put("name", k10_name); // dataObject에 name 입력
		k10_dataObject.put("studentid", k10_studentid); // dataObject에 studentid 입력
		JSONArray k10_score = new JSONArray(); // JSONArray의 객체 score 생성
		k10_score.add(k10_kor);k10_score.add(k10_eng);k10_score.add(k10_mat); // score에 kor, eng, mat 추가
		k10_dataObject.put("score", k10_score); // dataObject에 score 입력
		
		return k10_dataObject; // dataObject 리턴
	}

	public static void main(String[] args) {
		JSONObject k10_jsonObject = new JSONObject(); // JSONObject의 객체 jsonObject 생성
		JSONArray k10_datasArray = new JSONArray(); // JSONArray의 객체 datasArray 생성
		
		JSONObject k10_dataObject = new JSONObject(); // JSONObject의 객체 dataObject 생성
		k10_dataObject.put("name", "나연"); // dataObject의 name에 나연 입력
		k10_dataObject.put("studentid", 209901); // dataObject의 studentid에 209901 입력
		
		JSONArray k10_score = new JSONArray(); // JSONArray의 객체 score 생성
		k10_score.add(90);k10_score.add(100);k10_score.add(95); // score에 90,100,95 추가
		k10_dataObject.put("score", k10_score); // dataObject의 score에 score 입력
		k10_datasArray.add(k10_dataObject); // datasArray에 dataObject 추가
		
		k10_datasArray.add(oneRec("정연", 209902,100,85,75)); // datasArray에 정연, 209902, 100,85,75 추가
		k10_datasArray.add(oneRec("모모", 209903,90,75,85)); // datasArray에 모모, 209903, 90,75,85 추가
		k10_datasArray.add(oneRec("사나", 209904,90,85,75)); // datasArray에 사나, 209904, 90,85,75 추가
		k10_datasArray.add(oneRec("지효", 209905,80,75,85)); // datasArray에 지효, 209905, 80,75,85 추가
		k10_datasArray.add(oneRec("미나", 209906,90,85,55)); // datasArray에 미나, 209906, 90,85,55 추가
		k10_datasArray.add(oneRec("다현", 209907,70,75,65)); // datasArray에 다현, 209907, 70,75,65 추가
		k10_datasArray.add(oneRec("채영", 209908,100,75,95)); // datasArray에 채영, 209908, 100,75,95 추가
		k10_datasArray.add(oneRec("쯔위", 209909,80,65,95)); // datasArray에 쯔위, 209909, 80,65,95 추가
		
		try { // try catch
			FileWriter k10_file = new FileWriter("C:\\Users\\Bino\\Documents\\GitHub\\kopo-java\\XmlJson\\test1.json"); // test1.json파일 생성
			k10_file.write(k10_datasArray.toJSONString()); // datasArray를 jsonString으로 만들어서 파일 작성
			k10_file.flush(); // FileWriter 내부 버퍼의 내용을 파일에 write
			k10_file.close(); // FileWriter close
		} catch (IOException k10_e) { // IOException 발생 시
			k10_e.printStackTrace(); // printStackTrace 호출
		}
		System.out.println("JSON 만든거 : " + k10_datasArray); // datasArray 출력
	}

}
