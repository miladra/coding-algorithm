package linkedin;

import java.util.ArrayList;
import java.util.List;

public class test1 {

    public static void main(String[] arg){

       System.out.print(print(1));
       System.out.print(432);


        String[] l1 = { "1" , "2" , "3"};
        String[] l2 = { "1" , "2" , "3"};
        String[] l3 =l2;

        System.out.println(l1.equals(l2));
        System.out.println(l1.equals(l3));


        String l4 = "1";
        String l5 = "1";
        System.out.println(l4.equals(l5));


        List test = new ArrayList();

        test.add("sfa");
        test.add(3232);

        System.out.println(test.get(0) instanceof Object);
        System.out.println(test.get(1) instanceof Integer);


        //String obj = ""abcdd"";

        test1 t = new test1();
        t.run();
    }

    static Exception print(int i){
        if(i>0){
            return new Exception();
        }else{
            return new RuntimeException();
        }
    }

    public void run(){

        child c2 = new child();
        c2.run2();
    }


}
