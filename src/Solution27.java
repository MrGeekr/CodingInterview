/**
 * Created by MrGeekr.
 * Date : 2019/10/5.
 * Description :二叉搜索树的后序遍历序列
 * 题目描述
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class Solution27 {
    public static void main(String[] args) {
        int[] array= {4, 8, 6, 12, 16, 14, 10};
        System.out.println(VerifySquenceOfBST(array));
    }
    public static boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length==0){
            return false;
        }
        return IsTreeBST(sequence,0,sequence.length-1);
    }

    private static boolean IsTreeBST(int[] sequence, int start, int end) {
        // 如果对应要处理的数据只有一个或者已经没有数据要处理（start>end）就返回true
        if (end<=start){
            return true;
        }
        int i=start;
        for (; i <end ; i++) {
            if (sequence[i]>sequence[end]){
                break;
            }
        }
        for (int j = i; j <end ; j++) {
            if (sequence[j]<sequence[end]){
                return false;
            }
        }
        return IsTreeBST(sequence,start,i-1)&&IsTreeBST(sequence,i,end-1);
    }
}
