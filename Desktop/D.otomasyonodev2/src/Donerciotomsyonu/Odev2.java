/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Donerciotomsyonu;


public class Odev2 implemens Garson {

    
    public static void main(String[] args) 
        {
        ODEV2 odev2= new Odev2;
        for(int i=0; i<5, i++)
        odev2.prompt()
       
        
        }

    public void prompt(){
        doner cd=new doner("cips ve domatesli",2,5);
        doner bby= new doner("BBY",5,8);
        doner vj= new doner ("vejeteryan".12,8);
        doner [] mevcutdoner= new doner[]{ cd,bby,vj};
        for(doner doner:mevcutdoner){
        System.out.println(doner.getisim());
        }
        int tercih= Integer.parseInt(JoptionPane.shovInputDiaolog(null,"Donerinizi secin:"));
        doner secim= mevcutdoner[tercih];
        Sef Sef = new Sef(secim,this);
        Sef.start();
    }
}
        
        @Override
        public void hazirdoner(doner doner){
       
        System.out.println(doner.getisim()+"doner hazır.Afiyet olsun.");
 
         
        }
    
