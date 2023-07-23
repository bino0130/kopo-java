package xmljson;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		
//		String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
//		String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
		
//		System.out.println(solution(babbling));
		
//		String[] babbling = {"aya", "yee", "u", "maa"};
		String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
		
		System.out.println(solutions(babbling));
	}
	
		public static int solution1(String[] babbling) {
			int answer = 0;
				String[] ongal = {"aya", "ye", "woo", "ma"};
		
				for(int i = 0; i < babbling.length; i++) {
					for(int j = 0; j < ongal.length; j++) {
						if(babbling[i].contains(ongal[j]) && !(babbling[i].contains(ongal[j] + ongal[j]))) {
							babbling[i] = babbling[i].replace(ongal[j], " ").trim();
						}
					}
					System.out.println("원소2 : " + babbling[i]);
					if(babbling[i].equals("")) answer++;
				}
					
				return answer;
	   }
	
	    public static int solution(String[] babbling) {
	    	int answer = 0;
	    	int a = 0; int b = 0;
			String[] ongal = {"aya", "ye", "woo", "ma"};

			for(int i = 0; i < babbling.length; i++) {
				for(int j = 0; j < ongal.length; j++) {                
					if(babbling[i].contains(ongal[j])) {
						babbling[i] = babbling[i].replace(ongal[j], "1").trim();
					}
				}
				if(babbling[i].contains("1")) a++; // 1 포함하면 a 증가
				
				// 문자 포함하면 b 증가
				char[] arr = new char[26];
				
				for (int k = 0; k < arr.length; k++) {
					arr[k] = (char)(97 + k);
				}
				
				for (int k = 0; k < arr.length; k++) {
					if(babbling[i].contains(String.valueOf(arr[k]))) {
						b++;
					}
//					System.out.println(arr[k]);
				}
					
				answer = a - b;
				
				System.out.println("원소 : " + babbling[i]);
//				System.out.println("a : " + a);
//				System.out.println("b : " + b);
				if(babbling[i].equals("")) answer++;
			}
			
			return answer;
	    }
	    
	    
	    public static int solutions(String[] babbling) {
	    	int answer = 0;
	    	int a = 0; int b = 0;
			String[] ongal = {"aya", "ye", "woo", "ma"};

			for(int i = 0; i < babbling.length; i++) {
				for(int j = 0; j < ongal.length; j++) {                
					if(babbling[i].contains(ongal[j])) {
						babbling[i] = babbling[i].replace(ongal[j], "1").trim();
					}
				}
				
			}
			
			int cnt = 0;
			System.out.println(Arrays.toString(babbling));
			
			return answer;
	    }
}