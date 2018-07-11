/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabackend_ex2;

/**
 *
 * @author DatPT
 */
public class VoThayGiao {

    private int ma;
    private String ten;
    private static int count = 0;
    private static VoThayGiao instance;

    private VoThayGiao(int ma, String ten) {
        count++;
        this.ma = ma;
        this.ten = ten;
    }

    public static VoThayGiao goiVoThayGiao(int ma, String ten) {
        if (count < 3) {
            instance = new VoThayGiao(ma, ten);
        }
        return instance;
    }
    
     public void inTT(){
        System.out.println("ten vo thay giao: " +instance.ten);
    }

}
