class Solution {
    public int[] twoSum(int[] nums, int target) {
                 // 조합 찾기.
        // nums 배열 내 값 중 "+" 연산을 했을 때 target이 되도록 한다.
        /*
         * 생각 :
         * 주어지는 n의 개수가 10,000,000이다.
         * O(n^2) => 조 단위 나옴
         * O(n log n) => 2억 5~6천
         * O(n) => 천만
         * 1초에 10^8 연산이므로, O(n)까지는 줄여봐야한다.
         * 
         * 미리 변수에 값을 저장을 한다면, n^2이 아니더라도 n에 충분히 가능할 것이다.
         * 어떤 값을 저장하느냐? => nums[i] + nums[j] = target인데, nums[i] 또는 nums[j]만 저장하면 된다.
         * target - nums[j] = nums[i]로 찾아갈 수 있기 때문에
         * nums[i]만 저장 공간에 넣어두면 될 것이다.
         * 그럼 저장 공간에 특정 값 접근이 가장 빠른 건 hashtable이다. 배열은 O(n)이나 걸리므로 O(1)인 게 더 좋으니
         * hashmap으로 미리 nums[i] 값들을 싹 넣어두고, target - nums[j] 를 했을 때 nums[j]만 순회하면 될 것
         * 같다.
         */

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }

        int tmp2 = 0;
        for (int i = 0; i < nums.length; i++) {
            int tmp = target - nums[i];
            if (hashMap.containsKey(tmp)) {
                if (i == hashMap.get(tmp))
                    continue; // 같은 인덱스 (같은 값)끼리 비교는 X
                return new int[] { i, hashMap.get(tmp) };
            }
        }
        return new int[] { 0 };
    }
}
