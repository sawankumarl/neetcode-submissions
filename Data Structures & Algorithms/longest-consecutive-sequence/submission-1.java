class Solution {
    public int longestConsecutive(int[] nums) {
         int longestlength = 0;
        HashMap<Integer,Boolean> hmap = new HashMap<>();

        for(int n : nums){
            hmap.put(n,Boolean.FALSE);
        }

        for (int n : nums){
            int next=n+1;
            int currlength=1;
                while(hmap.containsKey(next) && hmap.get(next)== Boolean.FALSE){
                currlength++;
                hmap.put(next,Boolean.TRUE);
                next++;
                }
        
                int prev=n-1;
                while(hmap.containsKey(prev) && hmap.get(prev)== Boolean.FALSE){
                currlength++;
                hmap.put(next,Boolean.TRUE);
                prev--;
                }
            longestlength=Math.max(longestlength,currlength);
        }
        return  longestlength;
    }
}
