package Interpreter;

public class Client {

	public static void main(String[] args) {
	    // myida语言语句
	    String str = "PROGRAM PRINTLN start... FOR i FROM 90 TO 100 PRINTLN i END PRINTLN end... END";
	    System.out.println("str:" + str);
	    // 创建PROGRAM表达式
	    IExpressions expressions = new ProgramExpression(str);
	    // 解释执行
	    expressions.interpret();
	  }
}
