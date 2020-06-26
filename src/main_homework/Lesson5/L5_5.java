//*Answer the question: What is a private access? Create a simple program to demostrate the private access.
//Tips:
// - Create two classes
// - In on of them create private members
// - In the second class create an object of the first class
// - Try to access the private members

//private access means that the member is available only inside its class

package main_homework.Lesson5;


import new_package.A;

public class L5_5 {

    public static void main(String[] args) {
        A aaa = new A(122, false, "Yappie");
        L5_3 ccc = new L5_3(65.111111, "Another Package", false);
        System.out.println(aaa.p); //private, same new_package package
        System.out.println(ccc.z);  //private, another main_homework package
    }
}


