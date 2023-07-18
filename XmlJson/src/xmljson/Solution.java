package xmljson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		int answer = 0;
		
		String[][] photo = {{"may", "kein", "kain", "radi"},
							{"may", "kein", "brin", "deny"}, 
							{"kon", "kain", "may", "coni"}};
		String[] name = {"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};
		
		List<String[]> list = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		List<Integer> answerList = new ArrayList<>();
		
		// List에 photo 배열 인덱스 순으로 add
		for (int i = 0; i < photo.length; i++) {
			String[] arr = photo[i];
			list.add(arr);
		}
		
		// Map에 name, yearning 인덱스 순으로 put
		for (int i = 0; i < name.length; i++) {
			map.put(name[i], yearning[i]);
		}
		
		
		for (int i = 0; i < list.size(); i++) {
			String[] arr = list.get(i);
			int cnt = 0;
			for(int j = 0; j < arr.length; j++) {
				if(Arrays.toString(arr).contains(arr[j])) {
					answer += map.getOrDefault(arr[j], 0);
				}
			}
			answerList.add(answer);
			answer = 0;
		}
		
		int[] answerArr = answerList.stream().mapToInt(i -> i).toArray();
	}
}
