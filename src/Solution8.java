/**
 * Created by MrGeekr.
 * Date : 2019/10/1.
 * Description :旋转数组的最小数字
 * 题目描述
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
import java.util.ArrayList;
public class Solution8 {
    public int minNumberInRotateArray(int [] array) {
        //如果是空数组
        if (array.length == 0){
            return 0;
        }
        //如果数组中只有一个数字，那就直接返回它
        if (array.length==1){
            return array[0];
        }
        int low=0;
        int high=array.length-1;
        int mid=-1;//定义-1.避免和其他一样
        while (array[low]>array[high]){
            if (high-low==1){
                mid=high;
                //break提升性能
                break;
            }
            //避免数字溢出
            mid=low+(high-low)/2;
            //判断的时候要加上等于号，因为mid计算之后有可能就是low或者high一样大，不加等于号会死循环
            if (array[mid]>=array[low]){
                low=mid;
            }else if (array[mid]<=array[high]){
                high=mid;
            }
        }
        return array[mid];
    }
}
