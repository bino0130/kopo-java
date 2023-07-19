package xmljson;


public class Solution {

	public static void main(String[] args) {
		
		String[] babbling = {"aya", "ye", "woo", "ma"};
		
		solution(babbling);
		
		
	}
	
	    public int solution(String[] babbling) {
	        int answer = 0;
	        String[] ongal = {"aya", "ye", "woo", "ma"};
	        
	        for(int i = 0; i < babbling.length; i++) {
	            for(int j = 0; j < ongal.length; j++) {
	                if(babbling[i].contains(ongal[j])) {
	                    String a = 
	                    if(!())
	                    babbling[i] = babbling[i].replace(ongal[j], "");
	                }
	            }
	            
	            if(babbling[i].equals("")) answer++;
	        }
	        
	        return answer;
	    }
}