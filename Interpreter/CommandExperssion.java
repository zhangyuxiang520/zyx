package Interpreter;

public class CommandExperssion implements IExpressions {

	private final Context context;
	  private IExpressions expressions;
	  /**
	   * ���췽������������context����
	   *
	   * @param context
	   */
	  public CommandExperssion(Context context) {
	    this.context = context;
	    this.parse(this.context);
	  }
	  public void parse(Context context) {
	    // �жϵ�ǰ������� �ڴ�ֻ��For����ԭʼ�����������
	    if (this.context.equalsWithCommand("FOR")) {
	      // ����For���ʽ���н���
	      expressions = new ForExpression(this.context);
	    } else {
	      // ����ԭʼ������ʽ�������ݽ���
	      expressions = new PrimitiveExpression(this.context);
	    }
	  }
	  /**
	   * ��������
	   */
	  @Override
	  public void interpret() {
	    // ��������
	    this.expressions.interpret();
	  }
}
