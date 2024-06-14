// Problem Description
// Given an array of integers A and an integer B, find and return the number of pairs in A whose sum is divisible by B.
// Since the answer may be large, return the answer modulo (109 + 7).
// Note: Ensure to handle integer overflow when performing the calculations.

//Solution:
public class Solution {
    public int solve(int[] A, int B) {
        int N = A.length;
      //divisors will always be in the range of (0 - B-1), Hence creating a Frequency array of size  [B],(i-e) B = [0,1,2] if B=3;
        int [] freq = new int [B];
        int count=0;
        int pair;

        for(int i=0;i<N;i++){
            int rem = A[i]%B;
            //0 can pair only with 0
            if(rem == 0){
                pair =0;
            }
            //B-rem will always be a pair
            else pair = B-rem;
            //count is taken based on frequency array
            count+= freq[pair];
            //frequency array is updated
            freq[rem]++;
        }
        
        return (count)%1000000007;
        
    }
    
}

