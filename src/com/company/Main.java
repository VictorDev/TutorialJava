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
        System.out.println("Введите целое число. Введите 0 чтобы завершить ввод");
        try {
            while (sc.hasNext()) {
                Integer x = sc.nextInt();
                if (!(x.equals(0))) {
                    num.add(x);
                    WorkClass wk = new WorkClass(x);
                    wk.isEven();
                    wk.is39();
                    wk.is57();
                    wk.isXXXNum();
                    wk.commonDiv();
                }else {
                    OutPutClass op = new OutPutClass();
                    op.PrintCollection();
                    op.calculateMultiple();
                    op.printM();
                }
            }
        }catch (InputMismatchException ime){
            System.out.println("Некорректный ввод");
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
