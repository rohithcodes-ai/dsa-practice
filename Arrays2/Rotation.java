
import java.util.Scanner;

public class Rotation {

     static void printMatrix(int arr[][]){

        for(int i=0;i<arr.length; i++){

            for(int j=0;j<arr[0].length; j++){

                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
     }

     static void rotateArray(int a[][]) {

        int n = a.length;
        int w=a[0].length;

    // Step 1: Transpose the matrix (swap a[i][j] with a[j][i])
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < w; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
             }
        }

    // Step 2: Reverse each row
        for (int i = 0; i < w; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = a[i][left];
                a[i][left] = a[i][right];
                a[i][right] = temp;
                left++;
                right--;
            }
        }

        System.out.println("Printing rotated Matrix");
        printMatrix(a);
    }


    static void rotateArray1(int a[][]){

        int r = a.length;
        int c = a[0].length;
        int i,j;
        int b[][]=new int [r][c];
        for(i =0; i< r; i++){

            for(j=0; j<c; j++){

                b[i][j]=a[c-1-j][i];
            }
        }
        System.out.println("Printing rotated Matrix");
        printMatrix(b);
    }

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int  r , c;
        int arr[][];
        System.out.println("Enter no of rows and coloumns");
        r=sc.nextInt();
        c=sc.nextInt();
        arr=new int[r][c];
        System.out.println("Enter array Eements");
        for(int i=0;i<r; i++){

            for(int j=0;j<c;j++){

                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Printing Original Matrix");
        printMatrix(arr);
        rotateArray(arr);
        rotateArray1(arr);//another method in place roation
        


    }
}
