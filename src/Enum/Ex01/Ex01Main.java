package Enum.Ex01;


public class Ex01Main {
    public static void main(String[] args) {

        //verilen ay no suna gore ayin kac gun oldugugnu print ediniz

        Aylar ay= Aylar.NİSAN;

       // int ay=6;

        System.out.println("ay="+ay);
        System.out.println("ay.name()="+ay.name());
        System.out.println("ay.ordinal()="+ay.ordinal());//indexi getirir

        switch(ay){

            case OCAK:
                System.out.println("ocak");
                break;
            case SUBAT:
                System.out.println("subat");
                break;
            case MART:
                System.out.println("mart");
                break;
            case NİSAN:
                System.out.println("Nisan");
                break;
            case MAYİS:
                System.out.println("Mayis");
                break;
            case HAZİRAN:
                System.out.println("Haziran");
                break;
            case TEMMUZ:
                System.out.println("temmuz");
                break;
            case AGUSTOS:
                System.out.println("agustos");
                break;
            case EYLUL:
                System.out.println("eylul");
                break;
            case EKİM:
                System.out.println("ekim");
                break;
            case KASİM:
                System.out.println("kasim");
                break;
            case ARALİK:
                System.out.println("aralik");
                break;


        }
    }
}
