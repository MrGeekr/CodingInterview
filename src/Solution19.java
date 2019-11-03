import base.ListNode;

/**
 * Created by MrGeekr.
 * Date : 2019/10/4.
 * Description :反转链表
 * 题目描述
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class Solution19 {
    public ListNode ReverseList(ListNode head) {
        ListNode reverseHead=null;
        ListNode cur=head;
        ListNode next=null;
        ListNode pre=null;
        while (cur!=null){
            next=cur.next;
            if (next==null){
                reverseHead=cur;
            }
            cur.next=pre;
            pre=cur;
            cur=next;

        }
        return reverseHead;
    }
}
