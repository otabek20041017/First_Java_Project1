public class exercise {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 456, 653, 34};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.println("even: " + nums[i]);
            } else {
                System.out.println("odd: " + nums[i]);
            }

        }

        for (int each : nums) {
            if (each % 2 == 0) {
                System.out.println("even" + each);
            } else {
                System.out.println("odd" + each);
            }
        }
    }
}
