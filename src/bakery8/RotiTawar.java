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
        tepung = this.beratTepung / this.hitungTakaran() * this.pesanTawar1;
        gulaPasir = this.beratGula / this.hitungTakaran() * this.pesanTawar1;
        butter = this.beratButter / this.hitungTakaran() * this.pesanTawar1;
        ragi = this.beratRagi / this.hitungTakaran() * this.pesanTawar1;
        susuBubuk = this.beratSusuBubuk / this.hitungTakaran() * this.pesanTawar1;
        susuCair = this.beratSusuCair / this.hitungTakaran() * this.pesanTawar1;
        telur = this.beratTelur / this.hitungTakaran() * this.pesanTawar1;
        esBatu = this.beratEsBatu / this.hitungTakaran() * this.pesanTawar1;
        tepung2 = this.beratTepung / this.hitungTakaran() * this.pesanTawar2;
        gulaPasir2 = this.beratGula / this.hitungTakaran() * this.pesanTawar2;
        butter2 = this.beratButter / this.hitungTakaran() * this.pesanTawar2;
        ragi2 = this.beratRagi / this.hitungTakaran() * this.pesanTawar2;
        susuBubuk2 = this.beratSusuBubuk / this.hitungTakaran() * this.pesanTawar2;
        susuCair2 = this.beratSusuCair / this.hitungTakaran() * this.pesanTawar2;
        telur2 = this.beratTelur / this.hitungTakaran() * this.pesanTawar2;
        esBatu2 = this.beratEsBatu / this.hitungTakaran() * this.pesanTawar2;
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
        hTepung2 = this.tepung2 * this.hargaTepung;
        hGulaPasir2 = this.gulaPasir2 * this.hargaGulaPasir;
        hButter2 = this.butter2 * this.hargaButter;
        hRagi2 = this.ragi2 * this.hargaRagi;
        hSusuBubuk2 = this.susuBubuk2 * this.hargaSusuBubuk;
        hSusuCair2 = this.susuCair2 * this.hargaSusuCair;
        hTelur2 = this.telur2 * this.hargaTelur;
        hEsBatu2 = this.esBatu2 * this.hargaEsBatu;
    }

    public double bKeju(){
        double bahanKeju = this.fillingKeju2 * this.pesanTawar2;
        return bahanKeju;
    }
    
    public double hKeju (){ 
        double hargaKeju = bKeju() * KEJU;
        return hargaKeju;
    }
    
    public double bCoklat(){
        double bahanCoklat = this.fillingCoklat1 * this.pesanTawar1;
        return bahanCoklat;
    }
    
    public double hCoklat(){
        double hargaCoklat = bCoklat() * COKLAT;
        return hargaCoklat;
    }
       
    private String strFormat = "||%1$-4s%2$-24s %3$-16s %4$-16s||\n";
    
    public void output() {
        double totalModal = (int) (hTepung + hGulaPasir + hButter + hRagi + hSusuBubuk + hSusuCair + hTelur + hEsBatu) + hCoklat();
        int profit = (int) (totalModal / pesanTawar1);
        int hargaJual = profit * 50/100 + profit;
        
        System.out.println("==================================================================");
        System.out.println("                       ---ROTI TAWAR---                           ");
        System.out.println("                        ---VARIAN 1---                            ");
        System.out.println("==================================================================");
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " No", "| Bahan", "| " + "Jumlah", "| Harga");
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " 1.", "| Tepung Terigu", "| " + (int)tepung + " gram", "| Rp. " + (int)hTepung);
        System.out.format(strFormat, " 2.", "| Gula Pasir", "| " + (int)gulaPasir + " gram", "| Rp. " + (int)hGulaPasir);
        System.out.format(strFormat, " 3.", "| Butter", "| " + (int)butter + " gram", "| Rp. " + (int)hButter);
        System.out.format(strFormat, " 4.", "| Susu Bubuk", "| " + (int)susuBubuk + " gram", "| Rp. " + (int)hSusuBubuk);
        System.out.format(strFormat, " 5.", "| Susu Cair", "| " + (int)susuCair + " gram", "| Rp. " + (int)hSusuCair);
        System.out.format(strFormat, " 6.", "| Telur", "| " + (int)telur + " gram", "| Rp. " + (int)hTelur);
        System.out.format(strFormat, " 7.", "| Es Batu", "| " + (int)esBatu + " gram", "| Rp. " + (int)hEsBatu);
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " No", "| Toping", "| " + "Jumlah", "| Rp. " + "Harga");
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " 1.", "| Coklat", "| " + bCoklat() + " gram", "| Rp. " + hCoklat());
        System.out.println("------------------------------------------------------------------");
        System.out.println("                  ---PERHITUNGAN HARGA JUAL---                    ");
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " --", "| Total Modal", "", "| Rp. " + totalModal);
        System.out.format(strFormat, " --", "| Harga Jual Per pcs", "", "| Rp. " + hargaJual);
        System.out.println("------------------------------------------------------------------");
    }
    
    public void output2() {
        double totalModal = (int) (hTepung2 + hGulaPasir2 + hButter2 + hRagi2 + hSusuBubuk2 + hSusuCair2 + hTelur2 + hEsBatu2) + hKeju();
        int profit = (int) (totalModal / pesanTawar2);
        int hargaJual = profit * 50/100 + profit;
        
        System.out.println("==================================================================");
        System.out.println("                       ---ROTI TAWAR---                           ");
        System.out.println("                        ---VARIAN 2---                            ");
        System.out.println("==================================================================");
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " No", "| Bahan", "| " + "Jumlah", "| Harga");
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " 1.", "| Tepung Terigu", "| " + (int)tepung2 + " gram", "| Rp. " + (int)hTepung2);
        System.out.format(strFormat, " 2.", "| Gula Pasir", "| " + (int)gulaPasir2 + " gram", "| Rp. " + (int)hGulaPasir2);
        System.out.format(strFormat, " 3.", "| Butter", "| " + (int)butter2 + " gram", "| Rp. " + (int)hButter2);
        System.out.format(strFormat, " 4.", "| Susu Bubuk", "| " + (int)susuBubuk2 + " gram", "| Rp. " + (int)hSusuBubuk2);
        System.out.format(strFormat, " 5.", "| Susu Cair", "| " + (int)susuCair2 + " gram", "| Rp. " + (int)hSusuCair2);
        System.out.format(strFormat, " 6.", "| Telur", "| " + (int)telur2 + " gram", "| Rp. " + (int)hTelur2);
        System.out.format(strFormat, " 7.", "| Es Batu", "| " + (int)esBatu2 + " gram", "| Rp. " + (int)hEsBatu2);
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " No", "| Toping", "| " + "Jumlah", "| Rp. " + "Harga");
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " 1.", "| Keju", "| " + bKeju()+ " gram", "| Rp. " + hKeju());
        System.out.println("------------------------------------------------------------------");
        System.out.println("                  ---PERHITUNGAN HARGA JUAL---                    ");
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " --", "| Total Modal", "", "| Rp. " + totalModal);
        System.out.format(strFormat, " --", "| Harga Jual Per pcs", "", "| Rp. " + hargaJual);
        System.out.println("------------------------------------------------------------------");
    }
}
