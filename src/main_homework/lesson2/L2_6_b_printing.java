package main_homework.lesson2;

public class L2_6_b_printing {
    public static void main(String args[]){
        task2(); }
    public static void task2(){
            for (int x=1; x<=8; x++) {
            int c=x;
            if(c==1||c==8){
                for (int y=1; y<=8; y++) {
                    System.out.print("*");
                } }
            else{
                for (int y=1; y<=8; y++) {
                    int b=y;
                    if(b==1||b==8){
                        System.out.print("*");}
                     else {System.out.print(" ");}}}
            System.out.print("\n");
        }
}}
