Question: 

Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]), return the next greater number for every element in nums.

The next greater number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.

 

Example 1:

Input: nums = [1,2,1]
Output: [2,-1,2]



Solution:


import java.util.Stack;
 class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int res[]= new int[n];
        Stack<Integer> stack = new Stack<>();
        // inistailize the res array
        for(int i=0; i<n;i++){
            res[i]=-1;
        }
        // to travarse the stack twice
        for(int i=0; i<n*2 ;i++){
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i % n]){
                res[stack.pop()] = nums[i%n];
                }
                if(i<n){
                    stack.push(i);
                }
            }
            return res;
        }
        public static void main(String[] args){
            int arr[]= { 1,2,1};
            Solution solution = new Solution();
            int res[]= solution.nextGreaterElements(arr);
            System.out.println(res);
            // for the resultant array 
            for(int num: res){
                System.out.println(num);
            }
            
        
    }
}


output:

Input
nums =
[1,2,1]
Output
[2,-1,2]
