package kr.ac.kopo.ctc.kopo10;

import java.util.List;

import kr.ac.kopo.ctc.kopo10.dao.WifiItemDao;
import kr.ac.kopo.ctc.kopo10.domain.WifiItem;
import kr.ac.kopo.ctc.kopo10.service.WifiItemService;

public class WifiMain {

	public static void main(String[] args) throws Exception {
		WifiItemService k10_wifiItemService = new WifiItemService(); // WifiItemService의 객체 wifiItemService 생성
		WifiItemDao k10_wifiItemDao = new WifiItemDao(); // WifiItemDao의 객체 wifiItemDao 생성
		List<WifiItem> k10_wifiItems = k10_wifiItemDao.selectAll(); // WifiItem을 데이터 타입으로 하는 List wifiItems 생성
		WifiItem k10_near = null; // 가까운 거리 구하는 WifiItem near null로 초기화
		WifiItem k10_far = null; // 먼 거리 구하는 WifiItem far null로 초기화
		
		// WifiItem의 객체 me 생성 후 parameter에 분당융기원, 위도, 경도 대입
		WifiItem k10_me = new WifiItem("분당융기원", 37.3860521, 127.1214038); 
		
		double k10_minDist = Double.MAX_VALUE; // 최소거리 초기화
		double k10_maxDist = Double.MIN_VALUE; // 최대거리 초기화
		
		for(WifiItem k10_target : k10_wifiItems) { // for each
			// double 데이터타입 d는 wifiItemService의 메서드 getDistance에 me, target을 parameter로 대입한 값
			double k10_d = k10_wifiItemService.getDistance(k10_me, k10_target); 
			
			if (k10_minDist > k10_d) { // 최소거리, 주소, 위도, 경도 구하는 과정
				k10_minDist = k10_d; 
				k10_near = k10_target;
			}
			if (k10_maxDist < k10_d) { // 최대거리, 주소, 위도, 경도 구하는 과정
				k10_maxDist = k10_d;
				k10_far = k10_target;
			}
		}
		System.out.printf("가장 가까운 거리 : %.6f\n",k10_minDist); // 거리 출력 
		System.out.println("가장 가까운 주소 : " + k10_near.getK10_roadNameAddress()); // 주소 출력
		System.out.printf("가장 가까운 주소 위도 : %.6f\n",k10_near.getK10_latitude()); // 위도 출력
		System.out.printf("가장 가까운 주소 경도 : %.6f\n",k10_near.getK10_longitude()); // 경도 출력
		System.out.println(); // 개행
		System.out.printf("가장 먼 거리 : %.6f\n",k10_maxDist); // 거리 출력
		System.out.println("가장 먼 주소 : " + k10_far.getK10_roadNameAddress()); // 주소 출력
		System.out.printf("가장 먼 주소 위도 : %.6f\n",k10_far.getK10_latitude()); // 위도 출력
		System.out.printf("가장 먼 주소 경도 : %.6f\n",k10_far.getK10_longitude()); // 경도 출력
	}
}