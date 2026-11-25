class Solution {
    public int countSquares(int[][] matrix) {

        int m = matrix.length;//3
        int n = matrix[0].length;//4


        int sum =0;

        for(int i =0;i<m;i++){

            for(int j=0;j<n;j++){

                if(matrix[i][j]==0) continue;

                if(i>0 && j>0){
                    
                    matrix[i][j] = matrix[i][j] +  Math.min(matrix[i][j-1],Math.min(matrix[i-1][j],matrix[i-1][j-1]));
                }
                sum = sum +  matrix[i][j];

 
            }
        }


        return sum;

        
        
    }
}