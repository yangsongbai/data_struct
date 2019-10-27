package example;

/** 203号题目 leetCode */
public class Solution {
  public ListNode removeElements(ListNode head, int val) {
    while (head != null && head.val == val) {}
    if (head == null) return null;
    return null;
  }

  class ListNode {
    int val;
    ListNode next;
  }
}
