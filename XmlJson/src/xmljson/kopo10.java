package xmljson;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class kopo10 {

	public static void main(String[] args) {
		// 1. 순위 구하기
//		Scanner sc = new Scanner(System.in);
//		Set<String> set = new HashSet<>();
//
//		String first = sc.nextLine();
//		String second = sc.nextLine();
//		String third = sc.nextLine();
//		String fourth = sc.nextLine();
//
//		String[] a = first.split(" ");
//		String[] b = second.split(" ");
//		String[] c = third.split(" ");
//		String[] d = fourth.split(" ");
//		
//		for (int i = 0; i < a.length; i++) {
//			set.add(a[i]);
//			set.add(b[i]);
//			set.add(c[i]);
//			set.add(d[i]);
//			
//		}
//		
//		for (int i = 0; i < set.size(); i++) {
//			System.out.println(set.toString());
//		}
		
		// 2. 재귀함수 사용하기(1)
//		System.out.println(recursive(5,4));
		
		// 3. D-Day 계산하기
//		System.out.println(diffOfDate("20230719", "20230719"));
		
		// 4. N진수 활용하기
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		
		String answer1 = Integer.toString(a, b);
		
		int cnt1 = 0;
		for(int i = 0; i < answer1.length(); i++) {
			if(answer1.charAt(i) == '0') {
				cnt1++;
			}
		}
		
		String answer2 = Integer.toString(a, c);
		
		int cnt2 = 0;
		for(int i = 0; i < answer2.length(); i++) {
			if(answer2.charAt(i) == '0') {
				cnt2++;
			}
		}
		
		if (cnt1 > cnt2) {
			System.out.println(b + " > " + c);
		} else if (cnt1 < cnt2 ) {
			System.out.println(b + " < " + c);
		} else {
			System.out.println(b + " = " + c);
		}
		
		// 5. 재귀함수 사용하기
//		six();
	}
	
	public static int recursive(int a, int b) {
		if (b == 0) {
			return 0;
		}
		return a + recursive(a-1, b-1);
	}
	
	public static String diffOfDate (String compareDay, String today) {
		SimpleDateFormat sdt = new SimpleDateFormat("yyyyMMdd");
		long diffDays = 0;
		String answer = "";
		try {
			Date startDay = sdt.parse(compareDay);
			Date endDay = sdt.parse(today);
			
			long diff = endDay.getTime() - startDay.getTime();
			diffDays = diff / (24 * 60 * 60 * 1000);
			if (diffDays > 0) {
				answer = "D+" + Long.toString(diffDays);
			} else if (diffDays < 0) {
				answer = "D" + Long.toString(diffDays);
			} else {
				answer = "D-" + Long.toString(diffDays);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return answer;
	}
	
	public static void six () {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 입력하세요");
		String input = sc.next();
		
		if (input.contains("!")) {
			int recursive = Integer.parseInt(input.replace("!", ""));
			System.out.println(fact(recursive));
		} else if (input.contains("P")) {
			System.out.println(permutaiton(input));
		} else if (input.contains("C")) {
			System.out.println(combination(input));
		}
	}
	
	public static int fact(int n) {
		if (n <= 1)
			return n;
		else 
			return fact(n-1) * n;
	}
	
	public static int permutaiton(String n) {
		String[] permu = n.split("P");
		
		int answer = fact(Integer.parseInt(permu[0])) / fact(Integer.parseInt(permu[0]) - Integer.parseInt(permu[1]));

		return answer;
	}
	
	public static int combination(String n) {
		String[] combi = n.split("C");
		int answer = fact(Integer.parseInt(combi[0])) / (fact(Integer.parseInt(combi[1])) * fact(Integer.parseInt(combi[0]) - Integer.parseInt(combi[1])));
		
		return answer;
	}
}