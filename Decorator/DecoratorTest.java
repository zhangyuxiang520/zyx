package Decorator;

public class DecoratorTest {

	public static void main(String[] args) {    
        Sourcable source = new Source();    
    
        // װ�������     
        Sourcable obj = new Decorator1(new Decorator2(source));    
        obj.operation();    
    }    
}
