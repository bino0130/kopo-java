package ccl;

import java.io.*;

public class PracticeNumberEight {
//// �浵 2, ���� 3, �ּ� 6 or 7
	public static void main(String[] args) { // �ǽ� 3
		
		// ����ȭ�鿡 ���������������ǥ�ص����� csv������ ��η� �ϴ� File ��ü f ����
		File k10_f = new File("C:\\Users\\Bino\\Desktop\\������������������.txt");
		BufferedReader k10_br = null; // ������ read�ϴ� BufferedReader ��ü br null������ �ʱ�ȭ
		try { // try catch
			k10_br = new BufferedReader(new FileReader(k10_f)); // br�� BufferedReader(new FileReader(f))�� �ʱ�ȭ
		} catch (FileNotFoundException e2) { // FileNotFoundException �߻���
			e2.printStackTrace(); // printStackTrace ȣ��
		} 

		String k10_readtxt = null; // String Ÿ�� readtxt null������ �ʱ�ȭ

		try { // try catch
			if ((k10_readtxt = k10_br.readLine()) == null) { // br���� �ش� line�� read�� ���� null�̸�
				System.out.printf("�� �����Դϴ�\n"); // �� �����Դϴ� ���
				return; // ����
			}
		} catch (IOException e1) { // IOException�� �߻��ϸ�
			e1.printStackTrace(); // printStackTrace ȣ��
		}
		String[] k10_field_name = k10_readtxt.split("\t"); // readtxt�� \t�� �������� ���� StringŸ�� �迭 field_name ����

		double k10_lat = 37.3095371; // �� �ּ� ����
		double k10_lng = 127.0973496; // �� �ּ� �浵

		int k10_LineCnt = 0; // int Ÿ�� ���� LineCnt = 0���� �ʱ�ȭ

		// �ִ�Ÿ�, �ּҰŸ� ���� Double.MIN_VALUE, Double.MAX_VALUE�� �ʱ�ȭ
		double k10_maxDistance = Double.MIN_VALUE, k10_minDistance = Double.MAX_VALUE; 
		String k10_farPlace = ""; // ����Ÿ��ּ� �ʱ�ȭ
		String k10_nearPlace = ""; // �ִܰŸ� �ּ�
		String k10_maxLat = ""; // ����Ÿ��ּ� ����
		String k10_maxLng = ""; // ����Ÿ��ּ� �浵
		String k10_minLat = ""; // ����Ÿ��ּ� ����
		String k10_minLng = ""; // ����Ÿ��ּ� �浵

		try { //try catch
			while ((k10_readtxt = k10_br.readLine()) != null) { // br���� �ش� line�� read�� ���� null�� �ƴϸ�

				String[] k10_field = k10_readtxt.split("\t"); // readtxt�� \t�� �������� ���� StringŸ�� �迭 field ����
				double k10_dist = Math.sqrt(Math.pow(Double.parseDouble(k10_field[3]) - k10_lat, 2)
						+ Math.pow(Double.parseDouble(k10_field[2]) - k10_lng, 2)); // ���� �浵 ���

				if (k10_dist < k10_minDistance) { // �ִܰŸ�, �ִܰŸ� �ּ�, �ִܰŸ� ����/�浵 ���
					k10_minDistance = k10_dist;
					k10_nearPlace = k10_field[6];
					k10_minLat = k10_field[3];
					k10_minLng = k10_field[2];
				}
				if (k10_dist > k10_maxDistance) { // ����Ÿ�, ����Ÿ� �ּ�, ����Ÿ� ����/�浵 ���
					k10_maxDistance = k10_dist;
					k10_farPlace = k10_field[6];
					k10_maxLat = k10_field[3];
					k10_maxLng = k10_field[2];
				}
				k10_LineCnt++; // LineCnt +1 ����
			}
		} catch (NumberFormatException e) { // NumberFormatException �߻� ��
			e.printStackTrace(); // printStackTrace ȣ��
		} catch (IOException e) { // IOException �߻� ��
			e.printStackTrace(); // printStackTrace ȣ��
		}

		System.out.printf("���� �Ÿ� : %.6f\n",k10_maxDistance); // ����Ÿ� ���
		System.out.println("���� �Ÿ� �ּ� : " + k10_farPlace); // ����Ÿ� �ּ� ���
		System.out.printf("����Ÿ� �ּ� ���� : %.8s\n",k10_maxLat); // ����Ÿ� �ּ� ���� ���
		System.out.printf("����Ÿ� �ּ� �浵 : %.8s\n",k10_maxLng); // ����Ÿ� �ּ� �浵 ���
		System.out.printf("\n�ִ� �Ÿ� : %.6f\n",k10_minDistance); // �ִܰŸ� ��� 
		System.out.println("�ִ� �Ÿ� �ּ� : " + k10_nearPlace); // �ִܰŸ� �ּ� ���
		System.out.printf("�ִܰŸ� �ּ� ���� : %.8s\n",k10_minLat); // �ִܰŸ� �ּ� ���� ���
		System.out.printf("�ִܰŸ� �ּ� �浵 : %.8s\n",k10_minLng); // �ִܰŸ� �ּ� �浵 ���

		try { // try catch
			k10_br.close(); // close
		} catch (IOException e) { // IOException �߻� ��
			e.printStackTrace(); // printStackTrace ȣ��
		}
	}

//	public static void main(String[] args) throws IOException { // �ǽ� 1
//		// ����ȭ�鿡 ���������������ǥ�ص����� txt������ ��η� �ϴ� File ��ü f ����
//		File k10_f = new File("C:\\Users\\Bino\\Desktop\\���������������ǥ�ص�����.txt");
//		BufferedReader k10_br = new BufferedReader(new FileReader(k10_f)); // ������ read�ϴ� BufferedReader ��ü br ����
//		
//		String k10_readtxt; // String Ÿ�� readtxt ����
//		
//		if((k10_readtxt = k10_br.readLine()) == null) { // br���� �ش� line�� read�� ���� null�̸�
//			System.out.printf("�� �����Դϴ�\n"); // �� �����Դϴ� ���
//			return; // ����
//		}
//		String[] k10_field_name = k10_readtxt.split("\t"); // readtxt�� \t�� �������� ���� StringŸ�� �迭 field_name ����
//		
//		double k10_lat = 37.3860521; // ����� ����
//		double k10_lng = 127.1214038; // ����� �浵
//		
//		int k10_LineCnt = 0; // int Ÿ�� ���� LineCnt = 0���� �ʱ�ȭ
//		while ((k10_readtxt = k10_br.readLine()) != null) { // br���� �ش� line�� read�� ���� null�� �ƴϸ�
//			String[] k10_field = k10_readtxt.split("\t"); // readtxt�� \t�� �������� ���� StringŸ�� �迭 field ����
//			System.out.printf("**[%d��° �׸�]**************\n", k10_LineCnt); // n��° �׸� ���
//			System.out.printf(" %s : %s\n", k10_field_name[9], k10_field[9]); // ���θ� �ּ� 
//			System.out.printf("%s : %s\n", k10_field_name[13], k10_field[13]); // ����
//			System.out.printf("%s : %s\n", k10_field_name[14], k10_field[14]); // �浵
//			double k10_dist = Math.sqrt(Math.pow(Double.parseDouble(k10_field[13]) - k10_lat,2) + // ��Ÿ��� �Ÿ� ���� 
//					Math.pow(Double.parseDouble(k10_field[14])-k10_lng, 2));
//			System.out.printf(" ���������� �Ÿ� : %f\n", k10_dist); // ���� ������ �Ÿ� ���
//			System.out.printf("****************************\n"); // �� ���
//			
//			k10_LineCnt++; // LineCnt + 1 ����
//		}
//		
//		k10_br.close(); // close
//	}

//	public static void main(String[] args) throws IOException { // �ǽ� 2
//		// ����ȭ�鿡 ���������������ǥ�ص����� txt������ ��η� �ϴ� File ��ü f ����
//		File k10_f = new File("C:\\Users\\Bino\\Desktop\\���������������ǥ�ص�����.txt");
//		BufferedReader k10_br = new BufferedReader(new FileReader(k10_f)); // ������ read�ϴ� BufferedReader ��ü br ����
//
//		String k10_readtxt; // String Ÿ�� readtxt ����
//
//		if ((k10_readtxt = k10_br.readLine()) == null) { // br���� �ش� line�� read�� ���� null�̸�
//			System.out.printf("�� �����Դϴ�\n"); // �� �����Դϴ� ���
//			return; // ����
//		}
//		String[] k10_field_name = k10_readtxt.split("\t"); // readtxt�� \t�� �������� ���� StringŸ�� �迭 field_name ����
//
//		double k10_lat = 37.3860521; // ����� ����
//		double k10_lng = 127.1214038; // ����� �浵
//
//		int k10_LineCnt = 0; // int Ÿ�� ���� LineCnt = 0���� �ʱ�ȭ
//		// �ִ�Ÿ�, �ּҰŸ� ���� Double.MIN_VALUE, Double.MAX_VALUE�� �ʱ�ȭ
//		double k10_maxDistance = Double.MIN_VALUE, k10_minDistance = Double.MAX_VALUE;
//		String k10_farPlace = ""; // ����Ÿ��ּ� �ʱ�ȭ
//		String k10_nearPlace = ""; // �ִܰŸ� �ּ�
//		String k10_maxLat = ""; // ����Ÿ��ּ� ����
//		String k10_maxLng = ""; // ����Ÿ��ּ� �浵
//		String k10_minLat = ""; // ����Ÿ��ּ� ����
//		String k10_minLng = ""; // ����Ÿ��ּ� �浵
//
//		while ((k10_readtxt = k10_br.readLine()) != null) { // br���� �ش� line�� read�� ���� null�� �ƴϸ�
//			String[] k10_field = k10_readtxt.split("\t"); // readtxt�� \t�� �������� ���� StringŸ�� �迭 field ����
//
//			double k10_dist = Math.sqrt(Math.pow(Double.parseDouble(k10_field[13]) - k10_lat, 2) + // ��Ÿ��� �Ÿ� ����
//					Math.pow(Double.parseDouble(k10_field[14]) - k10_lng, 2));
//			if (k10_dist < k10_minDistance) { // �ִܰŸ�, �ִܰŸ� �ּ�, �ִܰŸ� ����/�浵 ���
//				k10_minDistance = k10_dist;
//				k10_nearPlace = k10_field[9];
//				k10_minLat = k10_field[13];
//				k10_minLng = k10_field[14];
//			}
//			if (k10_dist > k10_maxDistance) { // ����Ÿ�, ����Ÿ� �ּ�, ����Ÿ� ����/�浵 ���
//				k10_maxDistance = k10_dist;
//				k10_farPlace = k10_field[9];
//				k10_maxLat = k10_field[13];
//				k10_maxLng = k10_field[14];
//			}
//
//			k10_LineCnt++; // LineCnt + 1 ����
//		}
//		System.out.printf("���� �Ÿ� : %.6f\n", k10_maxDistance); // ����Ÿ� ���
//		System.out.println("���� �Ÿ� �ּ� : " + k10_farPlace); // ����Ÿ� �ּ� ���
//		System.out.printf("����Ÿ� �ּ� ���� : %.8s\n", k10_maxLat); // ����Ÿ� �ּ� ���� ���
//		System.out.printf("����Ÿ� �ּ� �浵 : %.8s\n", k10_maxLng); // ����Ÿ� �ּ� �浵 ���
//		System.out.printf("\n�ִ� �Ÿ� : %.6f\n", k10_minDistance); // �ִܰŸ� ���
//		System.out.println("�ִ� �Ÿ� �ּ� : " + k10_nearPlace); // �ִܰŸ� �ּ� ���
//		System.out.printf("�ִܰŸ� �ּ� ���� : %.8s\n", k10_minLat); // �ִܰŸ� �ּ� ���� ���
//		System.out.printf("�ִܰŸ� �ּ� �浵 : %.8s\n", k10_minLng); // �ִܰŸ� �ּ� �浵 ���
//
//		k10_br.close(); // close
//	}
}