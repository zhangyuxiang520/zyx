package Condition;

public class Test {

public static void main(String[] args) {
        
        State state = new State();
        Context context = new Context(state);
        
        //���õ�һ��״̬
        state.setValue("hide");
        context.method();
        
        //���õڶ���״̬
        state.setValue("online");
        context.method();
    }
}
