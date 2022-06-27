package generics;

public class G04GenericClass <T>{

 private T ebikGabik ;

    public G04GenericClass(T ebikGabik) {
        this.ebikGabik = ebikGabik;
    }


    public G04GenericClass() {
        this.ebikGabik = ebikGabik;
    }

    public T getEbikGabik() {
        return ebikGabik;
    }

    public void setEbikGabik(T ebikGabik) {
        this.ebikGabik = ebikGabik;
    }

    public static void main(String[] args) {

        G04GenericClass<Integer> intEbikGabik=new G04GenericClass<>(571);
        System.out.println(intEbikGabik.getEbikGabik());


        G04GenericClass<Double> dbEbikGabik=new G04GenericClass<>(21.2);

        System.out.println(dbEbikGabik.getEbikGabik());


    }

}
