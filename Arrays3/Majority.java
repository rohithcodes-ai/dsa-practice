public class Majority{

    public int majorityElement(int[] nums){

        int n = nums.length;
         for(int i=0;i<nums.length;i++)
            if(freq(nums[i],nums)>n/2)
                return nums[i];

         return 0;
    }

    public int freq(int n,int[] nums){

        int c = 0;
        for(int i=0;i<nums.length;i++)
            if(nums[i]==n)
                c++;

        return c;
    }

    public int majorityElement2(int[] nums){

        int cd=0,count = 0;
        for(int i=0;i<nums.length;i++){

            if(count == 0)
                cd = nums[i];

            if(cd == nums[i])
                count++;
            else
                count--;
        }

        return cd;
    }
}

