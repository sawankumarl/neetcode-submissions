class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> hmap =new HashMap<>();
			   List<String> alist =new ArrayList<>();
			
			   for(String s : strs){
				   int freq[] = new int[26];
			       for( char ch : s.toCharArray())
			       {
			        freq[ch - 'a']++;
			       }
			
			      String key = Arrays.toString(freq);
			      if(hmap.containsKey(key)){
			    	  hmap.get(key).add(s);
			      }else{
			         hmap.put(key,new ArrayList<>());
			         hmap.get(key).add(s);
			      }
			   }
			   return new ArrayList<>(hmap.values());       
    }
}
