package Condition;

public class State {

	private String value;
    
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void hide(){
        System.out.println("我是隐藏的!");
    }
    
    public void online(){
        System.out.println("我是在线的!");
    }
}
