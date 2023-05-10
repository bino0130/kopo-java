package stockData;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class L08 {

//	public static void main(String[] args) throws IOException { // �����̵� 11������
//		// THTSKS010H00.dat�� ��η� �ϴ� ���� ��ü f ����
//		File k10_f = new File("C:\\Users\\Bino\\Downloads\\day_data\\THTSKS010H00.dat");
//		BufferedReader k10_br = new BufferedReader(new FileReader(k10_f)); // f�� �о���� BufferedReader ��ü br ����
//		
//		// ����ȭ���� StockDailyPrice�� ��η��ϴ� ���� ��ü f1 ����
//		File k10_f1 = new File("C:\\Users\\Bino\\Desktop\\StockDailyPrice.csv");
//		BufferedWriter k10_bw1 = new BufferedWriter(new FileWriter(k10_f1)); // f1�� �ۼ��ϴ� BufferedWriter ��ü bw1 ����
//		
//		String k10_readtxt; // String ���� readtxt ����
//		
//		int k10_cnt = 0, k10_wcnt = 0; // int ���� cnt, wcnt 0���� �ʱ�ȭ
//		while((k10_readtxt = k10_br.readLine()) != null) { // readtxt�� ���� ���� null�� �ƴϸ�
//			StringBuffer k10_s = new StringBuffer(); // StringBuffer ��ü s ����
//			String[] k10_field = k10_readtxt.split("%_%"); // readtxt�� %_%�� ������ String�迭 field ����
//			
//			// field�� ���̰� 2���� ũ�� �ʵ��� 2��° �ε������� ^����, ��ĭ ���� �� ù��° �ڸ��� A���
//			if(k10_field.length > 2 && k10_field[2].replace("^", "").trim().substring(0, 1).equals("A")) { 
//				k10_s.append(k10_field[0].replace("^", "").trim()); // field�� 0��° �ε������� ^, ��ĭ ���� �� s�� �ִ´�
//				for (int k10_j = 1; k10_j < k10_field.length; k10_j++) { // j�� 1���� field.length - 1���� +1�� �����ϴ� �ݺ���
//					k10_s.append("."+ k10_field[k10_j].replace("^", "").trim()); // . + field�� j-1��° �ε������� ^,��ĭ ���� �� s�� �ִ´�
//				}
//				k10_bw1.write(k10_s.toString()); // s�� String���·� �ٲ㼭 bw1�� write
//				k10_bw1.newLine(); // ����
//				k10_wcnt++; // wcnt +1 ����
////				System.out.printf("write [%d][%d][%s]\n", cnt,wcnt,s.toString());
//			}
//			
//			k10_cnt++; // cnt +1 ����
//		}
//		
//		k10_br.close(); // br close
//		k10_bw1.close(); // bw1 close
//		
//		System.out.printf("Program End[%d][%d]records\n",k10_cnt,k10_wcnt); // �������� ������ �ش� ���� ���
//	}
	
	public static void main(String[] args) throws IOException { // �����̵� 11������ - utf8����
		// THTSKS010H00.dat�� ��η� �ϴ� ���� ��ü f ����
		File k10_f = new File("C:\\Users\\Bino\\Downloads\\day_data\\THTSKS010H00.dat");
		BufferedReader k10_br = new BufferedReader(new FileReader(k10_f)); // f�� �о���� BufferedReader ��ü br ����
		
		// ����ȭ���� StockDailyPrice�� ��η��ϴ� ���� ��ü f1 ����
		File k10_f1 = new File("C:\\Users\\Bino\\Desktop\\StockDailyPrice.csv");
		BufferedWriter k10_bw1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(k10_f1), "UTF-8")); // f1�� �ۼ��ϴ� BufferedWriter ��ü bw1 ����
		
		String k10_readtxt; // String ���� readtxt ����
		
		int k10_cnt = 0, k10_wcnt = 0; // int ���� cnt, wcnt 0���� �ʱ�ȭ
		while((k10_readtxt = k10_br.readLine()) != null) { // readtxt�� ���� ���� null�� �ƴϸ�
			StringBuffer k10_s = new StringBuffer(); // StringBuffer ��ü s ����
			String[] k10_field = k10_readtxt.split("%_%"); // readtxt�� %_%�� ������ String�迭 field ����
			
			// field�� ���̰� 2���� ũ�� �ʵ��� 2��° �ε������� ^����, ��ĭ ���� �� ù��° �ڸ��� A���
			if(k10_field.length > 2 && k10_field[2].replace("^", "").trim().substring(0, 1).equals("A")) { 
				k10_s.append(k10_field[0].replace("^", "").trim()); // field�� 0��° �ε������� ^, ��ĭ ���� �� s�� �ִ´�
				for (int k10_j = 1; k10_j < k10_field.length; k10_j++) { // j�� 1���� field.length - 1���� +1�� �����ϴ� �ݺ���
					k10_s.append("."+ k10_field[k10_j].replace("^", "").trim()); // . + field�� j-1��° �ε������� ^,��ĭ ���� �� s�� �ִ´�
				}
				k10_bw1.write(k10_s.toString()); // s�� String���·� �ٲ㼭 bw1�� write
				k10_bw1.newLine(); // ����
				k10_wcnt++; // wcnt +1 ����
//				System.out.printf("write [%d][%d][%s]\n", cnt,wcnt,s.toString());
			}
			
			k10_cnt++; // cnt +1 ����
		}
		
		k10_br.close(); // br close
		k10_bw1.close(); // bw1 close
		
		System.out.printf("Program End[%d][%d]records\n",k10_cnt,k10_wcnt); // �������� ������ �ش� ���� ���
	}
	
	
