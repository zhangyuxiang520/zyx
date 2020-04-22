package Duty;

public abstract class Handler {

	public Handler successor;                            
	     public abstract void handleRequest(int request);       
	     public void setSuccesor(Handler successor){           
	      this.successor = successor;
	     }
}
