package Flyweight;

public class PythonCookBook implements Book {

	@Override
    public void read() {
        System.out.printf("这是一本<<Python编程手册>>. (书的编号是:%s)\n", System.identityHashCode(this));
    }
}
