class Solution {
    public int search(int[] nums, int target) {
        // 목표 시간 복잡도 : O(log n)
        // 이진 탐색 => 중앙값 기준으로 좌/우
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;

            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
