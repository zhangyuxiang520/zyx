package Interpreter;

public class Client {

	public static void main(String[] args) {
	    // myida�������
	    String str = "PROGRAM PRINTLN start... FOR i FROM 90 TO 100 PRINTLN i END PRINTLN end... END";
	    System.out.println("str:" + str);
	    // ����PROGRAM���ʽ
	    IExpressions expressions = new ProgramExpression(str);
	    // ����ִ��
	    expressions.interpret();
	  }
}
