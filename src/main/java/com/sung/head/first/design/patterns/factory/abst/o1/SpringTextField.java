package com.sung.head.first.design.patterns.factory.abst.o1;

/**
 * Created by sungang on 2017/11/6.
 */
public class SpringTextField implements TextField {

    @Override
    public void display() {
        System.out.println("显示绿色边框文本框。");
    }
}
