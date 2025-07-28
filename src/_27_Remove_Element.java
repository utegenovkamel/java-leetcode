import java.util.HashMap;

public class _27_Remove_Element {

//    Input: nums = [0,1,2,2,3,0,4,2], val = 2
//    Output: 5, nums = [0,1,4,0,3,_,_,_]

    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void test() {
        _27_Remove_Element solution = new _27_Remove_Element();

        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        int k = solution.removeElement(nums, val);

        System.out.println("k = " + k);
        System.out.print("nums after removal: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
