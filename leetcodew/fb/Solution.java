import java.util.*;
class Solution {

    public static void main(String [] args){
        String s = "c";

         System.out.println(s.trim().isEmpty());
        int result = lengthOfLongestSubstring(s);
        System.out.println(result);

    }
    public static int lengthOfLongestSubstring(String s) {

        List<String> result = new ArrayList<String>();
        
        String [] map = s.split("");
        String tempStr = "";
        
        for(int i = 0; i < map.length; i++){
            String tempChar = map[i];
            System.out.println(tempChar);

            
            if(tempStr.contains(tempChar)){
                result.add(tempStr);
                tempStr = tempChar;
            }else{
                
                tempStr = tempStr + tempChar;
            }
        }
        
        int high = 0;
        
        for(String x : result){
            
            if(x.length() > high){
                high = x.length();
            }
        }
        
        return high;
    }
}