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
        tepung = this.beratTepung / this.hitungTakaran() * this.pesanManis1;
        gulaPasir = this.beratGula / this.hitungTakaran() * this.pesanManis1;
        butter = this.beratButter / this.hitungTakaran() * this.pesanManis1;
        ragi = this.beratRagi / this.hitungTakaran() * this.pesanManis1;
        susuBubuk = this.beratSusuBubuk / this.hitungTakaran() * this.pesanManis1;
        susuCair = this.beratSusuCair / this.hitungTakaran() * this.pesanManis1;
        telur = this.beratTelur / this.hitungTakaran() * this.pesanManis1;
        esBatu = this.beratEsBatu / this.hitungTakaran() * this.pesanManis1;
        tepung2 = this.beratTepung / this.hitungTakaran() * this.pesanManis2;
        gulaPasir2 = this.beratGula / this.hitungTakaran() * this.pesanManis2;
        butter2 = this.beratButter / this.hitungTakaran() * this.pesanManis2;
        ragi2 = this.beratRagi / this.hitungTakaran() * this.pesanManis2;
        susuBubuk2 = this.beratSusuBubuk / this.hitungTakaran() * this.pesanManis2;
        susuCair2 = this.beratSusuCair / this.hitungTakaran() * this.pesanManis2;
        telur2 = this.beratTelur / this.hitungTakaran() * this.pesanManis2;
        esBatu2 = this.beratEsBatu / this.hitungTakaran() * this.pesanManis2;
        tepung3 = this.beratTepung / this.hitungTakaran() * this.pesanManis3;
        gulaPasir3 = this.beratGula / this.hitungTakaran() * this.pesanManis3;
        butter3 = this.beratButter / this.hitungTakaran() * this.pesanManis3;
        ragi3 = this.beratRagi / this.hitungTakaran() * this.pesanManis3;
        susuBubuk3 = this.beratSusuBubuk / this.hitungTakaran() * this.pesanManis3;
        susuCair3 = this.beratSusuCair / this.hitungTakaran() * this.pesanManis3;
        telur3 = this.beratTelur / this.hitungTakaran() * this.pesanManis3;
        esBatu3 = this.beratEsBatu / this.hitungTakaran() * this.pesanManis3;
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
        hTepung3 = this.tepung3 * this.hargaTepung;
        hGulaPasir3 = this.gulaPasir3 * this.hargaGulaPasir;
        hButter3 = this.butter3 * this.hargaButter;
        hRagi3 = this.ragi3 * this.hargaRagi;
        hSusuBubuk3 = this.susuBubuk3 * this.hargaSusuBubuk;
        hSusuCair3 = this.susuCair3 * this.hargaSusuCair;
        hTelur3 = this.telur3 * this.hargaTelur;
        hEsBatu3 = this.esBatu3 * this.hargaEsBatu;
    }

    
    public double bKeju1(){
        double bahanKeju1 = this.fillingKeju1 * this.pesanManis1;
        return bahanKeju1;
    }
    
    public double hKeju1 (){ 
        double hargaKeju1 = bKeju1() * KEJU;
        return hargaKeju1;
    }
    
    public double bKeju3(){
        double bahanKeju3 = this.fillingKeju3 * this.pesanManis3;
        return bahanKeju3;
    }
        
    public double hKeju3(){
        double hargaKeju3 = bKeju3() * KEJU;
        return hargaKeju3;
    }
    
    public double bCoklat(){
        double bahanCoklat = (this.fillingCoklat1 + this.toppingCoklat1) * this.pesanManis1;
        return bahanCoklat;
    }
    
    public double hCoklat(){
        double hargaCoklat = bCoklat() * COKLAT;
        return hargaCoklat;
    }
    
    public double bVanilla(){
        double bahanVanilla = this.toppingVanilla2 * this.pesanManis2;
        return bahanVanilla;
    }
    
    public double hVanilla(){
        double hargaVanilla = bVanilla() * VANILLA;
        return hargaVanilla;
    }
    
    public double bRedbean(){
        double bahanRedbean = this.fillingRedbean2 * this.pesanManis2; 
        return bahanRedbean;
    }
    
    public double hRedbean(){
        double hargaRedbean = bRedbean() * REDBEAN;
        return hargaRedbean;
    }
    
    public double bSosis(){
        double bahanSosis = this.fillingSosis3 * this.pesanManis3;
        return bahanSosis;
    }
        
    public double hSosis(){
        double hargaSosis = bSosis() * SOSIS;
        return hargaSosis;
    }
    
    private final String strFormat = "||%1$-4s%2$-24s %3$-16s %4$-16s||\n";
    

    public void output1() {
        double totalModal = (int) (hTepung + hGulaPasir + hButter + hRagi + hSusuBubuk + hSusuCair + hTelur + hEsBatu)+ hKeju1()+ hCoklat();
        int profit = (int) (totalModal / pesanManis1);
        int hargaJual = profit * 50/100 + profit;
        
        System.out.println("==================================================================");
        System.out.println("                       ---ROTI MANIS---                           ");
        System.out.println("                        ---VARIAN 1---                            ");
        System.out.println("==================================================================");
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " No", "| Bahan", "| " + "Jumlah", "| Harga");
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " 1.", "| Tepung Terigu", "| " + (int)tepung + " gram", "| Rp. " + (int)hTepung);
        System.out.format(strFormat, " 2.", "| Gula Pasir", "| " + (int)gulaPasir + " gram", "| Rp. " + (int)hGulaPasir);
        System.out.format(strFormat, " 3.", "| Butter", "| " + (int)butter + " gram", "| Rp. " + (int)hButter);
        System.out.format(strFormat, " 3.", "| Ragi", "| " + (int)ragi + " gram", "| Rp. " + (int)hRagi);
        System.out.format(strFormat, " 4.", "| Susu Bubuk", "| " + (int)susuBubuk + " gram", "| Rp. " + (int)hSusuBubuk);
        System.out.format(strFormat, " 5.", "| Susu Cair", "| " + (int)susuCair + " gram", "| Rp. " + (int)hSusuCair);
        System.out.format(strFormat, " 6.", "| Telur", "| " + (int)telur + " gram", "| Rp. " + (int)hTelur);
        System.out.format(strFormat, " 7.", "| Es Batu", "| " + (int)esBatu + " gram", "| Rp. " + (int)hEsBatu);
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " No", "| Toping", "| " + "Jumlah", "| Rp. " + "Harga");
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " 1.", "| Keju", "| " + bKeju1() + " gram", "| Rp. " + hKeju1());
        System.out.format(strFormat, " 2.", "| Coklat", "| " + bCoklat() + " gram", "| Rp. " + hCoklat());
        System.out.println("------------------------------------------------------------------");
        System.out.println("                  ---PERHITUNGAN HARGA JUAL---                    ");
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " --", "| Total Modal", "", "| Rp. " + totalModal);
        System.out.format(strFormat, " --", "| Harga Jual Per pcs", "", "| Rp. " + hargaJual);
        System.out.println("------------------------------------------------------------------");
        System.out.println("\n");
    }
    
    public void output2(){
        double totalModal = (int) (hTepung2 + hGulaPasir2 + hButter2 + hRagi2 + hSusuBubuk2 + hSusuCair2 + hTelur2 + hEsBatu2)+ hRedbean()+ hVanilla();
        int profit = (int) (totalModal / pesanManis2);
        int hargaJual = profit * 50/100 + profit;
        
        System.out.println("==================================================================");
        System.out.println("                       ---ROTI MANIS---                           ");
        System.out.println("                        ---VARIAN 2---                            ");
        System.out.println("==================================================================");
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " No", "| Bahan", "| " + "Jumlah", "| Harga");
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " 1.", "| Tepung Terigu", "| " + (int)tepung2 + " gram", "| Rp. " + (int)hTepung2);
        System.out.format(strFormat, " 2.", "| Gula Pasir", "| " + (int)gulaPasir2 + " gram", "| Rp. " + (int)hGulaPasir2);
        System.out.format(strFormat, " 3.", "| Butter", "| " + (int)butter2 + " gram", "| Rp. " + (int)hButter2);
        System.out.format(strFormat, " 3.", "| Ragi", "| " + (int)ragi2 + " gram", "| Rp. " + (int)hRagi2);
        System.out.format(strFormat, " 4.", "| Susu Bubuk", "| " + (int)susuBubuk2 + " gram", "| Rp. " + (int)hSusuBubuk2);
        System.out.format(strFormat, " 5.", "| Susu Cair", "| " + (int)susuCair2 + " gram", "| Rp. " + (int)hSusuCair2);
        System.out.format(strFormat, " 6.", "| Telur", "| " + (int)telur2 + " gram", "| Rp. " + (int)hTelur2);
        System.out.format(strFormat, " 7.", "| Es Batu", "| " + (int)esBatu2 + " gram", "| Rp. " + (int)hEsBatu2);
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " No", "| Toping", "| " + "Jumlah", "| Rp. " + "Harga");
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " 1.", "| Redbean", "| " + bRedbean() + " gram", "| Rp. " + hRedbean());
        System.out.format(strFormat, " 2.", "| Vanilla", "| " + bVanilla() + " gram", "| Rp. " + hVanilla());
        System.out.println("------------------------------------------------------------------");
        System.out.println("                  ---PERHITUNGAN HARGA JUAL---                    ");
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " --", "| Total Modal", "", "| Rp. " + totalModal);
        System.out.format(strFormat, " --", "| Harga Jual Per pcs", "", "| Rp. " + hargaJual);
        System.out.println("------------------------------------------------------------------");
        System.out.println("\n");
    }
    
    public void output3(){
        double totalModal = (int) (hTepung3 + hGulaPasir3 + hButter3 + hRagi3 + hSusuBubuk3 + hSusuCair3 + hTelur3 + hEsBatu3)+ hKeju3()+ hSosis();
        int profit = (int) (totalModal / pesanManis3);
        int hargaJual = profit * 50/100 + profit;
        
        System.out.println("==================================================================");
        System.out.println("                       ---ROTI MANIS---                           ");
        System.out.println("                        ---VARIAN 3---                            ");
        System.out.println("==================================================================");
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " No", "| Bahan", "| " + "Jumlah", "| Harga");
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " 1.", "| Tepung Terigu", "| " + (int)tepung3 + " gram", "| Rp. " + (int)hTepung3);
        System.out.format(strFormat, " 2.", "| Gula Pasir", "| " + (int)gulaPasir3 + " gram", "| Rp. " + (int)hGulaPasir3);
        System.out.format(strFormat, " 3.", "| Butter", "| " + (int)butter3 + " gram", "| Rp. " + (int)hButter3);
        System.out.format(strFormat, " 3.", "| Ragi", "| " + (int)ragi3 + " gram", "| Rp. " + (int)hRagi3);
        System.out.format(strFormat, " 4.", "| Susu Bubuk", "| " + (int)susuBubuk3 + " gram", "| Rp. " + (int)hSusuBubuk3);
        System.out.format(strFormat, " 5.", "| Susu Cair", "| " + (int)susuCair3 + " gram", "| Rp. " + (int)hSusuCair3);
        System.out.format(strFormat, " 6.", "| Telur", "| " + (int)telur3 + " gram", "| Rp. " + (int)hTelur3);
        System.out.format(strFormat, " 7.", "| Es Batu", "| " + (int)esBatu3 + " gram", "| Rp. " + (int)hEsBatu3);
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " No", "| Toping", "| " + "Jumlah", "| Rp. " + "Harga");
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " 1.", "| Keju", "| " + bKeju3() + " gram", "| Rp. " + hKeju3());
        System.out.format(strFormat, " 2.", "| Sosis", "| " + bSosis() + " gram", "| Rp. " + hSosis());
        System.out.println("------------------------------------------------------------------");
        System.out.println("                  ---PERHITUNGAN HARGA JUAL---                    ");
        System.out.println("------------------------------------------------------------------");
        System.out.format(strFormat, " --", "| Total Modal", "", "| Rp. " + totalModal);
        System.out.format(strFormat, " --", "| Harga Jual Per pcs", "", "| Rp. " + hargaJual);
        System.out.println("------------------------------------------------------------------");
    }
}