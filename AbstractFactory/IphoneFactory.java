package AbstractFactory;

public class IphoneFactory {

	 public Message produce() {
	        return (Message) new IphoneMessage();
	    }
}
