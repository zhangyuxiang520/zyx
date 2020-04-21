package AbstractFactory;

public class SamsungFactory {

	 public Message produce() {
	        return (Message) new SamsungMessage();
	    }
}
