class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hmap =new HashMap<>();
        int  length=0;
        int start=0;
     
        int maxLength=0;
        HashSet<Character> hset =new HashSet<>();

        for(int end=0;end<s.length();end++){
            while(hset.contains(s.charAt(end))){
                hset.remove(s.charAt(start));
                start++;
            }
            hset.add(s.charAt(end));
            maxLength =Math.max(maxLength,end-start+1);
        }
        return maxLength;
    }
}
