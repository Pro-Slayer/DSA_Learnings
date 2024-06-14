// Given 2 non-negative integers A and B, find gcd(A, B)
// GCD of 2 integers A and B is defined as the greatest integer 'g' such that 'g' is a divisor of both A and B. Both A and B fit in a 32 bit signed integer.
// Note: DO NOT USE LIBRARY FUNCTIONS.
//Solution:
public class Solution {
    public int gcd(int A, int B) {
      //Long division method, when the remainder is 0, the corresponding divsor will be the GCD.
      //Till the remainder is zero, the remainder will become the divisor and the previous divisor will become the divident.
        if(B ==0){
            return A;
        }
        return gcd(B,A%B);
    }
}                                                                           
//Dry Run                                                            |      21)23(1
//Consider GCD(21,23) ==> A = 21,B=23 ==>B != 0 ==> return GCD(23,21)|         21
//recursion ==> A=23,B=21 ==> B != 0 ==> return GCD(21,2)            |         2)21(10     
//recursion ==> A = 21,B=2 ==> B != 0 ==> return GCD(2,1)            |           20     
//recursion ==> A=2,B=1 ==> B != 0 ==> return GCD(1,0)               |            1)2(2    ==>Corresponding Divisor = GCD
//recursion ==> A=1,B=0 ==> B == 0 ==> return A ==> 1 GCD(21,23)     |              2
//                                                                                  0 ==> remainder == 0;
