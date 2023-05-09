package may09_callmethods;

import java.text.*;
import java.util.*;

public class All_Calculation {



    public void falguli(int a , int b){
        System.out.println(a+b);
    }

    public void add_Three_Numbers(int a , int b , int c){
        System.out.println(a+b+c);
    }


    public void substract_Two_Numbers(int a , int b){
        System.out.println(a-b);
    }


    public void multiply_Two_Numbers(int a , int b){
        System.out.println(a*b);
    }


    public int interest_of_HomeLoan(String Bank_Name){
        int interestRate=0;
        if(Bank_Name.equals("BOA"))
        {
            interestRate = 8;
        }
        if(Bank_Name.equals("Chase"))
        {
            interestRate = 7;
        }
        if(Bank_Name.equals("US Bank"))
        {
            interestRate = 6;
        }
        if(Bank_Name.equals("Silicon Valley Bank"))
        {
            interestRate = 15;
        }
        if(Bank_Name.equals("SBI"))
        {
            interestRate = 10;
        }
        return interestRate;
    }


    public String todaysDate(){

        DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }




}
