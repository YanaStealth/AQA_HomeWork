//* What is the different between static and non-static field of a class?
// Create an example to demostrate this concept.

/*If you define a field as static in a class, then there is only one such field per class. Each object which is created from this class will have the same static field in it.
* You don't need to create new object to access this constant field.
*Static methods are methods that are not related to any object. That don't need them to be used. Static method is used can use only static fields of the class.
 * Static method or field belong to the class, we can call it using class name i.e. ClassName.fieldName
* Dynamic elements are created every time the Class sample is created, can be used via the Class sample, access to them are via variable-object ,
* static elements are connected with the very first Class, can be used without creating the class sample.
*Dynamic element access:
* ObjectName.SampleMethodName(<Parameters>)
ObjectName.SampleVariableName
Static element access:
ClassName.ClassMethodName(<Parameters>)
ClassName.ClassVariableName
*
* */

package main_homework.Lesson5;

public class L5_9 {
}
