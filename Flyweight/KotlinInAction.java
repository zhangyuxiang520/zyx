package Flyweight;

public class KotlinInAction implements Book {

	@Override
    public void read() {
        System.out.printf("����һ��<<Kotlinʵս>>. (��ı����:%s)\n", System.identityHashCode(this));
    }
}
