package Enum.Ex03;

import java.util.ArrayList;

public class Ex03Main {

    public static void main(String[] args) {

        Kitap kitap1=new Kitap() ;
        kitap1.name="Leyal ilemecnun";
      //  kitap1.kitapKategori="roman";

        kitap1.kategori=KitapKategori.ROMAN;

        Kitap kitap2=new Kitap() ;
        kitap2.name="Köy Meydani";
      //  kitap2.kitapKategori="Roman";

        kitap2.kategori=KitapKategori.ROMAN;

        ArrayList<Kitap>kutuphane=new ArrayList<>();
        kutuphane.add(kitap1);
        kutuphane.add(kitap2);

     /*   for (Kitap k:kutuphane){
            if (k.kitapKategori.equals("roman")){
                System.out.println(k.name);
            }
        }
*/
        for (Kitap k:kutuphane){
            if (k.kategori==KitapKategori.ROMAN){
                System.out.println(k.name);
            }
        }

    }
}
