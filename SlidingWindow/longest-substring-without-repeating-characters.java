class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0;
        int res=-999999;
        HashMap<Character, Integer> map=new HashMap<>();
        for(int high=0;high<s.length();high++){
            map.put(s.charAt(high),map.getOrDefault(s.charAt(high),0)+1);
            while(map.get(s.charAt(high))>1){
                map.put(s.charAt(low),map.get(s.charAt(low))-1);
                low++;
            }
            res=Math.max(res,high-low+1);
        }
        if(s.length()==0){
            return 0;
        }
        return res;
    }
}
