package Enum.Ex02;

public class Ex02Main {
    public static void main(String[] args) {

        User kullanici=new User();
        kullanici.name="faruk bey";
       // kullanici.role=0;
      //  kullanici.status=1;


        kullanici.yetkisi=Role.ADMIN;
        kullanici.durum=Status.ACTIVE;

        if (kullanici.yetkisi==Role.ADMIN){
            System.out.println("silme yetkiniz var");
        }else System.out.println("silme yetkiniz yok");


        User kullanici2=new User();
        kullanici.name="altin kalpli";
        // kullanici.role=0;
        //  kullanici.status=1;


        kullanici2.yetkisi=Role.CUSTUMER;
        kullanici.durum=Status.LOGIN;

        if (kullanici2.yetkisi==Role.CUSTUMER){
            System.out.println("altin kalpli insan");
        }else System.out.println("selam");


    }
}
