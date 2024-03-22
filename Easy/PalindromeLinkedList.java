/*
Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

Example 1:
Input: head = [1,2,2,1]
Output: true

Example 2:
Input: head = [1,2]
Output: false
*/

public class PalindromeLinkedList {
  public static void main(String[] args) {
    ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
    System.out.println(isPalindrome(head));
  }

  public static class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public static boolean isPalindrome(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    slow = reverse(slow);
    fast = head;
    while (slow != null) {
      if (slow.val != fast.val) {
        return false;
      }
      slow = slow.next;
      fast = fast.next;
    }
    return true;
  }

  public static ListNode reverse(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    while (curr != null) {
      ListNode nextTemp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = nextTemp;
    }
    return prev;
  }
}
