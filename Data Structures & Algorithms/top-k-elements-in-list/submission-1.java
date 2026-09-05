class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> hmap =new HashMap<>();
        PriorityQueue<Integer[]> pq =new PriorityQueue<>((a,b) -> a[1] - b[1]);

        for(int n : nums){
             hmap.put(n,hmap.getOrDefault(n,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : hmap.entrySet()){
            pq.offer(new Integer[] {entry.getKey(),entry.getValue()});
            if(pq.size()>k){
                pq.poll();
            }
        }


        int [] result =new int[k];
        for(int i=0;i<k;i++){
            result[i] =pq.poll()[0];
        }
        return result;

 }
}
