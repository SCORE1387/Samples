package tk.sekol.samples.collections.stack;

/**
 * @author kolesnikov
 */
public class ArrayStackMain {

    public static void main(String[] agrs) {

        Stack<String> stack = new ArrayStack<>();
        System.out.println(stack.pop() + " (null)");
        System.out.println(stack.top() + " (null)");

        System.out.println(stack.push("1") + " (true)");
        System.out.println(stack.top() + " (1)");
        System.out.println(stack.size() + " (1)");

        System.out.println(stack.push("2") + " (true)");
        System.out.println(stack.top() + " (2)");
        System.out.println(stack.size() + " (2)");

        System.out.println(stack.push("3") + " (true)");
        System.out.println(stack.top() + " (3)");
        System.out.println(stack.size() + " (3)");

        System.out.println(stack.push("4") + " (true)");
        System.out.println(stack.top() + " (4)");
        System.out.println(stack.size() + " (4)");

        System.out.println(stack.push("5") + " (true)");
        System.out.println(stack.top() + " (5)");
        System.out.println(stack.size() + " (5)");

        System.out.println(stack.push("6") + " (false)");
        System.out.println(stack.top() + " (5)");
        System.out.println(stack.size() + " (5)");

        System.out.println(stack.pop() + " (5)");
        System.out.println(stack.pop() + " (4)");
        System.out.println(stack.pop() + " (3)");
        System.out.println(stack.pop() + " (2)");
        System.out.println(stack.pop() + " (1)");
        System.out.println(stack.pop() + " (null)");

    }

}
