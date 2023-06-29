//stack implementation using collection

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Stack<Integer> n=new Stack<>();
		n.push(10);
		n.push(20);
		n.push(30);
		while(!n.isEmpty()){
		    System.out.print(n.peek()+" ");
		    n.pop();
		}
	}
}

//insert at top
import java.util.*;

public class Main {
    public static void insertatbottom(Stack<Integer> n, int data) {
        if (n.isEmpty()) {
            n.push(data);
            return;
        }
        int top = n.pop();
        insertatbottom(n, data);
        n.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> n = new Stack<>();
        n.push(10);
        n.push(20);

        n.push(30);

        insertatbottom(n, 9);
        while (!n.isEmpty()) {
            System.out.print(n.peek() + " ");
            n.pop();
        }
    }
}

//string reverse in stack
import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

public class Main {
    public static String reversestring(String s) {
        Stack<Character> c = new Stack<>();
        int idx = 0;
        while (idx < s.length()) {
            c.push(s.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while (!c.isEmpty()) {
            char curr = c.pop();
            result.append(curr);

        }
        return result.toString();

    }

    public static void main(String[] args) {
        String s = "madhan";

        System.out.println(reversestring(s));
    }
}
//reverse a string 


import java.util.*;

public class Main {
    public static void insertatbottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        insertatbottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        insertatbottom(s, top);
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.print(" " + s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);

        s.push(30);

        reverseStack(s);
        printStack(s);
    }
}