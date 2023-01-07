/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakery8;

/**
 *
 * @author DELL
 */
public class Bakery8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RotiManis m1 = new RotiManis();
        m1.pesanManis1 = 50;
        m1.pesanManis2 = 100;
        m1.pesanManis3 = 70;
        m1.satuanBahan();
        m1.hargaBahan();
        m1.hKeju1();
        m1.hCoklat();
        m1.hRedbean();
        m1.hVanilla();
        m1.hSosis();
        m1.output1();
        m1.output2();
        m1.output3();
        System.out.println("\n");
        
        RotiTawar t1 = new RotiTawar();
        t1.pesanTawar1 = 20;
        t1.pesanTawar2 = 15;
        t1.satuanBahan();
        t1.hargaBahan();
        t1.hKeju();
        t1.hCoklat();
        t1.output();
        t1.output2();
        System.out.println("\n");
    
        Pizza p1 = new Pizza();
        p1.pesanPizza = 10;
        p1.satuanBahan();
        p1.hargaBahan();
        p1.hKeju();
        p1.hSosis();
        p1.hSmokedBeef();
        p1.hBawangBombay();
        p1.output();   
    }
}
