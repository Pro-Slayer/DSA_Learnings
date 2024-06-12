//Problem Description
//Given a set of distinct integers A, return all possible subsets that can be formed from the elements of array A.

//Input Format
//First and only argument of input contains a single integer array A.
//Output Format
//Return a vector of vectors denoting the answer in any order.

//Solution

class Solution {
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        // code here
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    backtrack(0, A, new ArrayList<>(), result);
    return result;

}
//creating function
    public static void backtrack(int index, ArrayList<Integer> A,
    ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> res)
{
    if(index == A.size()){
    res.add(new ArrayList<Integer>(temp));//
    return;
}

    temp.add(A.get(index));
    backtrack(index+1, A, temp, res);
    temp.remove(temp.size()-1);
    backtrack(index+1, A, temp, res);
}
}
