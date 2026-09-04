public class Searching {

    public boolean searchMatrix(int[][] mat,int target){

        int r = mat.length;
        int c = mat[0].length;
        int i=0;

        while(i<r){

            if(target >= mat[i][0] && target <= mat[i][c-1]){

                for(int j =0;j<c;j++){

                    if(target == mat[i][j])
                        return true;
                }
            }

            else
                i++;
        }

        return false;
    }
}

//optimal code
//2D ARRAY considerd as 1d ARRAY using binary search

class Searching1 {

    public boolean searchMatrix(int[][] mat, int target) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return false;
        }

        int rows = mat.length;
        int cols = mat[0].length;

        int low = 0;
        int high = (rows * cols) - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Map 1D index back to 2D indices
            int midValue = mat[mid / cols][mid % cols];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}