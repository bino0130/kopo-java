package kr.ac.kopo.ctc.kopo10.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.kopo10.domain.WifiItem;

public class WifiItemDao {
	public WifiItem create(WifiItem wifiItem) { // CRUD �� C
		return null;
	}

	// read
	public WifiItem selectOne(int id) { // CRUD �� R
		return null;
	}

	public List<WifiItem> selectAll() { // CRUD �� R
		File k10_f = new File("C:\\Users\\Bino\\Desktop\\PublicWifi.txt"); // ����ȭ���� �ؽ�Ʈ���� PublicWifi�� ��η��ϴ� ���� ��ü f ����
		BufferedReader k10_br = null; // BufferedReader ��ü br null�� ����
		try { // try catch
			k10_br = new BufferedReader(new FileReader(k10_f)); // br�� BufferedReader(new FileReader(f))�� �ʱ�ȭ
		} catch (FileNotFoundException e) { // FileNotFoundException �߻���
			e.printStackTrace(); // printStackTrace ȣ��
		}
		List<WifiItem> k10_data = new ArrayList<WifiItem>(); // WifiItem�� ������Ÿ������ �ϴ� List data ����

		String k10_readtxt = null; // String Ÿ�� readtxt ����

		try { // try catch
			if ((k10_readtxt = k10_br.readLine()) == null) { // br���� �ش� line�� read�� ���� null�̸�
				System.out.printf("�� �����Դϴ�\n"); // �� �����Դϴ� ���
				return null; // ����
			}
		} catch (IOException e) { // FileNotFoundException �߻���
			e.printStackTrace(); // printStackTrace ȣ��
		}

		try { // try catch
			while ((k10_readtxt = k10_br.readLine()) != null) { // br���� �ش� line�� read�� ���� null�� �ƴϸ�
				String[] k10_field = k10_readtxt.split("\t"); // readtxt�� \t�� �������� ���� StringŸ�� �迭 field ����
				// WifiItem ������ Ÿ���� ��ü wi ���� �� field[]�� ��� �� ���θ��ּ�, ����, �浵 parameter�� �־���
				WifiItem k10_wi = new WifiItem(k10_field[9], Double.parseDouble(k10_field[13]),
						Double.parseDouble(k10_field[14]));
				k10_data.add(k10_wi); // data�� wi�� add
			}
		} catch (NumberFormatException | IOException e) { // FileNotFoundException �Ǵ� IOException �߻���
			e.printStackTrace(); // printStackTrace ȣ��
		}

		try { // try catch
			k10_br.close(); // close
		} catch (IOException e) { // IOException �߻� ��
			e.printStackTrace(); // printStackTrace ȣ��
		}
		return k10_data; // data ����
	}

	// ex) 4�� ������������ 3������ �����ߴ�.
	public WifiItem update(int id, WifiItem wifiItem) { // CRUD �� U
		return null;
	}

	public WifiItem delete(int id) { // CRUD �� D
		return null;
	}
}