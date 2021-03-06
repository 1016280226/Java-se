package com.java.base.object.base;

/**
 * @author Calvin
 * @titile: 对象的行为和状态
 * @date 2019/2/20
 * @since 1.0
 */
public class Person {

    /**
     * 状态 -> 属性
     */
    private String sleepState = "睡觉中";

    /**
     * 行为 -> 方法
     */
    public void sleep(){
        System.out.println("人会睡觉");
    }

    /**
     * 方法重载
     */
    public void sleep(String sleepState){
        System.out.println(sleepState);
    }
}
