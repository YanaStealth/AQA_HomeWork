/*5) Create an abstract class Figure. Add fields width and height to it.
Add an abstract method "calculateArea" which should be overriden by the concrete figures to calculate its area.*/

package main_homework.Lesson6.L6_5Override_Abstract_Class;

abstract public class Figure {
    int width, height;

    public Figure() {
        this.width = width;
        this.height = height;
    }

    abstract public int calculateArea();
}
