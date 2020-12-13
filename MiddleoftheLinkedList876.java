package leetcode;

public class MiddleoftheLinkedList876 {

    public ListNode insertNodeAtTail(ListNode head, int data) {
        ListNode node = new ListNode(data);
        if (head == null) {
            head = node;
            return head;
        } else {
            ListNode temp = head;
            ListNode ult = new ListNode(data);
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = ult;
            head = temp;
            return head;
        }

    }

    public ListNode middleNode(ListNode head) {
        ListNode lResult = null;
        ListNode lTemporal = head;
        int iCont = 0;
        while (head != null) {
            iCont++;
            head = head.next;
        }
        if (iCont % 2 == 0) {
            iCont = (iCont / 2) + 1;
        } else {
            iCont = (iCont / 2) + 1;
        }
        System.out.println(iCont);
        int i = 0;
        while (lTemporal != null) {
            i++;
            if (i == iCont) {
                lResult = new ListNode(lTemporal.val);

            } else if (i > iCont) {
                insertNodeAtTail(lResult, lTemporal.val);
            }

            lTemporal = lTemporal.next;
        }
        return lResult;
    }
    
}
