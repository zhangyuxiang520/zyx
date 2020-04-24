package Decorator;

public class Decorator2 implements Sourcable {

	private Sourcable sourcable;    
    public Decorator2(Sourcable sourcable){    
        super();    
        this.sourcable=sourcable;    
    }    
    public void operation() {    
        System.out.println("��2��װ����ǰ");    
        sourcable.operation();    
        System.out.println("��2��װ������");    
    
    }    
}
