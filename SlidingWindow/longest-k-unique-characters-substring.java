import java.util.*;
class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int low=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        int res=-1;
        for (int high = 0; high < s.length(); high++){
            char ch=s.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()>k){
                char leftChar = s.charAt(low);
                map.put(leftChar,map.get(leftChar)-1);
                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                low++;
            }
            if (map.size() == k) {
                res = Math.max(res, high - low + 1);
            }
        }
        return res;
    }
}
