package xmljson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		System.out.println(solution("3x + 7 + x"));
	}
	
	public static String solution(String polynomial) {
		String answer = "";
        int num = 0;
        String[] arr = polynomial.split(" ");
        String[] xArr = new String[arr.length];
        for(int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) {
                if(arr[i].contains("x")) xArr[i] = arr[i];
                else num += Integer.parseInt(arr[i]);
            }
        }
        for(int i = 0; i < arr.length; i++) {
        	System.out.println(arr[i]);
        }
        return answer + num;
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