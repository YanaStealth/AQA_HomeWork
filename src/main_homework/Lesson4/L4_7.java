// 7. Create a simple class with some fields. Demonstrate in your class how we can use initialization blocks.

package main_homework.Lesson4;

public class L4_7 {

    {
        System.out.println("init block 1");
    } //обычный блок инициализации запускается в конструкторе между super

    static {
        System.out.println("static init block 1");
    } //статический блок запускается при первом обращении к классу в 1ю очередь

    L4_7() {
        //super(); по умолчанию стоит, можно не писать, по умолчанию в родительском к-ре
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        new L4_7();
    }

    {
        System.out.println("init block 2");
    }

    static {
        System.out.println("static init block 2");
    }
}
