package Flyweight;

public class HeadFirstJavaScript implements Book {

	@Override
    public void read() {
        System.out.printf("����һ��<<HeadFirst JavaScript>>. (��ı����:%s)\n", System.identityHashCode(this));
    }
}
