package ccl;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class PracticeNumberFive {

	public static void main(String[] args) {
		
		try { // try catch �� try
			File k10_f = new File ("C:\\Users\\Bino\\test1.txt"); // FileŬ���� ��ü k10_f ����
			FileWriter k10_fw = new FileWriter(k10_f); // FileWriter Ŭ���� ��ü k10_fw ����
			
			k10_fw.write("�ȳ� ����\n"); // fw��ü ȣ�� -> write�޼��� ȣ���ؼ� parameter "�ȳ� ����\n" ����
			k10_fw.write("hello ���\n"); // fw��ü ȣ�� -> write�޼��� ȣ���ؼ� parameter "hello ���\n" ����
			
			k10_fw.close(); // fw��ü ȣ�� -> close ����
			
			FileReader k10_fr = new FileReader(k10_f); // FileReader Ŭ���� ��ü k10_fr ����
			
			int k10_n = -1; // intŸ�� ���� n -1�� �ʱ�ȭ
			char [] k10_ch; // charŸ�� �迭 ch�迭 ����
			
			while(true) { // ���ѷ��� ����
				k10_ch = new char[100]; // 100�� ������ ����
				k10_n = k10_fr.read(k10_ch); // k10_fr ��ü ȣ���ؼ� read �޼��忡 k10_ch�� parameter�� ����
				
				if (k10_n == -1) break; // n�� -1�̸� break
				
				for (int k10_i = 0; k10_i < k10_n; k10_i++) { // i�� 0���� 1�� �����ϸ鼭 n���� ���������� �۵��ϴ� �ݺ���
					System.out.printf("%c", k10_ch[k10_i]); // k10_ch[i] ���
				}
			}
			
			k10_fr.close(); // fr��ü ȣ�� -> close�޼��� ����
			
			System.out.printf("\nFILE READ END "); // FILE READ END ���
		} catch (Exception e) { // try catch �� catch
			System.out.printf("�� ����[%s]\n", e); // ������ �ɸ��ٸ� �ش� ���� ���
		}
	}

}