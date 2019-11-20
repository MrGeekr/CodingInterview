import java.util.Iterator;
import java.util.Stack;

/**
 * Created by MrGeekr.
 * Date : 2019/10/4.
 * Description :包含min函数的栈
 * 题目描述
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
public class Solution24 {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack=new Stack<>();//记录最小元素所在位置的辅助栈
    public void push(int node) {
        if (stack.isEmpty()){
            stack.push(node);
            minStack.push(0);
        }else {
            int min=stack.get(minStack.peek());
            stack.push(node);
            if (min>node){
                minStack.push(stack.size()-1);
            }else {
                minStack.push(minStack.peek());
            }
        }

    }

    public void pop() {
        if (stack==null){
            throw new RuntimeException();
        }
        minStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        // 如果最小数公位置栈已经为空（数据栈中已经没有数据了），则抛出异常
        if (minStack.isEmpty()) {
            throw new RuntimeException("No element in stack.");
        }
        // 获取数据栈中的最小元素，并且返回结果
        return stack.get(minStack.peek());
    }
}
