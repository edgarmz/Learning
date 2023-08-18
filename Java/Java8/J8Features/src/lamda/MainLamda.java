package lamda;

import java.util.ArrayList;
import java.util.List;

//Single functional interface with
// one single abstract function
interface FuncInterface{
    //This  is  an abstract funciton
    void getMessage(String message);
}

interface FuncInter1{
    int arithmetic (int a, int b);
}

interface FuncInter2{
    boolean compare (String a, String b);
}

public class MainLamda {
    public static void main(String[] args) {
        FuncInterface helloFunc = (String m)->System.out.println("Hello "+ m);
        helloFunc.getMessage("EDG");
        LamdaSingle();
        LamdaMultiple();
    }

    private static void LamdaSingle(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(4);
        list.add(7);
        list.add(10);

        list.forEach(x -> System.out.println(x+ " Double " +(x+x)));

        list.forEach(x ->{
            if (x % 2 == 0){
                System.out.println(x + " is even" );
            }
            else{
                System.out.println(x + " is odd" );
            }
        });
    }

    private static void LamdaMultiple(){
        FuncInter1 hypotenuse = (int x,int y)->(x*x)+(y*y);
        FuncInter2 validate = (String a,String b)-> a.equalsIgnoreCase(b);
        System.out.println(hypotenuse.arithmetic(2,3));

        System.out.println(validate.compare("edborK","EDGbork"));
    }
}
