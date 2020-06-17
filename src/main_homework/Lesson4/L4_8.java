/* 8. Find the information about the order of initialation, when you create a new object of a class:
When constructors, initialization blocks are being executed. When fields are initialized with default values.*/

package main_homework.Lesson4;


public class L4_8 {

    static {
        System.out.println("static init block 1");
    } //статический блок запускается при первом обращении к классу в 1ю очередь

    static {
        System.out.println("static init block 2");
    }

    {
        System.out.println("init block 1");
    } //обычный блок инициализации запускается в конструкторе между super

    {
        System.out.println("init block 2");
    }

    L4_8() {
        //super(); по умолчанию стоит, можно не писать, по умолчанию в родительском к-ре
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        new L4_8();
    }
}