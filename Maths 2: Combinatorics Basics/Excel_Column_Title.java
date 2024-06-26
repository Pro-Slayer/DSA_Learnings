// Problem Description
// Given a positive integer A, return its corresponding column title as it appears in an Excel sheet.
// For example:
//     1 -> A
//     2 -> B
//     3 -> C
//     ...
//     26 -> Z
//     27 -> AA
//     28 -> AB 
//Solution:
public class Solution {
    public String convertToTitle(int A) {
        String ans = "";
        while(A >0){
//A->Z prints 1->26. After that it will be AA,AB.           
            ans =((char)(((A-1)%26) +'A'))+ans;
            A = (A-1)/26;
        }
        return ans;
    }
}
