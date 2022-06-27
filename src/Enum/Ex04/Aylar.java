package Enum.Ex04;

public enum Aylar {


  //  OCAK(31,"kış","Ali bey"),
    OCAK(31),
    SUBAT(28),
    MART(31),
    NİSAN(30),
    MAYİS(31),
    HAZİRAN(30),
    TEMMUZ(31),
    AGUSTOS(31),
    EYLUL(30),
    EKİM(31),
    KASİM(30),
    ARALİK(31);

    int days;

   // Aylar(int gunMiktari,String mevsim,String birtDay){

    Aylar(int gunMiktari){
        days=gunMiktari;
    }

    void getGunMiktari(){
        System.out.println("gun miktari :"+days);
    }

}
