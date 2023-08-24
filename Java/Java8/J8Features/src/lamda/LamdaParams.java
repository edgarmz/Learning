package lamda;

import java.util.Objects;

interface zeroParams {
    void print();
}

interface oneParams{
    void print(String m);
}

interface twoParams{
    void print(Integer a, Integer b);
}
interface Compare{
    boolean isEqual(Integer a, Integer b);
}

public class LamdaParams {
    static void funcZero(zeroParams z){ z.print(); };
    static void funcOne(oneParams o, String m){ o.print(m);}
    static void funcTwo(twoParams t, Integer a, Integer b){ t.print(a,b);}
    //static void funcCompare(compare c, Integer a, Integer b){c.isEqual(a,b);}

    public static void main(String[] args) {
        funcZero(()-> System.out.println("Zero Params"));
        funcOne(m -> System.out.println(m),"OneParam");
        funcTwo((a,b)-> System.out.println(a +"+"+b+"= "+(a+b)),2,4);

        Compare funcCompare = (a,b) -> Objects.equals(a,b);

        if (funcCompare.isEqual(7,4)){
            System.out.println("Thera are equals");
        }
        else{
            System.out.println("Thera are not equals");
        }

    }

}
