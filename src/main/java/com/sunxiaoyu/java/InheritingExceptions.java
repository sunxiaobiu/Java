package com.sunxiaoyu.java;

/**
 * Created by sun on 16/3/29.
 */
public class InheritingExceptions {
    public void f() throws SimpleException{
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException("lala");
    }
}
