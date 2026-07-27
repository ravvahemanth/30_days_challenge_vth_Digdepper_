class Solution {
    public int pivotIndex(int[] nums) {
        

        int leftsum=0;
        int rightsum=0;

        int prefixsum[]=new int[nums.length];

        
        prefixsum[0]=nums[0];
        for(int i=1;i<nums.length;i++){

            prefixsum[i]=nums[i]+prefixsum[i-1];

        }

        int totalsum=prefixsum[nums.length-1];


        for(int i=0;i<nums.length;i++){

            leftsum= (i ==0)? 0:prefixsum[i-1];

            rightsum=totalsum-prefixsum[i];

            if(leftsum == rightsum){
                return i;
            }
        }


        return -1;



    }
}