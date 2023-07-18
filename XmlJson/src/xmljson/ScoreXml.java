package xmljson;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ScoreXml { // 슬라이드 9페이지

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// DocumentBuilderFactory의 동적 객체를 생성한 DocumentBuilder 객체 docBuilder 생성
		DocumentBuilder k10_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		
		// 바탕화면의 score.xml을 경로로 parse한 document 객체 doc 생성
		Document k10_doc = k10_docBuilder.parse(new File("C:\\Users\\Bino\\Desktop\\score.xml"));
		
		Element k10_root = k10_doc.getDocumentElement(); // root 요소 구하기
		
		NodeList k10_tag_name = k10_doc.getElementsByTagName("name"); // 하위 엘리먼트 name에 접근
		NodeList k10_tag_studentid = k10_doc.getElementsByTagName("studentid"); // 하위 엘리먼트 studentid에 접근
		NodeList k10_tag_kor = k10_doc.getElementsByTagName("kor"); // 하위 엘리먼트 kor에 접근
		NodeList k10_tag_eng = k10_doc.getElementsByTagName("eng"); // 하위 엘리먼트 eng에 접근
		NodeList k10_tag_mat = k10_doc.getElementsByTagName("mat"); // 하위 엘리먼트 mat에 접근
		
		System.out.printf("****************************\n"); // 별찍기
		for(int k10_i = 0; k10_i < k10_tag_name.getLength(); k10_i++) { // i가 0부터 tag_name의 길이 - 1까지 +1씩 증가하는 반복문
			System.out.printf("이름 : %s\n", k10_tag_name.item(k10_i).getFirstChild().getNodeValue()); // 이름 출력
			System.out.printf("학번 : %s\n", k10_tag_studentid.item(k10_i).getFirstChild().getNodeValue()); // 학번 출력
			System.out.printf("국어 : %s\n", k10_tag_kor.item(k10_i).getFirstChild().getNodeValue()); // 국어 출력
			System.out.printf("영어 : %s\n", k10_tag_eng.item(k10_i).getFirstChild().getNodeValue()); // 영어 출력
			System.out.printf("수학 : %s\n", k10_tag_mat.item(k10_i).getFirstChild().getNodeValue()); // 수학 출력
			System.out.printf("****************************\n"); // 별찍기
		}
	}
}