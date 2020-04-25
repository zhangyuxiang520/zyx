package Interpreter;

public class ProgramExpression implements IExpressions {

	 private final Context context;
	  // ��ǰ����
	  private final static String COMMAND = "PROGRAM";
	  // �洢��һ�����ʽ����
	  private IExpressions expressions;
	  /**
	   * ���췽���������������ݴ���
	   *
	   * @param text
	   */
	  public ProgramExpression(String text) {
	    this.context = new Context(text);
	    this.parse(this.context);
	  }
	  @Override
	  public void parse(Context context) {
	    // ��ȡ��һ������ڵ�
	    this.context.next();
	  }
	  /**
	   * ʵ�ֽ��ͷ���
	   */
	  @Override
	  public void interpret() {
	    // �ж��Ƿ�����PROGRAM ��ʼ
	    if (!this.context.equalsWithCommand(COMMAND)) {
	      System.out.println("The '" + COMMAND + "' is Excepted For Start!");
	    } else {
	      // ����PROGRAM ��ʼ
	      this.context.next();
	      this.expressions = new ListExpression();
	      this.expressions.parse(this.context);
	      // ListExpression���ʽ��ʼ����
	      this.expressions.interpret();
	    }
	  }
}
