package kr.ac.kopo.ctc.kopo10;

import java.util.List;

import kr.ac.kopo.ctc.kopo10.dao.WifiItemDao;
import kr.ac.kopo.ctc.kopo10.domain.WifiItem;
import kr.ac.kopo.ctc.kopo10.service.WifiItemService;

public class WifiMain {

	public static void main(String[] args) throws Exception {
		WifiItemService k10_wifiItemService = new WifiItemService(); // WifiItemService�� ��ü wifiItemService ����
		WifiItemDao k10_wifiItemDao = new WifiItemDao(); // WifiItemDao�� ��ü wifiItemDao ����
		List<WifiItem> k10_wifiItems = k10_wifiItemDao.selectAll(); // WifiItem�� ������ Ÿ������ �ϴ� List wifiItems ����
		WifiItem k10_near = null; // ����� �Ÿ� ���ϴ� WifiItem near null�� �ʱ�ȭ
		WifiItem k10_far = null; // �� �Ÿ� ���ϴ� WifiItem far null�� �ʱ�ȭ
		
		// WifiItem�� ��ü me ���� �� parameter�� �д������, ����, �浵 ����
		WifiItem k10_me = new WifiItem("�д������", 37.3860521, 127.1214038); 
		
		double k10_minDist = Double.MAX_VALUE; // �ּҰŸ� �ʱ�ȭ
		double k10_maxDist = Double.MIN_VALUE; // �ִ�Ÿ� �ʱ�ȭ
		
		for(WifiItem k10_target : k10_wifiItems) { // for each
			// double ������Ÿ�� d�� wifiItemService�� �޼��� getDistance�� me, target�� parameter�� ������ ��
			double k10_d = k10_wifiItemService.getDistance(k10_me, k10_target); 
			
			if (k10_minDist > k10_d) { // �ּҰŸ�, �ּ�, ����, �浵 ���ϴ� ����
				k10_minDist = k10_d; 
				k10_near = k10_target;
			}
			if (k10_maxDist < k10_d) { // �ִ�Ÿ�, �ּ�, ����, �浵 ���ϴ� ����
				k10_maxDist = k10_d;
				k10_far = k10_target;
			}
		}
		System.out.printf("���� ����� �Ÿ� : %.6f\n",k10_minDist); // �Ÿ� ��� 
		System.out.println("���� ����� �ּ� : " + k10_near.getK10_roadNameAddress()); // �ּ� ���
		System.out.printf("���� ����� �ּ� ���� : %.6f\n",k10_near.getK10_latitude()); // ���� ���
		System.out.printf("���� ����� �ּ� �浵 : %.6f\n",k10_near.getK10_longitude()); // �浵 ���
		System.out.println(); // ����
		System.out.printf("���� �� �Ÿ� : %.6f\n",k10_maxDist); // �Ÿ� ���
		System.out.println("���� �� �ּ� : " + k10_far.getK10_roadNameAddress()); // �ּ� ���
		System.out.printf("���� �� �ּ� ���� : %.6f\n",k10_far.getK10_latitude()); // ���� ���
		System.out.printf("���� �� �ּ� �浵 : %.6f\n",k10_far.getK10_longitude()); // �浵 ���
	}
}