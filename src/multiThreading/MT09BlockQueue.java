package multiThreading;

import java.util.concurrent.ArrayBlockingQueue;

public class MT09BlockQueue {
    /*
    ArrayBlockingQueue sınıfı, bir Array tarafından desteklenen sınırlı bir engelleme(Blocking) kuyruğudur.
    Sınırlı olarak, Kuyruğun boyutunun sabit olduğu anlamına gelir. Kapasite oluşturulduktan sonra değiştirilemez.
    Bir obj full Queue koyma girişimleri, işlemin engellenmesine neden olur. Benzer şekilde,
    boş bir Queue'tan eleman alma girişimleri de engellenecektir. ArrayBlockingQueue'nun sınırı,
    başlangıçta ArrayBlockingQueue constructor'daki parametre olarak kapasite atanarak elde edilebilir.
     Yeni eklenen obj her zaman Queue'nin sonuna eklenir
    ve Queue alma işlemleri, öğeleri Queue'in başında alır.Bu class ve iterator, Collection ve
    iterator implement'in tüm isteğe bağlı method'ları uygular . Bu Class, Java Collections Framework'ün bir üyesidir .
     */
    public static int urun=0;
    public static void main(String[] args) {

        ArrayBlockingQueue <Integer> urunRafı=new ArrayBlockingQueue<>(10);//kapasitesi 10 olan integer data saklayan bir urun Queue create edildi
        Uretici ureten=new Uretici(urunRafı);
        Thread uretenThread=new Thread(ureten);//urunrafı kuyrukundaki dataları bulunduran ureten obj calışan thread create edildi

        Tuketici tuketen=new Tuketici(urunRafı);
        Thread tuketenThread=new Thread(tuketen);
        uretenThread.start();
        tuketenThread.start();


    }
}
class Uretici extends Thread{
    private ArrayBlockingQueue <Integer> stok;

    public Uretici(ArrayBlockingQueue<Integer> stok) {
        this.stok = stok;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(5000);
                stok.put(++MT09BlockQueue.urun);//stok'a yeni urun miktarı update edildi.
                System.out.println(" yeni urun stok'a eklendi "+ MT09BlockQueue.urun);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Tuketici extends Thread{
    private ArrayBlockingQueue <Integer> stok;

    public Tuketici(ArrayBlockingQueue<Integer> stok) {
        this.stok = stok;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
                stok.take();//stok'a  urun satısı yapıldı.
                MT09BlockQueue.urun--;//stokdaki urun miktarı update edildi
                System.out.println(" satılan urun  stok'tan cıkarıldı "+MT09BlockQueue.urun);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}