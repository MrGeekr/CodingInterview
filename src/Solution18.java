import base.ListNode;

/**
 * Created by MrGeekr.
 * Date : 2019/10/4.
 * Description :链表中倒数第k个结点
 * 题目描述
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class Solution18 {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head==null||k<=0){
            return null;
        }
        //创建一个指针，先走k-1步
        ListNode pre=head;
        for (int i = 1; i <k ; i++) {
            if (pre.next!=null){
                pre=pre.next;
            }else {
                return null;
            }
        }
        ListNode result=head;
        while (pre.next!=null){
            pre=pre.next;
            result=result.next;
        }
        return result;
    }
}
