package ccl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PracticeNumberEight {

	public static void main(String[] args) throws IOException {
		// ����ȭ�鿡 ���������������ǥ�ص����� csv������ ��η� �ϴ� File ��ü f ����
				File k10_f = new File("C:\\Users\\Bino\\Desktop\\���������������ǥ�ص�����.txt");
				BufferedReader k10_br = new BufferedReader(new FileReader(k10_f)); // ������ read�ϴ� BufferedReader ��ü br ���� 
				
				String k10_readtxt; // String Ÿ�� readtxt ����
				
				if ((k10_readtxt = k10_br.readLine()) == null) { // br���� �ش� line�� read�� ���� null�̸�
					System.out.printf("�� �����Դϴ�\n"); // �� �����Դϴ� ���
					return; // ����
				}
				String[] k10_field_name = k10_readtxt.split("\t"); // readtxt�� ,�� �������� ���� StringŸ�� �迭 field_name ����
				
				double k10_lat = 37.3095371;
				double k10_lng = 127.0973496;
				
				int k10_LineCnt = 0; // int Ÿ�� ���� LineCnt = 0���� �ʱ�ȭ 
				
				while ((k10_readtxt = k10_br.readLine()) != null) { // �ش� line�� read�� ���� null�� �ƴϸ�
					String[] k10_field = k10_readtxt.split("\t"); // readtxt�� ,�� �������� ���� StringŸ�� �迭 field ����
					System.out.printf("**[%d��° �׸�]**************\n", k10_LineCnt); // n��° �׸� ���
					System.out.printf(" %s : %s\n", k10_field_name[10], k10_field[10]);
					System.out.printf(" %s : %s\n", k10_field_name[13], k10_field[13]);
					System.out.printf(" %s : %s\n", k10_field_name[14], k10_field[14]);
					double k10_dist = Math.sqrt( Math.pow(Double.parseDouble(k10_field[13]) - k10_lat, 2)) 
							+ Math.pow(Double.parseDouble(k10_field[14]) - k10_lng, 2);
					System.out.printf("���� ������ �Ÿ� : %f\n", k10_dist);
					System.out.printf("*****************************************************\n"); // �� ���
					
					k10_LineCnt++; // LineCnt +1 ����
				}
				
				k10_br.close(); // close
	}

}
