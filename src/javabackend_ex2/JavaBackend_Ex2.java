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
public class JavaBackend_Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ThayGiao2 thayGiao2 = ThayGiao2.goiThayGiao(1, "Dang Tuan Tu");

        thayGiao2.inTT();
        ThayGiao2 thayGiao3 = ThayGiao2.goiThayGiao(2, "Dang Tuan Tu 2");

        thayGiao3.inTT();

        //
        VoThayGiao voThayGiao1 = VoThayGiao.goiVoThayGiao(0, "Vo thay 1");
        voThayGiao1.inTT();
        VoThayGiao voThayGiao2 = VoThayGiao.goiVoThayGiao(0, "Vo thay 2");
        voThayGiao2.inTT();
        VoThayGiao voThayGiao3 = VoThayGiao.goiVoThayGiao(0, "Vo thay 3");
        voThayGiao3.inTT();
        VoThayGiao voThayGiao4 = VoThayGiao.goiVoThayGiao(0, "Vo thay 4");
        VoThayGiao voThayGiao5 = VoThayGiao.goiVoThayGiao(0, "Vo thay 5");
        VoThayGiao voThayGiao6 = VoThayGiao.goiVoThayGiao(0, "Vo thay 6");

        voThayGiao4.inTT();
        voThayGiao5.inTT();
        voThayGiao6.inTT();
    }

}