//	public static void main(String[] args) throws IOException { // �����̵� 12������ - �ǽ� 1
//		// THTSKS010H00.dat�� ��η� �ϴ� ���� ��ü f ����
//		File k10_f = new File("C:\\Users\\Bino\\Downloads\\day_data\\THTSKS010H00.dat");
//		BufferedReader k10_br = new BufferedReader(new FileReader(k10_f)); // f�� �о���� BufferedReader ��ü br ����
//		
//		// ����ȭ���� A005930�� ��η��ϴ� ���� ��ü f1 ����
//		File k10_f1 = new File("C:\\Users\\Bino\\Desktop\\A005930.csv");
//		BufferedWriter k10_bw1 = new BufferedWriter(new FileWriter(k10_f1)); // f1�� �ۼ��ϴ� BufferedWriter ��ü bw1 ����
//		
//		String k10_readtxt; // String ���� readtxt ����
//		
//		int k10_cnt = 0, k10_wcnt = 0; // int ���� cnt, wcnt 0���� �ʱ�ȭ
//		while((k10_readtxt = k10_br.readLine()) != null) { // readtxt�� ���� ���� null�� �ƴϸ�
//			StringBuffer k10_s = new StringBuffer(); // StringBuffer ��ü s ����
//			String[] k10_field = k10_readtxt.split("%_%"); // readtxt�� %_%�� ������ String�迭 field ����
//			
//			// field�� ���̰� 2���� ũ�� �ʵ��� 2��° �ε������� ^����, ��ĭ ���� �� 7�ڸ��� ���� A005930�̶��
//			if(k10_field.length > 2 && k10_field[2].replace("^", "").trim().substring(0, 7).equals("A005930")) {
//				k10_s.append(k10_field[0].replace("^", "").trim()); // field�� 0��° �ε������� ^, ��ĭ ���� �� s�� �ִ´�
//				for (int k10_j = 1; k10_j < k10_field.length; k10_j++) { // j�� 1���� field.length - 1���� +1�� �����ϴ� �ݺ���
//					k10_s.append("."+ k10_field[k10_j].replace("^", "").trim()); // . + field�� j-1��° �ε������� ^,��ĭ ���� �� s�� �ִ´�
//				}
//				k10_bw1.write(k10_s.toString()); // s�� String���·� �ٲ㼭 bw1�� write
//				k10_bw1.newLine(); // ����
//				k10_wcnt++; // wcnt +1 ����
////				System.out.printf("write [%d][%d][%s]\n", cnt,wcnt,s.toString());
//			}
//			
//			k10_cnt++; // cnt +1 ����
//		}
//		
//		k10_br.close(); // br close
//		k10_bw1.close(); // bw1 close
//		
//		System.out.printf("Program End[%d][%d]records\n",k10_cnt,k10_wcnt); // �������� ������ �ش� ���� ���
//	}

//	public static void main(String[] args) throws IOException { // �����̵� 12������ - �ǽ� 2
//		// THTSKS010H00.dat�� ��η� �ϴ� ���� ��ü f ����
//		File k10_f = new File("C:\\Users\\Bino\\Downloads\\day_data\\THTSKS010H00.dat");
//		BufferedReader k10_br = new BufferedReader(new FileReader(k10_f)); // f�� �о���� BufferedReader ��ü br ����
//		
//		// ����ȭ���� 20150112�� ��η��ϴ� ���� ��ü f1 ����
//		File k10_f1 = new File("C:\\Users\\Bino\\Desktop\\20150112.csv");
//		BufferedWriter k10_bw1 = new BufferedWriter(new FileWriter(k10_f1)); // f1�� �ۼ��ϴ� BufferedWriter ��ü bw1 ����
//		
//		String k10_readtxt; // String ���� readtxt ����
//		
//		int k10_cnt = 0, k10_wcnt = 0; // int ���� cnt, wcnt 0���� �ʱ�ȭ
//		while((k10_readtxt = k10_br.readLine()) != null) { // readtxt�� ���� ���� null�� �ƴϸ�
//			StringBuffer k10_s = new StringBuffer(); // StringBuffer ��ü s ����
//			String[] k10_field = k10_readtxt.split("%_%"); // readtxt�� %_%�� ������ String�迭 field ����
//			
//			// field�� ���̰� 2���� ũ�� �ʵ��� 1��° �ε������� ^����, ��ĭ ���� �� 8�ڸ��� ���� 20150112�̶��
//			if(k10_field.length > 2 && k10_field[1].replace("^", "").trim().substring(0, 8).equals("20150112")) {
//				k10_s.append(k10_field[0].replace("^", "").trim()); // field�� 0��° �ε������� ^, ��ĭ ���� �� s�� �ִ´�
//				for (int j = 1; j < k10_field.length; j++) { // j�� 1���� field.length - 1���� +1�� �����ϴ� �ݺ���
//					k10_s.append("."+ k10_field[j].replace("^", "").trim()); // . + field�� j-1��° �ε������� ^,��ĭ ���� �� s�� �ִ´�
//				}
//				k10_bw1.write(k10_s.toString()); // s�� String���·� �ٲ㼭 bw1�� write
//				k10_bw1.newLine(); // ����
//				k10_wcnt++; // wcnt +1 ����
////				System.out.printf("write [%d][%d][%s]\n", cnt,wcnt,s.toString());
//			}
//			
//			k10_cnt++; // cnt +1 ����
//		}
//		
//		k10_br.close(); // br close
//		k10_bw1.close(); // bw1 close
//		
//		System.out.printf("Program End[%d][%d]records\n",k10_cnt,k10_wcnt); // �������� ������ �ش� ���� ���
//	}
	
