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
public class RotiTawar extends Bahan implements ToppingFilling {
    // atribut
    double beratAdonan = 2065;
    double beratSatuan = 400;
    double pesanTawar;
    double pesanTawar1;
    double pesanTawar2;
    
    //komposisi bahan roti manis
    double beratTepung = 1000;
    double beratGula = 125;
    double beratButter = 100;
    double beratRagi = 20;
    double beratSusuBubuk = 250;
    double beratSusuCair = 200;
    double beratTelur = 70;
    double beratEsBatu = 300;
    
    // atribut topping dan filling
    double fillingCoklat1 = 80;
    double fillingKeju2 = 80;
    
    // method
    @Override
    public double hitungTakaran() {
        double takaran = this.beratAdonan / this.beratSatuan;
        return takaran;
    }

    @Override
    public void satuanBahan() {
        tepung = this.beratTepung / this.hitungTakaran() * this.pesanTawar;
        gulaPasir = this.beratGula / this.hitungTakaran() * this.pesanTawar;
        butter = this.beratButter / this.hitungTakaran() * this.pesanTawar;
        ragi = this.beratRagi / this.hitungTakaran() * this.pesanTawar;
        susuBubuk = this.beratSusuBubuk / this.hitungTakaran() * this.pesanTawar;
        susuCair = this.beratSusuCair / this.hitungTakaran() * this.pesanTawar;
        telur = this.beratTelur / this.hitungTakaran() * this.pesanTawar;
        esBatu = this.beratEsBatu / this.hitungTakaran() * this.pesanTawar;
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
        bahanKeju = this.fillingKeju2 * this.pesanTawar2;
        hargaKeju = bahanKeju * KEJU;
    }

    @Override
    public void tfCoklat() {
        bahanCoklat = this.fillingCoklat1 * this.pesanTawar1;
        hargaCoklat = bahanCoklat * COKLAT;
    }

    @Override
    public void tfVanilla() {
        
    }

    @Override
    public void tfRedbean() {
        
    }

    @Override
    public void tfSosis() {
        
    }

    @Override
    public void tfSmokedBeef() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tfBawangBombay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void output() {
        int totalModal = (int) (hTepung + hGulaPasir + hButter + hRagi + hSusuBubuk + hSusuCair + hTelur + hEsBatu + hargaKeju + hargaCoklat);
        int profit = (int) (totalModal / pesanTawar);
        int hargaJual = profit * 100/50;
        
        System.out.println("==============================");
        System.out.println("       ---ROTI TAWAR---       ");
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
        System.out.println("Coklat         " + (int)bahanCoklat + " gr dengan harga Rp " + (int)hargaCoklat);
        System.out.println("-----------------------------------------------");
        System.out.println("PERHITUNGAN HARGA JUAL");
        System.out.println("Total Modal        = " + totalModal);
        System.out.println("Harga Jual per pcs = " + hargaJual);
    }

}
