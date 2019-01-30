package com.company;

public class WorkClass {
    private int x;
    WorkClass(int x){
        this.x = x;
    }

    void isEven(){
        if ((x%2)==0){
            Main.even.add(x);
        }
    }
    void is39(){
        if((x%3)==0||(x%9)==0){
            Main.num3or9.add(x);
        }
    }

    void is57(){
        if((x%5)==0&&(x%7)==0){
            Main.num5and7.add(x);
        }
    }



    void isXXXNum(){
        if((x/100)!=0) {
            int x1 = (x / 100) % 10;
            int x2 = (x / 10) % 10;
            int x3 = x % 10;
            if (!(x1 == x2 || x2 == x3 || x3 == x1)) {
                Main.xxx.add("В числе "+ x + " нет одинаковых чисел");
            } else {
                Main.xxx.add("В числе "+ x + " есть одинаковые числа");
            }
        }
    }

    void commonDiv(){
        for(int i = 1; i<=x; i++){
            if((x%i)==0){
                Main.commonDiv.add(i);
            }
        }
    }
}
