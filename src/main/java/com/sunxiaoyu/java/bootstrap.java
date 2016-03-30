package com.sunxiaoyu.java;

/**
 * Created by sun on 16/3/29.
 */
public class BootStrap {
    public static void main(String[] args) {
        InheritingExceptions sed = new InheritingExceptions();
        try {
            sed.f();
        } catch (SimpleException e) {
            System.out.println("caught it!");
            e.printStackTrace();
        }
    }
}
