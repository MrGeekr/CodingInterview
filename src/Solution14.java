/**
 * Created by MrGeekr.
 * Date : 2019/10/2.
 * Description :数值的整数次方
 * 题目描述
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *
 * 保证base和exponent不同时为0
 */
public class Solution14 {
    public double Power(double base, int exponent) {
        if (isEqual(exponent,1)){
            return base;
        }
        if (isEqual(base,0)){
            //不能出现base是0，幂是负数
            if (exponent<0){
                throw new RuntimeException("不能出现base是0，幂是负数，因为0不能做分母");
            }
            return 0;//这里默认0的0次方也是0，其实也可以是1，数学上没有规定
        }
        //如果指数是负的，先取相反数
        int absExponent = exponent;
        if (exponent<0){
            absExponent =-exponent;
        }
        double result=1;
        for (int i = 1; i <= absExponent; i++) {
            result*=base;
        }

        return exponent>0?result:1/result;
    }

    //用于判断两个小数是否相等，因为小数的精度问题，不能直接==判断
    public boolean isEqual(double a, double b) {
        //a-b和b-a都要，因为不知道是a大还是b大
        return Math.abs(a-b) < 0.000001;
    }
}