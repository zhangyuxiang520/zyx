package Flyweight;

public class PythonCookBook implements Book {

	@Override
    public void read() {
        System.out.printf("����һ��<<Python����ֲ�>>. (��ı����:%s)\n", System.identityHashCode(this));
    }
}
