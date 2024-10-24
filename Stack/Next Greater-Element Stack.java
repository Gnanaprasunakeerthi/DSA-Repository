Question: 
Given an array arr[ ] of n elements, the task is to find the next greater element for each element of the array in order of their appearance in the array. Next greater element of an element in the array is the nearest element on the right which is greater than the current element.
If there does not exist next greater of current element, then next greater element for current element is -1. For example, next greater of the last element is always -1.

Examples

Input: arr[] = [1 3 2 4], n = 4
Output: 3 4 4 -1
Explanation: The next larger element to 1 is 3, 3 is 4, 2 is 4 and for 4, since it doesn't exist, it is -1.

Solution:-

class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        long[] res = new long[n];
        Stack<Long> stack = new Stack<>();
        // travese from right to left using loop
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty()  && stack.peek()<=arr[i] ){
                //poping()the elemths until we find the greater
                stack.pop();
            }
            // if the stack is empty then there is no grater elemnet then the current element
            if(stack.isEmpty()){
                res[i]=-1;
            }else{
                // if stack is not empty then the top element is the next greater
                res[i]=stack.peek();
            }
            //push into the stack
            stack.push(arr[i]);
        }
        return res;
    } 
    public static void main(String[] args){
        long[] arr ={1,3,2,4};
        int n= arr.length;
        long[] res = nextLargerElement(arr,n);
        System.out.println(res);
        
    }
}


Output:-
For Input: 
4
1 3 2 4
Your Output: 
3 4 4 -1



