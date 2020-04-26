package Mediator;

public class Colleague2 extends Colleague {

	 public Colleague2(mediator mediator) {
	        super(mediator);
	    }

	    public void send(String message){
	        mediator.send(message, this);
	    }
	    
	    public void Notify(String message){
	        System.out.println("ͬ��2�õ���Ϣ:"+message);
	    }
}
