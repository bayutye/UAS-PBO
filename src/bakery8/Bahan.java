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
public abstract class Bahan {
    // atribut
    //komposisi bahan pokok
    public double tepung;
    public double gulaPasir;
    public double butter;
    public double ragi;
    public double susuBubuk;
    public double susuCair;
    public double telur;
    public double esBatu;
    public double tepung2;
    public double gulaPasir2;
    public double butter2;
    public double ragi2;
    public double susuBubuk2;
    public double susuCair2;
    public double telur2;
    public double esBatu2;
    public double tepung3;
    public double gulaPasir3;
    public double butter3;
    public double ragi3;
    public double susuBubuk3;
    public double susuCair3;
    public double telur3;
    public double esBatu3;
    
    //komposisi bahan topping filling
    public double bahanKeju;
    public double bahanCoklat;
    public double bahanVanilla;
    public double bahanRedbean;
    public double bahanSosis;
    public double bahanSmokedBeef;
    public double bahanBawangBombay;
    
    
    // harga bahan toping dan filling
    public double hargaKeju;
    public double hargaCoklat;
    public double hargaVanilla;
    public double hargaRedbean;
    public double hargaSosis;
    public double hargaSmokedBeef;
    public double hargaBawangBombay;
    
    //harga bahan per gram
    public double hargaTepung = 40000/1000;
    public double hargaGulaPasir = 25000/1000;
    public double hargaButter = 23000/500;
    public double hargaRagi = 5000/11;
    public double hargaSusuBubuk = 39000/1000;
    public double hargaSusuCair = 24000/1000;
    public double hargaTelur = 23000/1000;
    public double hargaEsBatu = 2000/1000;
    
    // harga bahan
    public double hTepung;
    public double hGulaPasir;
    public double hButter;
    public double hRagi;
    public double hSusuBubuk;
    public double hSusuCair;
    public double hTelur;
    public double hEsBatu;
    public double hTepung2;
    public double hGulaPasir2;
    public double hButter2;
    public double hRagi2;
    public double hSusuBubuk2;
    public double hSusuCair2;
    public double hTelur2;
    public double hEsBatu2;
    public double hTepung3;
    public double hGulaPasir3;
    public double hButter3;
    public double hRagi3;
    public double hSusuBubuk3;
    public double hSusuCair3;
    public double hTelur3;
    public double hEsBatu3;
    
    // method
    public abstract double hitungTakaran();
    
    public abstract void satuanBahan();
    
    public abstract void hargaBahan();
    
}
