package holding;

/**
 * Created by Rafal on 02017-04-07.
 */
import net.mindview.util.*;
public class StackCollision {
    public static void main(String[] args) {
        net.mindview.util.Stack<String> stack =  new net.mindview.util.Stack<>();
        for (String s:"My dog has fleas".split(" ")
             ) {
            stack.push(s);
        }
        while (!stack.empty())
            System.out.print(stack.pop()+" ");
        System.out.println();
        java.util.Stack<String> stack1 = new java.util.Stack<>();
        for (String s:"My dog has fleas".split(" ")
             ) {
            stack1.push(s);
        }
        while (!stack1.empty())
            System.out.print(stack1.pop()+" ");
    }
}
