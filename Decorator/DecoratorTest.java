package Decorator;

public class DecoratorTest {

	public static void main(String[] args) {    
        Sourcable source = new Source();    
    
        // 装饰类对象     
        Sourcable obj = new Decorator1(new Decorator2(source));    
        obj.operation();    
    }    
}
