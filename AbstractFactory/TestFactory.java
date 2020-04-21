package AbstractFactory;

public class TestFactory {

	public static void main(String[] args) {
        Factory factory = (Factory) new IphoneFactory();
        Factory factory1 = (Factory) new SamsungFactory();
        Message iphone = factory.produce();
        Message samsung = factory1.produce();
        iphone.send();
        samsung.send();

    }
}
