class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
       
        ArrayList<List<Integer>> alist = new ArrayList<>();
        
        for(int i=0;i<nums.length-2;i++){

            //dulpicate check and i >0 
            if( i>0 && nums[i] == nums[i-1]) continue;

            //if nums[i] 5 > 0
            if(nums[i] >0) break;

            int left =i+1;
            int right =nums.length-1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum>0){
                    right--;
                }else if(sum<0){
                    left++;
                }else 
                {
                        alist.add(Arrays.asList(
                            nums[i],
                            nums[left],
                            nums[right]
                        ));

                        // Move both pointers
                        left++;
                        right--;
                        
                       // Skip duplicate left values
                        while(left< right && nums[left] == nums[left-1]){
                            left++;
                        }
                        // Skip duplicate left values
                        while(left< right && nums[right] == nums[right+1]){
                            right--;
                        }
                }
          }
        }
        return alist;
    }
}
