 Element need to be searched using stack 


import java.util.Scanner;
import java.util.Stack;
class Main{
    public static void main(String[] args) {
        //taking input
        Scanner input= new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("enter no.of.Elements:");
        //using arrays:-
        int n = input.nextInt();
        int[] elements = new int[n];
        //create  for loop to take the input values
        for(int i =0 ; i<n;i++){
            //storing the taken inputs
            elements[i]= input.nextInt();
            //using push operation to insert the elements into the array
            stack.push(elements[i]);
            
            
        }
        System.out.println(stack);
        // search for an element 
        int elementtosearch = input.nextInt();
        int findposition = stack.search(elementtosearch);
    
        System.out.println(findposition);
    }
}


output:-

enter no.of.Elements:
3
10
20
30
[10, 20, 30]
20
2

