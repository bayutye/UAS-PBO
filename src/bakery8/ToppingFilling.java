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
public interface ToppingFilling {
    // atribut
    // harga bahan toping dan filling
    double KEJU = 31000/250;
    double COKLAT = 29000/500;
    double VANILLA = 30000/500;
    double REDBEAN = 25000/500;
    double SOSIS = 80000/1000;
    double SMOKEDBEEF = 90000/1000;
    double BAWANGBOMBAY = 40000/500;
    
    // method
    public void tfKeju();
    public void tfCoklat();
    public void tfVanilla();
    public void tfRedbean();
    public void tfSosis();
    public void tfSmokedBeef();
    public void tfBawangBombay();
}
