package kr.ac.kopo.ctc.kopo10.domain;

public class WifiItem {
	private String k10_roadNameAddress; // ���θ��ּ�
	private double k10_latitude; // ����
	private double k10_longitude; // �浵
	
	// ���θ��ּ�, ����, �浵�� parameter���ϴ� ������
	public WifiItem (String k10_roadNameAddress, double k10_latitude, double k10_longitude) { 
		this.k10_roadNameAddress = k10_roadNameAddress; // roadNameAddress ������
		this.k10_latitude = k10_latitude; // latitude ������
		this.k10_longitude = k10_longitude; // longitude ������
	}
	
	public String getK10_roadNameAddress() { // ���θ��ּ� getter
		return k10_roadNameAddress;
	}

	public double getK10_latitude() { // ���� getter
		return k10_latitude;
	}

	public double getK10_longitude() { // �浵 getter
		return k10_longitude;
	}
}