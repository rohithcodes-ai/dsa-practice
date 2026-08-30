import java.util.   ;
public class Arrays1{

static void sortArray(int a[]){

    int i;
    int count[] = new int[3];
    for(i=0;i<a.length;i++){
        count[a[i]]++;
    }
    int index=0;
    for(i=0;i<3;i++){
        
        for(int j=0;j<count[i];j++){
            a[index++]= i;
        }
    }
    System.out.println("Displaying sorted array");
     for(i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
    System.out.println();
    System.out.println("Displaying no of 0 1 2:");
    for(i=0;i<3;i++){

        System.out.print(count[i]+" ");
    }
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