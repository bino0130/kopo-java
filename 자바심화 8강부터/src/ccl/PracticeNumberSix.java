package ccl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeNumberSix {

	public static void FileWrite() throws IOException {
		File k10_f = new File("C:\\Users\\Bino\\test2.txt"); // File �Լ��� ��ü f ����. user ������ test1 �ؽ�Ʈ���� ������
		BufferedWriter k10_bw = new BufferedWriter(new FileWriter(k10_f)); // BufferedWriter �Լ��� ��ü bw ����
		
		k10_bw.write("�ȳ� ����"); // BufferedWriter �Լ��� ��ü bw���� write�޼��忡 parameter�� "�ȳ� ����" ����
		k10_bw.newLine(); // ����
		k10_bw.write("hello ���ss"); // BufferedWriter �Լ��� ��ü bw���� write�޼��忡 parameter�� "hello ���ss" ����
		k10_bw.newLine(); // ����
		
		k10_bw.close(); // close�� ������� ������ ������ ��� ��������. close �ʼ�
	}

	public static void FileRead() throws IOException {
		File k10_f = new File("C:\\Users\\Bino\\test1.txt"); // File �Լ��� ��ü f ����
		BufferedReader k10_br = new BufferedReader(new FileReader(k10_f)); // BufferedReader �Լ��� ��ü bw ����
		
		String k10_readtxt; // StringŸ�� readtxt ����
		
		while((k10_readtxt = k10_br.readLine()) != null) { // BufferedReader�� readLine ���� null�� �ƴϸ�
			System.out.printf("%s\n", k10_readtxt); // readtxt ���
		}
		
		k10_br.close(); // br��ü���� close�޼��� ȣ��
	}
	
	public static void main(String[] args) throws IOException {
		FileWrite(); // main �޼��忡�� FileWrite ����
		FileRead(); // main �޼��忡�� FileRead ����
	}

}