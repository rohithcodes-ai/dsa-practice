import java.util.*;
public class Arrays{
    static void sortArray(int a[]){

        int c1=0,c2=0,c3=0;
        int min,temp;
         for(int i=0;i<a.length;i++){
            if(a[i]==0)
                c1++;
            if(a[i]==1)
                c2++;
            if(a[i]==2)
                c3++;
        }
        for(int i=0;i<a.length;i++){
            
            min=i;
           
            for(int j=i+1;j<a.length;j++){
                
                if(a[j]<a[min])
                    min=j;


            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        System.out.println("Printing Sorted Array");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("No of zeros :"+c1);
        System.out.println("No of ones :"+c2);
        System.out.println("No of twos :"+c3);
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n;

        System.out.println("Enter the length of array ");
        n=sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter 0 1 or 2");
        for(int i=0;i<a.length;i++){

            a[i]=sc.nextInt();
        }
        sortArray(a);

    }
}