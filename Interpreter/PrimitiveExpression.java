package Interpreter;

public class PrimitiveExpression implements IExpressions {

	private Context context;
	  // �ڵ�����
	  private String tokenName;
	  // �ı�����
	  private String text;
	  /**
	   * ���췽������������context����
	   *
	   * @param context
	   */
	  public PrimitiveExpression(Context context) {
	    this.parse(context);
	  }
	  @Override
	  public void parse(Context context) {
	    this.context = context;
	    this.tokenName = this.context.getCurrentToken();
	    this.context.next();
	    if ("PRINTLN".equals(this.tokenName)) {
	      this.text = this.context.getCurrentToken();
	      this.context.next();
	    }
	  }
	  /**
	   * ʵ�ֽ��ͷ���
	   */
	  @Override
	  public void interpret() {
	    // ���Ȼ�ȡ��ǰ�ڵ�����
	    if ("PRINTLN".equals(tokenName)) {
	      // ���������Ϣ
	      // ��ӡ����
	      System.out.println(this.context.getTokenContent(this.text));
	    }
	  }
}
