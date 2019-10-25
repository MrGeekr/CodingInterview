/**
 * Created by MrGeekr.
 * Date : 2019/10/3.
 * Description :打印从 1 到最大的 n 位数
 * 打印从 1 到最大的 n 位数
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出
 1、2、3 一直到最大的 3 位数即 999
 */
public class Solution15 {

    public static void main(String[] args) {
        print1ToMaxOfNDigits(1);
    }

    //由于 n 可能会非常大，因此不能直接用 int 表示数字，而是用 char 数组进行存储。
    public static void print1ToMaxOfNDigits(int n) {
       if(n<0){
           return;
       }
       char[] number=new char[n];
       print1ToMaxOfNDigits(number,0);
    }
    //通过+'0'构建字符数组
    private static void print1ToMaxOfNDigits(char[] number, int digit) {
        if (digit == number.length) {
            printNumber(number);
            return;
        }
        for (int i = 0; i < 10; i++) {
            number[digit] = (char) (i + '0');//要加0，如果加空格的话打出来就是  !、"、#、等字符,因为ASCII码
            print1ToMaxOfNDigits(number, digit + 1);
        }
    }
    private static void printNumber(char[] number) {
        int index = 0;
        while (index < number.length && number[index] == '0')
            index++;
        System.out.println("index"+index);
        while (index < number.length)
            System.out.print(number[index++]);
        System.out.println("-----");
    }
}
