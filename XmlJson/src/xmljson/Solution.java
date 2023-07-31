package xmljson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		
		System.out.println(solution(2500, 2500, 1));
	}
	
	public static long solution(int price, long money, int count) {
        long a = 0;
        for(int i = 1; i <= count; i++) {
            a += price * i;
        }
        return a - money;
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