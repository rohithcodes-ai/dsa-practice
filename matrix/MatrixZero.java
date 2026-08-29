class Solution {
	public void setZeroes(int[][] matrix) {

		int r=matrix.length;
		int c=matrix[0].length;
		boolean a[]=new boolean[r];
		boolean b[]=new boolean[c];
		int l,m;
		for( l=0;l<r;l++){

			for( m=0;m<c;m++){
				if(matrix[l][m]==0){
					a[l]=true;
					b[m]=true;
				}
			}
		}
		for( l=0;l<r;l++){
			for( m=0;m<c;m++){
				if(a[l]||b[m])
					matrix[l][m]=0;
			}
		}
	}
}


