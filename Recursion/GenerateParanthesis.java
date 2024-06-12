//Given an integer A pairs of parentheses, write a function to generate all combinations of well-formed parentheses of length 2*A.

public class Solution {
    ArrayList<String> list=new ArrayList<>();
    public ArrayList<String> generateParenthesis(int A) {
     
int open=A;
int closed=A;
String s="";
generateParenthesis(open,closed,s);
return list;
}
  //creating a recursive function
public void generateParenthesis(int open,int closed,String s){
if(open==0 && closed==0){
list.add(s);
return;
}
if(open>0){
generateParenthesis(open-1,closed,s+"(");
}
if(open<closed){
generateParenthesis(open,closed-1,s+")");
}
}
}
