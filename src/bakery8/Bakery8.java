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
        m1.pesanManis = 220;
        m1.pesanManis1 = 50;
        m1.pesanManis2 = 100;
        m1.pesanManis3 = 70;
        m1.satuanBahan();
        m1.hargaBahan();
        m1.tfKeju();
        m1.tfCoklat();
        m1.tfRedbean();
        m1.tfVanilla();
        m1.tfSosis();
        m1.output();
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        
        RotiTawar t1 = new RotiTawar();
        t1.pesanTawar = 35;
        t1.pesanTawar1 = 20;
        t1.pesanTawar2 = 15;
        t1.satuanBahan();
        t1.hargaBahan();
        t1.tfKeju();
        t1.tfCoklat();
        t1.output();
        System.out.println("------------------------------");
        System.out.println("------------------------------");
     
        Pizza p1 = new Pizza();
        p1.pesanPizza = 10;
        p1.pesanPizza1 = 10;
        p1.satuanBahan();
        p1.hargaBahan();
        p1.tfKeju();
        p1.tfSosis();
        p1.tfSmokedBeef();
        p1.tfBawangBombay();
        p1.output();
        
    }
    
}
