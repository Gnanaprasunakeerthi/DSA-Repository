Reverse a string using Stack
You are given a string S, the task is to reverse the string using stack.

Solution;-
class Solution {
    
    public String reverse(String S){
        //code here
        Stack<Character> stack = new Stack<>();
        for(char c : S.toCharArray()){
            stack.push(c);
        }
        StringBuilder reversed = new StringBuilder ();
        while(!stack.isEmpty()){
            reversed.append(stack.pop());
        }
        return reversed.toString();
        
    }
    public static void main(String[] args){
        String s = "GeeksforGeeks";
        Solution solution = new Solution();
        System.out.println(solution.reverse(s));
    }

} 

output : 
For Input: 
GeeksforGeeks
Your Output: 
skeeGrofskeeG


