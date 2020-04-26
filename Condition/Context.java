package Condition;

public class Context {

	private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void method() {
        if (state.getValue().equals("hide")) {
            state.hide();
        } else if (state.getValue().equals("online")) {
            state.online();
        }
    }
}
