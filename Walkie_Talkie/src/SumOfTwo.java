import java.util.HashMap;

public class SumOfTwo {

    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int sno = target - nums[i];
            if (map.containsKey(sno)) {
                ans[0] = map.get(sno);
                ans[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        System.out.println(ans[0] + " " + ans[1]);
        return ans;
    }




    public static void main(String[] args) {
        SumOfTwo solution = new SumOfTwo();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        solution.twoSum(nums, target);
    }
}
