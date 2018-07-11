/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabackend_ex2;

import java.util.Scanner;

/**
 *
 * @author DatPT
 */
public class ThayGiao2 {

    private int ma;
    private String ten;

    private static ThayGiao2 instance;

    private ThayGiao2(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public static ThayGiao2 goiThayGiao(int ma, String ten) {
        if (instance == null) {
            instance = new ThayGiao2(ma, ten);
        }
        return instance;
    }

    public void inTT() {
        System.out.println("ten thay giao: " + instance.ten);
    }
}
