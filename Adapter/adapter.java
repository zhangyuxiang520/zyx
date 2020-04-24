package Adapter;

public class adapter extends Adaptee implements Target {

	public void request() {  
        super.specificRequest();  
    }  
}
