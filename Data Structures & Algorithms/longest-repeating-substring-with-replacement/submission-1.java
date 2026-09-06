class Solution {
    public int characterReplacement(String s, int k) {
        int start=0;
        int []freq = new int[26];
        int maxFreq=0;
        int maxLength=0;

        for(int end=0;end<s.length();end++){
            freq[s.charAt(end) - 'A']++;
            maxFreq =Math.max(maxFreq,freq[s.charAt(end) - 'A']);

            if(end-start+1-maxFreq > k){
                freq[s.charAt(start) - 'A']--;
                start++;
            }
            maxLength=Math.max(maxLength,end-start+1);
        }
        return maxLength;
    }
}
