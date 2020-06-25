//* Answer the question: What is a public access? Create a simple program to demostrate the public access.
// You can use tips from the task 3.
//


//public acces means the class member is available from anywhere. but if the classes are in different packages there is need in import of the publiс member package/member.
package main_homework.Lesson5;

import new_package.A;

public class L5_4 {

    public static void main(String[] args) {
        A aaa = new A(122, false, "Yappie");
        L5_3 ccc = new L5_3(65.111111, "Another Package", false);

        System.out.println(aaa.d);  //public, another new_package package
        System.out.println(ccc.e); //public, same main_homework package

    }
}