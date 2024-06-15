// Write a program to print the pascal triangle up to A rows.
// Input 2:
// A = 5
// Output 2:
// 1 0 0 0 0
// 1 1 0 0 0
// 1 2 1 0 0
// 1 3 3 1 0
// 1 4 6 4 1
//Solution:
public class Solution {
    public int[][] solve(int A) {
        int ncr[][] = new int [A][A];
        for(int i=0;i<A;i++){
            for(int j=0;j<=i;j++){
                if((i==j)||(j==0)){
                    ncr[i][j] = 1;
                }
                else{
                    ncr[i][j] = ncr[i-1][j]+ncr[i-1][j-1];
                }
            }
        }
        return ncr;
    }
}
