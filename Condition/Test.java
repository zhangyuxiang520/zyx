package Condition;

public class Test {

public static void main(String[] args) {
        
        State state = new State();
        Context context = new Context(state);
        
        //设置第一种状态
        state.setValue("hide");
        context.method();
        
        //设置第二种状态
        state.setValue("online");
        context.method();
    }
}
