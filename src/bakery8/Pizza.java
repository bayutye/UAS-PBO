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
public class Pizza extends Bahan implements ToppingFilling {
    // atribut
    double beratAdonan = 1950;
    double beratSatuan = 190;
    double pesanPizza;
    double pesanPizza1;
    
    //komposisi bahan roti manis
    double beratTepung = 1000;
    double beratGula = 100;
    double beratButter = 100;
    double beratRagi = 20;
    double beratSusuBubuk = 200;
    double beratSusuCair = 180;
    double beratTelur = 50;
    double beratEsBatu = 300;
    
    // atribut topping dan filling
    double toppingKeju1 = 30;
    double toppingSosis1 = 50;
    double toppingSmokedBeef1 = 50;
    double toppingBawangBombay1 = 30;
    
    // method
    @Override
    public double hitungTakaran() {
        double takaran = this.beratAdonan / this.beratSatuan;
        return takaran;
    }

    @Override
    public void satuanBahan() {
        tepung = this.beratTepung / this.hitungTakaran() * this.pesanPizza;
        gulaPasir = this.beratGula / this.hitungTakaran() * this.pesanPizza;
        butter = this.beratButter / this.hitungTakaran() * this.pesanPizza;
        ragi = this.beratRagi / this.hitungTakaran() * this.pesanPizza;
        susuBubuk = this.beratSusuBubuk / this.hitungTakaran() * this.pesanPizza;
        susuCair = this.beratSusuCair / this.hitungTakaran() * this.pesanPizza;
        telur = this.beratTelur / this.hitungTakaran() * this.pesanPizza;
        esBatu = this.beratEsBatu / this.hitungTakaran() * this.pesanPizza;
    }

    @Override
    public void hargaBahan() {
        hTepung = this.tepung * this.hargaTepung;
        hGulaPasir = this.gulaPasir * this.hargaGulaPasir;
        hButter = this.butter * this.hargaButter;
        hRagi = this.ragi * this.hargaRagi;
        hSusuBubuk = this.susuBubuk * this.hargaSusuBubuk;
        hSusuCair = this.susuCair * this.hargaSusuCair;
        hTelur = this.telur * this.hargaTelur;
        hEsBatu = this.esBatu * this.hargaEsBatu;
    }

    @Override
    public void tfKeju() {
        bahanKeju = this.toppingKeju1 * this.pesanPizza1;
        hargaKeju = bahanKeju * KEJU;
    }

    @Override
    public void tfCoklat() {
        
    }

    @Override
    public void tfVanilla() {
        
    }

    @Override
    public void tfRedbean() {
        
    }

    @Override
    public void tfSosis() {
        bahanSosis = this.toppingSosis1 * this.pesanPizza1;
        hargaSosis = bahanSosis * SOSIS;
    }

    @Override
    public void tfSmokedBeef() {
        bahanSmokedBeef = this.toppingSmokedBeef1 * this.pesanPizza1;
        hargaSmokedBeef = bahanSmokedBeef * SMOKEDBEEF;
    }

    @Override
    public void tfBawangBombay() {
        bahanBawangBombay = this.toppingBawangBombay1 * this.pesanPizza1;
        hargaBawangBombay = bahanBawangBombay * BAWANGBOMBAY;
    }
    
    @Override
    public void output() {
        int totalModal = (int) (hTepung + hGulaPasir + hButter + hRagi + hSusuBubuk + hSusuCair + hTelur + hEsBatu + hargaKeju + hargaSosis + hargaSmokedBeef + hargaBawangBombay);
        int profit = (int) (totalModal / pesanPizza);
        int hargaJual = profit * 100/50;
        
        System.out.println("==============================");
        System.out.println("          ---PIZZA---         ");
        System.out.println("==============================");
        System.out.println("Tepung Terigu  " + (int)tepung  + " gr dengan harga Rp " + (int)hTepung);
        System.out.println("Gula Pasir     " + (int)gulaPasir  + " gr dengan harga Rp " + (int)hGulaPasir);
        System.out.println("Butter         " + (int)butter  + " gr dengan harga Rp " + (int)hButter);
        System.out.println("Susu Bubuk     " + (int)susuBubuk  + " gr dengan harga Rp " + (int)hSusuBubuk);
        System.out.println("Susu Cair      " + (int)susuCair  + " gr dengan harga Rp " + (int)hSusuCair);
        System.out.println("Telur          " + (int)telur  + " gr dengan harga Rp " + (int)hTelur);
        System.out.println("Es Batu        " + (int)esBatu  + " gr dengan harga Rp " + (int)hEsBatu);
        System.out.println("-----------------------------------------------");
        System.out.println("Keju           " + (int)bahanKeju + " gr dengan harga Rp " + (int)hargaKeju);
        System.out.println("Sosis          " + (int)bahanSosis + " gr dengan harga Rp " + (int)hargaSosis);
        System.out.println("Smoked Beef    " + (int)bahanSmokedBeef + " gr dengan harga Rp " + (int)hargaSmokedBeef);
        System.out.println("Bawang Bombay  " + (int)bahanBawangBombay + " gr dengan harga Rp " + (int)hargaBawangBombay);
        System.out.println("-----------------------------------------------");
        System.out.println("PERHITUNGAN HARGA JUAL");
        System.out.println("Total Modal        = " + totalModal);
        System.out.println("Harga Jual per pcs = " + hargaJual);
    }
}
