/**
 * Created by MrGeekr.
 * Date : 2019/10/2.
 * Description :跳台阶
 * 题目描述
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class Solution10 {
    public int JumpFloor(int target) {
        int a=1;
        int b=2;
        int temp=-1;
        if (target<=0){
            return 0;
        }
        if (target==1){
            return a;
        }
        if (target==2){
            return b;
        }
        for (int i = 3; i <=target ; i++) {
            temp=a+b;
            a=b;
            b=temp;
            }
            return temp;
    }
}
