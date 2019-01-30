package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    static ArrayList<Integer> num, even, noeven, num3or9, num5and7, xxxnum, commonDiv;
    static ArrayList<String> xxx;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CreateCollection();
        try {
            while (sc.hasNext()) {
                Integer x = sc.nextInt();
                num.add(x);
                WorkClass wk = new WorkClass(x);
                wk.isEven();
                wk.is39();
                wk.is57();
                wk.isXXXNum();
                wk.commonDiv();
            }
        }catch (InputMismatchException ime){
            OutPutClass op = new OutPutClass();
            op.PrintCollection();
        }
    }

    static void CreateCollection(){
        num = new ArrayList<Integer>();
        even = new ArrayList<Integer>();
        noeven = new ArrayList<Integer>();
        num3or9 = new ArrayList<Integer>();
        num5and7 = new ArrayList<Integer>();
        commonDiv = new ArrayList<>();
        xxxnum = new ArrayList<Integer>();
        xxx = new ArrayList<String>();

    }

}
