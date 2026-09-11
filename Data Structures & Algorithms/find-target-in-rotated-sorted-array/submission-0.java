class Solution {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        // Find pivot
        while (left < right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        int pivotIdx = left;

        // Search left sorted half
        int result = find(nums, 0, pivotIdx - 1, target);

        if (result != -1) {
            return result;
        }

        // Search right sorted half
        return find(nums, pivotIdx, nums.length - 1, target);
    }

    int find(int[] nums, int start, int end, int target) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}