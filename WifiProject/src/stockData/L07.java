package stockData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class L07 {

	public static void main(String[] args) throws IOException {
		// THTSKS010H00.dat�� ��η� �ϴ� ���� ��ü f ����
		File k10_f = new File("C:\\Users\\Bino\\Downloads\\day_data\\THTSKS010H00.dat");
		BufferedReader k10_br = new BufferedReader(new FileReader(k10_f)); // f�� �о���� BufferedReader ��ü br ����
		
		String k10_readtxt; // StringŸ�� ���� readtxt ����
		int k10_LineCnt = 0; // intŸ�� ���� LineCnt 0���� �ʱ�ȭ
		int k10_n = -1; // int Ÿ�� ���� n = -1�� �ʱ�ȭ
		StringBuffer k10_s = new StringBuffer(); // StringBuffer ��ü s ����
		while(true) { // ���ѷ���
			char[] k10_ch = new char[1000]; // ũ�� 1000�� �迭 ch ����
			k10_n = k10_br.read(k10_ch); // n�� �迭 ch�� ���� ��
			
			if (k10_n == -1) break; // n�� -1�̸� break
			
			for(char k10_c : k10_ch) { // �迭 ch�� ������ c�� �ϳ��� �����ϴ� for each
				if(k10_c == '\n') { // c�� ���๮�ڸ�
					System.out.printf("[%s]***\n",k10_s.toString()); // StringBuffer ��ü s�� String���·� �ٲ۰��� ���
					k10_s.delete(0, k10_s.length()); // s�� 0��° �ε������� s�� ���̿� �ش��ϴ� �ε������� ����
				} else { // c�� ���๮�ڰ� �ƴϸ�
					k10_s.append(k10_c); // s�� c�� �߰�
				}
			}
			k10_LineCnt++; // LineCnt +1 ����
		}
		System.out.printf("[%s]***\n",k10_s.toString()); // StringBuffer ��ü s�� String���·� �ٲ۰��� ��� 
		k10_br.close(); // br close
	}

}
