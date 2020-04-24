package Flyweight;

public class KotlinInAction implements Book {

	@Override
    public void read() {
        System.out.printf("这是一本<<Kotlin实战>>. (书的编号是:%s)\n", System.identityHashCode(this));
    }
}
