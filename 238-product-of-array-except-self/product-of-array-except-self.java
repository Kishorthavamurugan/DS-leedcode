class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leftproduct[]=new int[nums.length];
        int rightproduct[]=new int[nums.length];
        int temp = 1;
        for(int i=0;i<nums.length;i++){
            leftproduct[i]=temp;
            temp= temp*nums[i];
        }
        temp=1;
        for (int i=nums.length-1;i>=0;i--){
            rightproduct[i]=temp;
            temp*=nums[i];
        }
        int result[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i]=rightproduct[i]*leftproduct[i];
        }
        return result;

    }
}