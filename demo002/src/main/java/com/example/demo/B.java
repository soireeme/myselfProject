package com.example.demo;

import com.example.demo.baseController.A;

/**
 * @author honglei
 * @version 1.0
 * @date 2021/5/18 13:26
 * @desp
 */
public class B  extends A {

    private   String  xx;

    public String getXx() {
        return xx;
    }


    public void setXx(String xx) {
        this.xx = xx;
    }


    public static void main(String[] args) {

        A a= new A();
        a.getXx();
        B b= new B();
        b.getXx();

        A v1   = new B();
            v1.getXx();
    }



}
