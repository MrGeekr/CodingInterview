/**
 * Created by MrGeekr.
 * Date : 2019/9/29.
 * Description :替换空格
 * 题目描述
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 *
 */
public class Solution4 {

    public static void main(String[] args) {

    }

    public static String replaceSpace(StringBuffer str) {

        //考虑特殊输入
        if (str==null||str.length()==0){
            return str.toString();
        }

        int p1=str.length()-1;
        //记录有几个空格
        int count =0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==' '){
                count++;
            }
        }

        //因为每个空格要被替换成3个字符，之前的空格占1个字符，所以新生成的String比原来增加长度就是空格的个数
       int p2=str.length()+ count*2 -1;
        str.setLength(str.length()+count*2);//设置长度,防止下标越界
        while (p1>=0&&p2>p1){
            char c=str.charAt(p1--);
            if (c==' '){
                str.setCharAt(p2--,'0');
                str.setCharAt(p2--,'2');
                str.setCharAt(p2--,'%');

            }else {
                str.setCharAt(p2--,c);
            }
        }
        return str.toString();
    }
}
