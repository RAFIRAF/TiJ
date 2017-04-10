package holding;

import net.mindview.util.Stack;

/**
 * Created by Rafal on 02017-04-07.
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s:  "My dog has fleas".split(" ") // !
             ) {
            stack.push(s);
        }
        while (!stack.empty())
            System.out.print(stack.pop()+" "); // ! FILO
        System.out.println();
    }
}
