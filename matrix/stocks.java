
import java.util.Scanner;

class stocks {
    public static int stockBuySell(int[] arr, int n) {
       
        int i,j,min,max,currprofit;
        i=0;
        min=arr[i];
        max = 0;
        for(i=1;  i<n; i++){

            currprofit = arr[i] - min;
            if(currprofit > max)
                max = currprofit;

            if(arr[i]< min)
                min = arr[i];
        }
        /* if(max ==0)
            System.out.println("NO profit");
        else{
            System.out.println("Buy on "+ (i-1) +"th day"+" and Sell on "+(j+1)+"th day");
            System.out.println("The profit is "+profit);
        }*/
       return max;

        }
    
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            int n;
            int a[];
            System.out.println("Enter the length of array ");
            n=sc.nextInt();
            a = new int[n];
            System.out.println("Enter array elements");
            for(int i=0;i<a.length;i++){

                 a[i]=sc.nextInt();
            }
            int profit = stockBuySell(a,n);
            System.out.println("Max profit: "+ profit);

        }
    }
