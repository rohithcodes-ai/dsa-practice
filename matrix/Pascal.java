class Solution {
    public int pascalTriangleI(int r, int c) {
     if(r==0 || r==c)
      return 1;
      else
      return pascalTriangle1(r-1,c)+pascalTriangle1(r-1,c);
    }
     public int[][] generate(int numRows) {
        int[][] triangle = new int[numRows][]; // outer array, each row has different length

        for (int i = 0; i < numRows; i++) {
            triangle[i] = new int[i + 1]; // row i has i+1 elements

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangle[i][j] = 1; // edges are always 1
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
        }
}
