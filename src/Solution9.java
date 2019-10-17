/**
 * Created by MrGeekr.
 * Date : 2019/10/1.
 * Description :斐波那契数列
 * 题目描述
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */
public class Solution9 {
    public int Fibonacci(int n) {
        int a=0;
        int b=1;
        int temp=-1;
        if(n<=0){
            return a;
        }
        if(n==1){
            return b;
        }
        for(int i=2;i<=n;i++){
            temp=a+b;
            a=b;
            b=temp;
        }
        return temp;
    }
}
