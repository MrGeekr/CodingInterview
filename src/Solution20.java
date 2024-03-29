import base.ListNode;
import com.sun.scenario.effect.Merge;

/**
 * Created by MrGeekr.
 * Date : 2019/10/4.
 * Description :合并两个排序的链表
 * 题目描述
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class Solution20 {
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1==null){
            return list2;
        }else if (list2==null){
            return list1;
        }
        ListNode mergeHead=null;
        if (list1.val<list2.val){
            mergeHead=list1;
            mergeHead.next=Merge(mergeHead.next,list2);
        }else {
            mergeHead=list2;
            mergeHead.next=Merge(list1,mergeHead.next);
        }
        return mergeHead;
    }
}
