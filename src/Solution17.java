/**
 * Created by MrGeekr.
 * Date : 2019/10/4.
 * Description :调整数组顺序使奇数位于偶数前面
 * 题目描述
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Solution17 {
    public void reOrderArray(int [] array) {
        int left=0;
        int right=array.length-1;
        while (left<right){
            //向后移动直到指向偶数
            while (left<right&&(array[left]&1)!=0){
                left++;
            }
            //向前移动直到指向奇数
            while (left<right&&(array[right]&1)==0){
                right--;
            }
            //互换
            if (left<right){
                int temp=array[left];
                array[left]=array[right];
                array[right]=temp;
            }

        }
    }
}