//	public static void main(String[] args) throws IOException { // �����̵� 12������ - �ǽ� 3 (���� ���ϱ�)
//		// THTSKS010H00.dat�� ��η� �ϴ� ���� ��ü f ����
//		File k10_f = new File("C:\\Users\\Bino\\Downloads\\day_data\\THTSKS010H00.dat");
//		BufferedReader k10_br = new BufferedReader(new FileReader(k10_f)); // f�� �о���� BufferedReader ��ü br ����
//		
//		// ����ȭ���� 2015��Ｚ�����ְ����������� ��η��ϴ� ���� ��ü f1 ����
//		File k10_f1 = new File("C:\\Users\\Bino\\Desktop\\2015��Ｚ�����ְ���������.csv");
//		BufferedWriter k10_bw1 = new BufferedWriter(new FileWriter(k10_f1)); // f1�� �ۼ��ϴ� BufferedWriter ��ü bw1 ����
//		
//		String k10_readtxt; // String ���� readtxt ����
//		
//		int k10_cnt = 0, k10_wcnt = 0; // int ���� cnt, wcnt 0���� �ʱ�ȭ
//		int k10_maxPrice = Integer.MIN_VALUE, k10_minPrice = Integer.MAX_VALUE; // �ִ�,�ּҰ� ���� maxPrice, minPrice ����
//		String k10_maxDay = null; // �ִ밪 ��¥ null�� �ʱ�ȭ
//		String k10_minDay = null; // �ּҰ� ��¥ null�� �ʱ�ȭ
//		
//		while((k10_readtxt = k10_br.readLine()) != null) { // readtxt�� ���� ���� null�� �ƴϸ�
//			StringBuffer k10_s = new StringBuffer(); // StringBuffer ��ü s ����
//			String[] k10_field = k10_readtxt.split("%_%"); // readtxt�� %_%�� ������ String�迭 field ����
//			
//			// field�� 1��° �ε��� ���� 2015�� �����ϰ� 2��° �ε������� A005930�� ��ġ�Ѵٸ� 
//			if((k10_field.length > 2 && k10_field[2].replace("^", "").trim().substring(0, 7).equals("A005930"))
//					&& (k10_field.length > 2 && k10_field[1].replace("^", "").trim().substring(0, 7).contains("2015"))) {
//				int k10_tmp = Integer.parseInt(k10_field[3].replace("^", "").trim().substring(0, 7)); // field�� 0��° �ε������� ^, ��ĭ ���� �� s�� �ִ´�
//				if (k10_tmp < k10_minPrice) { // ���� ����, ���� ���ϴ� ��
//					k10_minPrice = k10_tmp;
//					k10_minDay = k10_field[1].replace("^", "").trim().substring(0, 8);
//				}
//				if (k10_tmp > k10_maxPrice) { // �ְ� ����, ���� ���ϴ� ��
//					k10_maxPrice = k10_tmp;
//					k10_maxDay = k10_field[1].replace("^", "").trim().substring(0, 8);
//				}
//			}
//			
//			k10_cnt++; // cnt +1 ����
//		}
//		
//		k10_br.close(); // br close
//		k10_bw1.close(); // bw1 close
//		
////		System.out.printf("Program End[%d][%d]records\n",cnt,wcnt);
//		System.out.println("2015�� �Ｚ���� �ְ� ���� : " + k10_maxPrice); // 2015�� �Ｚ���� �ְ� ���� ���
//		System.out.println("�ְ� ���� ���� : " + k10_maxDay); // �ְ����� ���� ���
//		System.out.println("2015�� �Ｚ���� ���� ���� : " + k10_minPrice); // 2015�� �Ｚ���� ���� ���� ���
//		System.out.println("���� ���� ���� : " + k10_minDay); // �������� ���� ���
//	}
	
}