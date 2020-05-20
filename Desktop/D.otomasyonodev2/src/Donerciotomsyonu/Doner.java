/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Donerciotomsyonu;

/**
 *
 * @author Mehmet Ali Simsek
 */
public class Doner {
    private string isim;
    private double odeme;
    private double hazirlanmaSuresi; 
    
    public Doner(String isim,double odeme,double hazırlanmaSuresi){
        super();
        this.isim=isim;
        this.odeme=odeme;
        this.hazirlanmaSuresi;
        
    }
    public String getisim(){
        return isim;
    }
    public void setisim(String isim){
        this.isim=isim;
    }
    public double getodeme(){
        return odeme;
    }
    public void setodeme(double odeme){
        this.odeme=odeme;
    }
    public double gethazirlanmaSuresi(){
        return hazirlanmaSuresi;
    }
    public void sethazirlanmaSuresi(double hazirlanmaSüresi){
        this.hazirlanmaSuresi=hazirlanmaSuresi;
    }
    
}
