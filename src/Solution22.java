import base.TreeNode;
import javafx.scene.transform.Rotate;

/**
 * Created by MrGeekr.
 * Date : 2019/10/4.
 * Description :二叉树的镜像
 * 题目描述
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 */
public class Solution22 {
    public void Mirror(TreeNode root) {
        if (root==null){
            return;//如果空，直接返回中断
        }
        if (root.left==null&&root.right==null){
         return;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        if (root.left!=null){
            Mirror(root.left);
        }
        if (root.right!=null){
            Mirror((root.right));

        }
    }
}
