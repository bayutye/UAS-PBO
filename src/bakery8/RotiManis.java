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
public class RotiManis extends Bahan implements ToppingFilling {
    // atribut
    double beratAdonan = 2350;
    double beratSatuan = 50;
    double pesanManis;
    double pesanManis1;
    double pesanManis2;
    double pesanManis3;
    
    //komposisi bahan roti manis
    double beratTepung = 1000;
    double beratGula = 150;
    double beratButter = 150;
    double beratRagi = 20;
    double beratSusuBubuk = 300;
    double beratSusuCair = 250;
    double beratTelur = 80;
    double beratEsBatu = 400;
    
    // atribut topping dan filling
    double fillingKeju1 = 5;
    double fillingCoklat1 = 5;
    double toppingCoklat1 = 5;
    double fillingRedbean2 = 10;
    double toppingVanilla2 = 5;
    double fillingKeju3 = 10;
    double fillingSosis3 = 10;
    
    // method
    @Override
    public double hitungTakaran() {
        double takaran = this.beratAdonan / this.beratSatuan;
        return takaran;
    }

    @Override
    public void satuanBahan() {
        tepung = this.beratTepung / this.hitungTakaran() * this.pesanManis;
        gulaPasir = this.beratGula / this.hitungTakaran() * this.pesanManis;
        butter = this.beratButter / this.hitungTakaran() * this.pesanManis;
        ragi = this.beratRagi / this.hitungTakaran() * this.pesanManis;
        susuBubuk = this.beratSusuBubuk / this.hitungTakaran() * this.pesanManis;
        susuCair = this.beratSusuCair / this.hitungTakaran() * this.pesanManis;
        telur = this.beratTelur / this.hitungTakaran() * this.pesanManis;
        esBatu = this.beratEsBatu / this.hitungTakaran() * this.pesanManis;
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
        double keju1 = this.fillingKeju1 * this.pesanManis1;
        double hargaKeju1 = keju1 * KEJU;
        
        double keju3 = this.fillingKeju3 * this.pesanManis3;
        double hargaKeju3 = keju3 * KEJU;
        
        bahanKeju = keju1 + keju3;
        hargaKeju = hargaKeju1 + hargaKeju3;
    }

    @Override
    public void tfCoklat() {
        bahanCoklat = (this.fillingCoklat1 + this.toppingCoklat1) * this.pesanManis1;
        hargaCoklat = bahanCoklat * COKLAT;
    }

    @Override
    public void tfVanilla() {
        bahanVanilla = this.toppingVanilla2 * this.pesanManis2;
        hargaVanilla = bahanVanilla * VANILLA;
    }

    @Override
    public void tfRedbean() {
        bahanRedbean = this.fillingRedbean2 * this.pesanManis2;
        hargaRedbean = bahanRedbean * REDBEAN;
    }

    @Override
    public void tfSosis() {
        bahanSosis = this.fillingSosis3 * this.pesanManis3;
        hargaSosis = bahanSosis * SOSIS;
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
        int totalModal = (int) (hTepung + hGulaPasir + hButter + hRagi + hSusuBubuk + hSusuCair + hTelur + hEsBatu + hargaKeju + hargaCoklat + hargaRedbean + hargaVanilla + hargaSosis);
        int profit = (int) (totalModal / pesanManis);
        int hargaJual = profit * 100/50;
        
        System.out.println("==============================");
        System.out.println("       ---ROTI MANIS---       ");
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
        System.out.println("Redbean        " + (int)bahanRedbean + " gr dengan harga Rp " + (int)hargaRedbean);
        System.out.println("Vanilla        " + (int)bahanVanilla + " gr dengan harga Rp " + (int)hargaVanilla);
        System.out.println("Sosis          " + (int)bahanSosis + " gr dengan harga Rp " + (int)hargaSosis);
        System.out.println("-----------------------------------------------");
        System.out.println("PERHITUNGAN HARGA JUAL");
        System.out.println("Total Modal        = " + totalModal);
        System.out.println("Harga Jual per pcs = " + hargaJual);
    }

}
