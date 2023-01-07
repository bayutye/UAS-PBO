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
    
    public double bKeju(){
        double bahanKeju = this.toppingKeju1 * this.pesanPizza;
        return bahanKeju;
    }
    
    public double hKeju(){
        double hargaKeju = bKeju() * KEJU;
        return hargaKeju;
    }
    public double bSosis(){
        double bahanSosis = this.toppingSosis1 * this.pesanPizza;
        return bahanSosis;
    }
    
    public double hSosis(){
        double hargaSosis = bSosis() * SOSIS;
        return hargaSosis;
    }

    public double bSmokedBeef(){
        double bahanSmokedBeef = this.toppingSmokedBeef1 * this.pesanPizza;
        return bahanSmokedBeef;
    }
    
    public double hSmokedBeef(){
        double hargaSmokedBeef = bSmokedBeef()* SMOKEDBEEF;
        return hargaSmokedBeef;
    }
    
    public double bBawangBombay(){
        double bahanBawangBombay = this.toppingBawangBombay1 * this.pesanPizza;
        return bahanBawangBombay;
    }
    
    public double hBawangBombay(){
        double hargaBawangBombay = bBawangBombay() * BAWANGBOMBAY;
        return hargaBawangBombay;
    }
    
    
    private final String strFormat = "||%1$-4s%2$-24s %3$-16s %4$-16s||\n";
    
    public void output() {
        double totalModal = (int) (hTepung + hGulaPasir + hButter + hRagi + hSusuBubuk + hSusuCair + hTelur + hEsBatu)+ hKeju() + hSosis() + hSmokedBeef() + hBawangBombay();
        int profit = (int) (totalModal / pesanPizza);
        int hargaJual = profit * 50/100 + profit;
        
        System.out.println("==================================================================");
        System.out.println("                          ---PIZZA---                           ");
        System.out.println("==================================================================");
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " No", "| Bahan", "| " + "Jumlah", "| Harga");
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " 1.", "| Tepung Terigu", "| " + (int)tepung + " gram", "| Rp. " + (int)hTepung);
        System.out.format(strFormat, " 2.", "| Gula Pasir", "| " + (int)gulaPasir + " gram", "| Rp. " + (int)hGulaPasir);
        System.out.format(strFormat, " 3.", "| Butter", "| " + (int)butter + " gram", "| Rp. " + (int)hButter);
        System.out.format(strFormat, " 4.", "| Ragi", "| " + (int)ragi + " gram", "| Rp. " + (int)hRagi);
        System.out.format(strFormat, " 5.", "| Susu Bubuk", "| " + (int)susuBubuk + " gram", "| Rp. " + (int)hSusuBubuk);
        System.out.format(strFormat, " 6.", "| Susu Cair", "| " + (int)susuCair + " gram", "| Rp. " + (int)hSusuCair);
        System.out.format(strFormat, " 7.", "| Telur", "| " + (int)telur + " gram", "| Rp. " + (int)hTelur);
        System.out.format(strFormat, " 8.", "| Es Batu", "| " + (int)esBatu + " gram", "| Rp. " + (int)hEsBatu);
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " No", "| Toping", "| " + "Jumlah", "| Rp. " + "Harga");
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " 1.", "| Keju", "| " + bKeju() + " gram", "| Rp. " + hKeju());
        System.out.format(strFormat, " 2.", "| Sosis", "| " + bSosis() + " gram", "| Rp. " + hSosis());
        System.out.format(strFormat, " 3.", "| Smoked Beef", "| " + bSmokedBeef() + " gram", "| Rp. " + hSmokedBeef());
        System.out.format(strFormat, " 4.", "| Bawang Bombay", "| " + bBawangBombay() + " gram", "| Rp. " + hBawangBombay());
        System.out.println("------------------------------------------------------------------");
        System.out.println("                  ---PERHITUNGAN HARGA JUAL---                    ");
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " --", "| Total Modal", "", "| Rp. " + totalModal);
        System.out.format(strFormat, " --", "| Harga Jual Per pcs", "", "| Rp. " + hargaJual);
        System.out.println("------------------------------------------------------------------");
    }
}
