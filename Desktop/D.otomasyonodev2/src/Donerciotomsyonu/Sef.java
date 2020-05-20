
package Donerciotomsyonu;

public class Sef extends Thread{
    
    doner doner;
    Garson Listener;
    public Sef(doner doner, Garson listener)
            super();
    this.doner=doner;
    this.listener=listener;

}
    @Override
    public void run(){
        try {
            Thread.sleep((long)(doner.get.hazirlanmaSuresi()*1000));
            }
            catch (InterruptedException e){

            e.printStackTrace();
            }
            listener.hazirdoner(doner);
}
