package com.wildchap.thread;

/**
 * //方式一：继承Thread类
 * 1.创建一个Thread类的子类
 * 2.重写run方法
 * 3.创建对象
 * 4.调用star()
 *
 * @program: java_jvm
 * @description: 多线程类测试
 * @author: zy wang
 * @create: 2020-11-17 17:02
 */

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2!=0)
                System.out.println("线程1" + i);
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try{
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i%2==0)
                System.out.println("线程2" + i);
        }
    }
}

public class ThreadTest {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread2 myThread2 = new MyThread2();
        myThread.start();
        myThread2.start();

        //创建Thread对象的匿名子类
        new Thread(){
            @Override
            public void run() {
                System.out.println("匿名子类方式创建线程");
            }
        }.start();

        System.out.println("hello");
    }

}
