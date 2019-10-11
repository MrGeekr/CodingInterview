import base.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by MrGeekr.
 * Date : 2019/9/30.
 * Description :从尾到头打印链表
 * 题目描述
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class Solution5 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        //使用Java自带的栈
        Stack<Integer> stack=new Stack<>();
        while (listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        ArrayList<Integer> list=new ArrayList<>();
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }
}
