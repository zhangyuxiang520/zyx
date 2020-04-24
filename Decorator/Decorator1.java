package Decorator;

public class Decorator1 implements Sourcable {

	private Sourcable sourcable;    
    public Decorator1(Sourcable sourcable){    
        super();    
        this.sourcable=sourcable;    
    }    
        
    public void operation() {    
        System.out.println("��1��װ����ǰ");    
        sourcable.operation();    
        System.out.println("��1��װ������");    
    
    }    
}
