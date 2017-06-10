package com.company;

/**
 * Created by ridita on 6/10/17.
 */
public class Array123 {
    public boolean array123(int[] nums) {
        if (nums.length >= 3) {

            for (int i = 0; i < nums.length - 2; i++) {
                if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                    return true;
                }
            }
        } else {
            return false;
        }

        return false;

    }
}