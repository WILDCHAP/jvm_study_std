package com.wildchap.jvm;

/**
 * @program: java_jvm
 * @description: 测试
 * @author: zy wang
 * @create: 2020-11-13 20:23
 */
// -Xms8m -Xmx8m -XX:+PrintGCDetails
public class Test {
    public static void main(String[] args) {
        String str = "";
        while (true){
            str += str + "abc";
        }
    }
}
