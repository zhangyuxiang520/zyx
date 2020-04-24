package Flyweight;

public class HeadFirstJavaScript implements Book {

	@Override
    public void read() {
        System.out.printf("这是一本<<HeadFirst JavaScript>>. (书的编号是:%s)\n", System.identityHashCode(this));
    }
}
