package ccl;

import java.io.*;

public class PracticeNumberSeven {

	public static void main(String[] args) throws IOException {
		// ����ȭ�鿡 ���������������ǥ�ص����� csv������ ��η� �ϴ� File ��ü f ����
		File k10_f = new File("C:\\Users\\Bino\\Desktop\\���������������ǥ�ص�����.csv");
		BufferedReader k10_br = new BufferedReader(new FileReader(k10_f)); // ������ read�ϴ� BufferedReader ��ü br ���� 
		
		String k10_readtxt; // String Ÿ�� readtxt ����
		
		if ((k10_readtxt = k10_br.readLine()) == null) { // br���� �ش� line�� read�� ���� null�̸�
			System.out.printf("�� �����Դϴ�\n"); // �� �����Դϴ� ���
			return; // ����
		}
		String[] k10_field_name = k10_readtxt.split(","); // readtxt�� ,�� �������� ���� StringŸ�� �迭 field_name ����
		
		int k10_LineCnt = 0; // int Ÿ�� ���� LineCnt = 0���� �ʱ�ȭ 
		
		while ((k10_readtxt = k10_br.readLine()) != null) { // �ش� line�� read�� ���� null�� �ƴϸ�
			String[] k10_field = k10_readtxt.split(","); // readtxt�� ,�� �������� ���� StringŸ�� �迭 field ����
			System.out.printf("**[%d��° �׸�]**************\n", k10_LineCnt); // n��° �׸� ���
			for (int k10_j = 0; k10_j < k10_field_name.length; k10_j++) { // j�� field_name���� ������������ 0���� +1�� �����ϴ� �ݺ��� ����
				System.out.printf(" %s : %s\n", k10_field_name[k10_j], k10_field[k10_j]); // ������ �迭 field_name, field�� j��° �ε��� ��� 
			}
			System.out.printf("*****************************************************\n"); // �� ���
			if (k10_LineCnt == 100) break; // LineCnt�� 100�� �Ǹ� break
			k10_LineCnt++; // LineCnt +1 ����
		}
		
		k10_br.close(); // close
	}

}