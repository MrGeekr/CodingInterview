/**
 * Created by MrGeekr.
 * Date : 2019/10/2.
 * Description :矩形覆盖
 * 题目描述
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class Solution12 {
    public int RectCover(int target) {
        int a=1;
        int b=2;
        int temp=-1;
        if (target<=0){
            return 0;
        }
        if (target==1){
            return 1;
        }
        if (target==2){
            return 2;
        }
        for (int i = 3; i <=target ; i++) {
            temp=a+b;
            a=b;
            b=temp;
        }
        return temp;
    }
}
