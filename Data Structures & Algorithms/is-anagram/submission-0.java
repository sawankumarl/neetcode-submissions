class Solution {
    public boolean isAnagram(String s, String t) {

    int freq1[] =new int[26];
    int freq2[] =new int[26];

    if(s.length() != t.length()){
        return false;
    }
    
     for(char ch : s.toCharArray()){
        freq1[ch - 'a']++;
     }
     for(char ch : t.toCharArray()){
        freq2[ch - 'a']++;
     }

     if(Arrays.equals(freq1,freq2)) {
        return true;
     }

      return false;
}
}
