

    public static int singleNumber(int[] nums) {

        int ans = 0;

        for(int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 4, 3, 1, 4};

        int result = singleNumber(nums);

        System.out.println("Single Number: " + result);
    }

