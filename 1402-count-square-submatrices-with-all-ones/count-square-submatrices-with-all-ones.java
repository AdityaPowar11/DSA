class Solution {
    public int countSquares(int[][] matrix) {

        for(int i =0;i<matrix.length;i++){

            for(int j=0;j< matrix[0].length;j++){

                if(matrix[i][j]==0){
                    continue;
                }

                else{

                    int up;
                    int left;
                    int diagonal;

                    if(i-1<0) up = 0;
                    else up = matrix[i-1][j];

                    if(j-1<0) left = 0;
                    else left = matrix[i][j-1];

                    if(i-1<0 || j-1<0) diagonal = 0;
                    else diagonal = matrix[i-1][j-1];

                    matrix[i][j] =  1+ Math.min(up,Math.min(left,diagonal));

                }   
            }
        }

        int sum =0;
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                sum+=matrix[i][j];
            }
        }

        return sum;
        
    }
}