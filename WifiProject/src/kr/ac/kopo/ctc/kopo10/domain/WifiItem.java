package kr.ac.kopo.ctc.kopo10.domain;

public class WifiItem {
	private String k10_roadNameAddress; // 도로명주소
	private double k10_latitude; // 위도
	private double k10_longitude; // 경도
	
	// 도로명주소, 위도, 경도를 parameter로하는 생성자
	public WifiItem (String k10_roadNameAddress, double k10_latitude, double k10_longitude) { 
		this.k10_roadNameAddress = k10_roadNameAddress; // roadNameAddress 생성자
		this.k10_latitude = k10_latitude; // latitude 생성자
		this.k10_longitude = k10_longitude; // longitude 생성자
	}
	
	public String getK10_roadNameAddress() { // 도로명주소 getter
		return k10_roadNameAddress;
	}

	public double getK10_latitude() { // 위도 getter
		return k10_latitude;
	}

	public double getK10_longitude() { // 경도 getter
		return k10_longitude;
	}
}