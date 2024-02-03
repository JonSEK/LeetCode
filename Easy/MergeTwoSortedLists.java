/*
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.

Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]
*/

public class MergeTwoSortedLists {
  public class ListNode {
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

  public static void main(String[] args) {
    MergeTwoSortedLists test = new MergeTwoSortedLists();
    ListNode list1 = test.new ListNode(1, test.new ListNode(2, test.new ListNode(4)));
    ListNode list2 = test.new ListNode(1, test.new ListNode(3, test.new ListNode(4)));
    ListNode result = test.mergeTwoLists(list1, list2);
    while (result != null) {
      System.out.print(result.val + " ");
      result = result.next;
    }
  }

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummy = new ListNode(-1);
    ListNode head = dummy;
    while (list1 != null && list2 != null) {
      if (list1.val < list2.val) {
        head.next = list1;
        list1 = list1.next;
      } else {
        head.next = list2;
        list2 = list2.next;
      }
      head = head.next;
    }
    head.next = list1 != null ? list1 : list2;
    return dummy.next;
  }
}
