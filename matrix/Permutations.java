import java.util.*;
public class Permutations{


		static void printArray(int arr[]){

			for(int i=0;i<arr.length;i++){

                  		System.out.print(arr[i]+" ");
			}
			System.out.println();
		}

		static void swap(int arr[],int i,int j){

			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;

		}

		static void reverseArray(int arr[],int start,int end){

			while(start<end){

				swap(arr,start,end);
				start++;
				end--;

			}
		}

		static boolean nextPermutation(int arr[]){

			int n=arr.length;
                        int i=n-2;
			while(i>=0 && arr[i]>arr[i+1])
				i--;
			
			if(i<0)
				return false;
			int j=n-1;
			while(j>i && arr[j]<arr[i])
				j--;



			swap(arr,i,j);
                        reverseArray(arr,i+1,n-1);

			return true;
		}

		public static void main(String[] args){

			Scanner sc=new Scanner(System.in);
			int n;
			int arr[];
			System.out.println("Enter the number of elements\n");
			n=sc.nextInt();
			System.out.println("Enter the elements\n");
			arr=new int[n];
			for(int i=0;i<n;i++){

				arr[i]=sc.nextInt();
			}

			java.util.Arrays.sort(arr);

			while(true){

				printArray(arr);
				boolean b= nextPermutation(arr);
				if(!b)
					break;
			}

		}

	}



