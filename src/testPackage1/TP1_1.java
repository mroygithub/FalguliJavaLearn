package testPackage1;

import testPackage1.TP1_2;

public class TP1_1 {

    int sum , subs; /// Class level variable
    String sen;


    public static void main(String[] args) {

        // How to Create an object ...

        TP1_1 obj = new TP1_1();
        TP1_2 obj2 = new TP1_2();
        //obj.learning_Addition();
        //obj.learning_subs();
        System.out.println(obj2.addTwoNumbers(6,6));

    }

    public void learning_Addition(){

        System.out.println("Hello World");
        System.out.println(2+3);

        int sum_fun = 10+10;

        sum = 5+5;
        System.out.println(sum);
        System.out.println(sum_fun);

    }

    public void learning_subs(){

        System.out.println("Do Subs");
        System.out.println(100-5);

        int subs_fun = 10-10;

        subs = 5-5;
        System.out.println(subs);
        System.out.println(subs_fun);

    }

}
