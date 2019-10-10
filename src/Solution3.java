/**
 * Created by MrGeekr.
 * Date : 2019/9/29.
 * Description :二维数组中的查找
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Solution3 {



    public static boolean Find(int target, int [][] array) {
        //判断特殊情况,空指针
        if (array==null){
            return false;
        }
        int rows=0;//行
        int cols=array[0].length-1;//列,当然，要-1，不然就越界
        //从右上角开始找，target偏大就向下找，target偏小就向左找
        while (rows<array.length&&cols>=0){
            if (target==array[rows][cols]){
                return true;
            }else if (target>array[rows][cols]){
                rows++;
            }else if (target<array[rows][cols]){
                cols--;
            }
        }
        return false;

    }
}
