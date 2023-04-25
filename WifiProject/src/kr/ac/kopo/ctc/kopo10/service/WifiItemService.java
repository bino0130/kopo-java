package kr.ac.kopo.ctc.kopo10.service;

import kr.ac.kopo.ctc.kopo10.domain.WifiItem;

public class WifiItemService {

	// WifiItem을 데이터타입으로 하는 parameter wifiItem1, wifiItem2
	public double getDistance(WifiItem wifiItem1, WifiItem wifiItem2) { 
	
		// 두 점 사이의 거리 구하는 피타고라스 공식 - wifiitem1, wifiItem2의 위도,경도를 이용해서 거리를 구한다
		double k10_dist = Math.sqrt(Math.pow(wifiItem2.getK10_latitude() - wifiItem1.getK10_latitude(), 2)  
				+ Math.pow(wifiItem2.getK10_longitude() - wifiItem1.getK10_longitude(), 2)); 
		
		return k10_dist; // dist 리턴
	}
}