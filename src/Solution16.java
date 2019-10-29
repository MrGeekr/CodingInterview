import base.ListNode;

/**
 * Created by MrGeekr.
 * Date : 2019/10/4.
 * Description :在 O(1) 时间内删除链表节点
 * 如果该节点不是尾节点，那么可以直接将下一个节点的值赋给该节点，然后令该
 * 节点指向下下个节点，再删除下一个节点，时间复杂度为 O(1)。
 *     否则，就需要先遍历链表，找到节点的前一个节点，然后让前一个节点指向
 * null，时间复杂度为 O(N)。
 */
public class Solution16 {

    public ListNode deleteNode(ListNode head, ListNode tobeDelete){
        if (head==null||tobeDelete==null){
            throw new RuntimeException("参数不合法");
        }
        //要删除的不是尾结点
        if (tobeDelete.next!=null){
            tobeDelete.val=tobeDelete.next.val;
            tobeDelete.next=tobeDelete.next.next;
        }//链表只有一个结点，它既是头结点也是尾结点
            else if (head==tobeDelete){
                tobeDelete=null;
                head=null;
        }//删除尾结点
            else {
            ListNode temp=head;
            while (temp.next!=tobeDelete){
                temp=temp.next;
            }
            temp.next=null;
        }
        return head;
    }

}
