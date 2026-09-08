class Solution {
    public int findDuplicate(int[] nums) {

        // 'slow' starts from the first element of the array.
        // We treat nums[index] as the "next node" in a linked list.
        int slow = nums[0];

        // 'fast' also starts from the first element.
        // It will move twice as fast as 'slow'.
        int fast = nums[0];


        // Start moving slow and fast until they meet.
        do {

            // Slow moves ONE step:
            // Example: if slow = 2, then slow becomes nums[2].
            slow = nums[slow];

            // Fast moves TWO steps:
            // First: nums[fast]
            // Second: nums[nums[fast]]
            fast = nums[nums[fast]];

        } while (slow != fast);
        // Continue until slow and fast point to the same value.
        // This means they have met somewhere inside the cycle.


        // Now reset slow to the starting point.
        // fast remains where the two pointers met.
        slow = nums[0];


        // Move both pointers ONE step at a time.
        while (slow != fast) {

            // Move slow one step forward.
            slow = nums[slow];

            // Move fast one step forward.
            fast = nums[fast];
        }

        // slow and fast meet at the beginning of the cycle.
        // The beginning of the cycle represents the duplicate number.
        return slow;
    }
}
