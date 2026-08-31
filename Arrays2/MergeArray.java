public class MergeArray{

    public void merge(int[] nums1,int m,int[] nums2,int n){

        if(m<=0 || n<=0 || m>=1000 || n>=1000 )
            return;

        if(nums1.length!=(m+n) || nums2.length!=n)
            return;

        int i= m-1;
        int j=n-1;
        int k= m+ n-1;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j])
                nums1[k--]=nums1[i--];
            else
                nums1[k--]=nums2[j--];
        }
        


        
    }
}