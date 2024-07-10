package com.perscholas.java_basics;

import  java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PA_OperatorsAndNumbers paOperatorsAndNumbers = new PA_OperatorsAndNumbers();


        //Qn1
        paOperatorsAndNumbers.convertNumber(2);
        paOperatorsAndNumbers.convertNumber(9);
        paOperatorsAndNumbers.convertNumber(17);
        paOperatorsAndNumbers.convertNumber(88);

        //Qn2

        paOperatorsAndNumbers.shiftNumberByTwo(150);
        paOperatorsAndNumbers.shiftNumberByTwo(225);
        paOperatorsAndNumbers.shiftNumberByTwo(1555);
        paOperatorsAndNumbers.shiftNumberByTwo(32456);


        //Qn 3
        paOperatorsAndNumbers.numberBitwise(7,17);

        //Qn 4
        paOperatorsAndNumbers.numberBitwiseOR(7,17);
        //Qn 5
        paOperatorsAndNumbers.intPostfix(2);

        //Qn6
        paOperatorsAndNumbers.incrementByOne(1);



        //Qn7
        paOperatorsAndNumbers.PrefixAddition(5,8);
        paOperatorsAndNumbers.postfixAddition(5,8);


    }
}
