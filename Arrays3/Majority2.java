import java.util.*;

public class Majority2 {

    public List<Integer> majorityElementTwo(int[] nums) {

        int cd1=0,cd2=0,count1=0,count2=0;

        
        for(int i=0;i<nums.length;i++){

            if(count1==0 && nums[i]!=cd2){

                count1++;
                cd1 = nums[i];
            }

            else if(count2 == 0 && nums[i]!=cd1){

                count2++;
                cd2 = nums[i];
            }

            else if(cd1 == nums[i])
                count1++;
            else if(cd2 == nums[i])
                count2++;
            else{

                count1--;
                count2--;
            }
           
        }
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == cd1) count1++;
            else if (nums[i] == cd2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        if (count1 > nums.length / 3) result.add(cd1);
        if (count2 > nums.length / 3) result.add(cd2);

        return result;
    }
}