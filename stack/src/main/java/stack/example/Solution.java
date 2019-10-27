package stack.example;

import stack.ArrayStack;
import stack.Stack;

public class Solution {
  public static boolean isValid(String s) {
    Stack<Character> stack = new ArrayStack<>();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (ch == '(' || ch == '[' || ch == '{') {
        stack.push(ch);
      } else {
        if (stack.isEmpty()) return false;
        char top = stack.pop();
        if (ch == ')' && top != '(') return false;
        if (ch == ']' && top != '[') return false;
        if (ch == '}' && top != '{') return false;
      }
    }
    if (!stack.isEmpty()) return false;
    return true;
  }

  public static void main(String[] args) {
    String s = "{}{}{}";
    System.out.println(isValid(s));
  }
}
