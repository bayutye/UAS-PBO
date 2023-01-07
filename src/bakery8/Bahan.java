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
    
    // method
    public abstract double hitungTakaran();
    
    public abstract void satuanBahan();
    
    public abstract void hargaBahan();
    
    public abstract void output();
    
}
