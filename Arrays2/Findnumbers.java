public class Findnumbers{

    public void findMissingRepeatingNumbers(int nums[]){

        int sum1=0,sum2=0,sum3=0,sum4=0;
        int diff,diff2,diff3,miss,repeat;
        int n = nums.length;
        
        for(int i =1 ;i<=n;i++){

            sum1+=i;
            sum3+= i*i;

        }
        for(int num:nums){

            sum2+=num;
            sum4+=num*num;
        }
        diff = sum1-sum2;
        diff2= sum3-sum4;
        diff3= diff2/diff;
        miss= (diff + diff3)/2;
        repeat = diff3 - miss;

        System.out.println("Missing number "+ miss);
        System.out.println("Repeated number "+ repeat);

    }
}