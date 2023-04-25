package kr.ac.kopo.ctc.kopo10.service;

import kr.ac.kopo.ctc.kopo10.domain.WifiItem;

public class WifiItemService {

	// WifiItem�� ������Ÿ������ �ϴ� parameter wifiItem1, wifiItem2
	public double getDistance(WifiItem wifiItem1, WifiItem wifiItem2) { 
	
		// �� �� ������ �Ÿ� ���ϴ� ��Ÿ��� ���� - wifiitem1, wifiItem2�� ����,�浵�� �̿��ؼ� �Ÿ��� ���Ѵ�
		double k10_dist = Math.sqrt(Math.pow(wifiItem2.getK10_latitude() - wifiItem1.getK10_latitude(), 2)  
				+ Math.pow(wifiItem2.getK10_longitude() - wifiItem1.getK10_longitude(), 2)); 
		
		return k10_dist; // dist ����
	}
}