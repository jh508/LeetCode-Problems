// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] products = new int[nums.length];
        int[] leftArr = new int[nums.length];
        int[] rightArr = new int[nums.length];
        int product = 1;

        for(int i = 0; i < leftArr.length; i++){
            leftArr[i] = product;
            product *= nums[i];
        }
        product = 1;

        for(int i = rightArr.length - 1; i >= 0; i--){
            rightArr[i] = product;
            product *= nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            products[i] = leftArr[i] * rightArr[i];
        }

        return products;
    }
}
