/**
 * Created by MrGeekr.
 * Date : 2019/9/28.
 * Description :单例模式的几种写法
 */
public class Solution2 {

    public static void main(String[] args) {
        System.out.println(Solution2.getInstance1()==Solution2.getInstance1());
    }

    private Solution2(){}

    private static volatile Solution2 instance=null;//加上volatile防止指令重排。new不是原子操作，可能出现instance已被赋值（不为null）但是还未执行构造方法，而出现异常

    //1.简单的懒汉式，有线程安全问题
    public static Solution2 getInstance1(){
        if(instance==null){
            instance=new Solution2();
        }
        return instance;
    }
    //2.加锁，保证线程安全
    public static synchronized Solution2 getInstance2(){
        if(instance==null){
            instance=new Solution2();
        }
        return instance;
    }

    //3.DCL双重检测
    public static Solution2 getInstance3(){
        //第一个判空，可以提高性能
        if (instance==null){
            //锁范围缩小
            synchronized (Solution2.class){
                //再判断一次
                if (instance==null){
                    instance=new Solution2();
                }
            }
        }
        return instance;
    }

    //静态内部类懒汉式:
/*   1.懒汉式： 在第一次调用getInstance方法之前，SingletonWrapper类是没有被加载的，因为它是一个静态内部类。当有线程第一次调用getInstance的时候，SingletonWrapper就会被class loader加载进JVM，在加载的同时，执行instance的初始化。所以，这种写法，仍然是一种懒汉式的单例类。

    2.为什么这样写就是线程安全的呢？大家要记住，类的加载的过程是单线程执行的。它的并发安全是由JVM保证的。所以，这样写的好处是在instance初始化的过程中，由JVM的类加载机制保证了线程安全，而在初始化完成以后，不管后面多少次调用getInstance方法都不会再遇到锁的问题了。*/

    //内部类
    private static class LazyHolder{
        private static final Solution2 instance=new Solution2();
    }
    public static final Solution2 getInstance4(){
        return LazyHolder.instance;
    }


}
