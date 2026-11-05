import java.util.Stack;

public class Stackprint {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Aryan");
        stack.push("Damn");
        stack.push("Java");

        

        stack.add(0, "Bottom");

        System.out.println(stack);
    }
} 

// //class Solution {
//     public static void reverseStack(Stack<Integer> st) {
//         // code here
//         Stack<Integer> temp = new Stack<>();

//         while (!st.isEmpty()) {
//             temp.push(st.pop());
//         }

//         while (!temp.isEmpty()) {
//             st.add(0, temp.pop());
//         }
//     }
// }
        