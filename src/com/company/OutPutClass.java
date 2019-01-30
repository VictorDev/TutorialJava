package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class OutPutClass {
    HashMap<Integer,Integer> countDublicate;
    int divider;
    void PrintCollection(){
        printNum();
        MaxMin();
        printEven();
        printNoEven();
        printNum3or9();
        printNum5and7();
        printXXX();
    }

    void MaxMin(){
        Collections.sort(Main.num);
        System.out.println("Наименьшее число: "+ Main.num.get(0) + " Наибольшее число: "+ Main.num.get(Main.num.size()-1));
    }
    void printNum(){
        System.out.println("Все числа:");
        for( int t : Main.num){
            System.out.print(t+" ");
        }
        System.out.println();
    }

    void printEven(){
        System.out.println("Все чётные числа числа:");
        for( int t : Main.even){
            System.out.print(t+" ");
        }
        System.out.println();
    }

    void printNoEven(){
        System.out.println("Все нечетные числа:");
        Main.noeven = Main.num;
        Main.noeven.removeAll(Main.even);
        for( int t : Main.noeven){
            System.out.print(t+" ");
        }
        System.out.println();
    }

    void printNum3or9(){
        System.out.println("Числа которые делятся на 3 или на 9:");
        for( int t : Main.num3or9){
            System.out.print(t+" ");
        }
        System.out.println();
    }

    void printNum5and7(){
        System.out.println("Числа которые делятся на 5 и на 7:");
        for( int t : Main.num5and7){
            System.out.print(t+" ");
        }
        System.out.println();
    }

    void printXXX(){
        for(String s:Main.xxx){
            System.out.println(s);
        }
    }

    void dublicate(){
        countDublicate = new HashMap<>();
        Integer am;
        for(Integer i:Main.commonDiv){
            am = countDublicate.get(i);
            countDublicate.put(i, am==null? 1:am+1);
        }
    }

    ArrayList<Integer> list;
    void maxDublicate(){
        list = new ArrayList<>();
        Integer am;
        for(Integer i: Main.commonDiv){
            am = countDublicate.get(i);
            if(am == Main.num.size()){
                list.add(i);
            }
        }
        Collections.sort(list);
        divider = list.get(list.size()-1);
    }


    void printDiv(){
        dublicate();
        maxDublicate();
        System.out.println("Наибольший общий делитель: "+ divider);
    }


}
