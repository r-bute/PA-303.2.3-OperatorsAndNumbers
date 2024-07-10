package com.perscholas.java_basics;

public class PA_OperatorsAndNumbers {
    //qn1
    public void convertNumber (int x){

        int a;//converting x to binary
        System.out.println("x = " + x + " and in binary is " + Integer.toBinaryString(x));
        //left shift

        x = x<<1;
        System.out.println("x after left shift is "+x);
        System.out.println(x + " in binary after shift is " + Integer.toBinaryString(x));
        System.out.println("                ");

    }
    //qn2
    public void shiftNumberByTwo (int x) {

        int a;//converting x to binary
        System.out.println("x = " + x + " and in binary is " + Integer.toBinaryString(x));
        //left shift

        x = x >> 2;
        System.out.println("x after Right shift is " + x);
        System.out.println(x + " in binary after shift to the right by 2 is " + Integer.toBinaryString(x));
        System.out.println("                ");
    }
//qn3
    public void numberBitwise(int x,int y){
        //AND
        int z = x & y;

        // i predict
        System.out.println("Result of Bitwise AND operation on " +x+ " & "+ y + " is "+ z);

        //the decimal value
        System.out.println("int input x is : "+x +"\nDecimal value of x is "+x +"\nThe binary output is "+Integer.toBinaryString(x));
        System.out.println( "int input y is : "+y+"\nDecimal value of y is "+y+"\nThe binary output is "+Integer.toBinaryString(y));
        System.out.println("Decimal value of z is "+z +"\nThe binary output is "+Integer.toBinaryString(z));
    }
//qn4
    public void numberBitwiseOR (int x,int y) {
        //AND
        int z = x | y;

        // i predict
        System.out.println("Result of Bitwise OR operation on " + x + " OR " + y + " is " + z);

        //the decimal value
        System.out.println("int input x is : " + x + "\nDecimal value of x is " + x + "\nThe binary output is " + Integer.toBinaryString(x));
        System.out.println("int input y is : " + y + "\nDecimal value of y is " + y + "\nThe binary output is " + Integer.toBinaryString(y));
        System.out.println("Decimal value of z is " + z + "\nThe binary output is " + Integer.toBinaryString(z));
    }

//qn5
    public void intPostfix (int x) {
        System.out.println("User int input : " +x);
        int z = x++;
        System.out.println("Output after post fixing is "+ z);
    }

//qn6
    public void  incrementByOne (int x) {
        System.out.println("User int input : " +x);
        // increment using x++
        x++;
        System.out.println("Output after increment by one using x++ is " + x);
        //increment using  x+=1
        x += 1;
        System.out.println("Output after increment by one using x+=1 is " + x);
        x = x + 1;
        System.out.println("Output after increment by one using x=x+1 is " + x);
    }
//qn7
    public void  PrefixAddition (int x,int y) {
       System.out.println( "User int input is: x = " +x+ " and y = "+y);
            int sum = ++x + y;
           System.out.println("User int input is: " +x+ " and "+y+" after prefixing " +". The sum is "+ sum);
    }

    public void  postfixAddition (int x,int y) {
        System.out.println( "\nUser int input is: x = " +x+ " and y = "+y);
        int sum = x++ + y;
        System.out.println("User int input is: " +x+ " and "+y+" after postfixing " +". The sum is "+ sum);
    }

}

