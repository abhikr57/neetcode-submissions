class Solution {
    public int diagonalSum(int[][] mat) {
        
        int n=mat.length;
        int sum=0;
        for(int i=0;i<n;i++){
         sum=sum+mat[i][i];
        }
        int j=n-1;
        for(int i=0;i<n && j>=0;i++){
            if(i!=j){
            sum=sum+mat[i][j];
            }
            j--;
            
               
        }
        
        return sum;


    }
}