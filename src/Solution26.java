import base.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by MrGeekr.
 * Date : 2019/10/4.
 * Description :从上往下打印二叉树
 * 题目描述
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class Solution26 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        if (root==null){
            return arrayList;
        }

        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode treeNode= ((LinkedList<TreeNode>) queue).pop();
            arrayList.add(treeNode.val);
            if (treeNode.left!=null){
                queue.add(treeNode.left);
            }
            if (treeNode.right!=null){
                queue.add(treeNode.right);
            }
        }
        return arrayList;
    }
}
