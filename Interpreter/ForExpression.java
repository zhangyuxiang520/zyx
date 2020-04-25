package Interpreter;

public class ForExpression implements IExpressions{

	private final Context context;
	  // �洢��ǰ����keyֵ
	  private String variable;
	  // �洢ѭ����ʼλ��
	  private int start_index;
	  // �洢ѭ������λ��
	  private int end_index;
	  private IExpressions expressions;
	  /**
	   * ���췽������������context����
	   *
	   * @param context
	   */
	  public ForExpression(Context context) {
	    this.context = context;
	    this.parse(this.context);
	  }
	  /**
	   * �������ʽ
	   */
	  @Override
	  public void parse(Context context) {
	    // ���Ȼ�ȡ��ǰ�ڵ�
	    this.context.next();
	    while (true) {
	      // �жϽڵ�
	      if (this.context.equalsWithCommand("FROM")) {
	        // ���ÿ�ʼ��������
	        String nextStr = this.context.next();
	        try {
	          this.start_index = Integer.parseInt(nextStr);
	        } catch (Exception e) {
	          System.out
	              .println("Error: After 'FROM' Expression Exist Error!Please Check the Format Of Expression is Correct!");
	          break;
	        }
	        // ��ȡ��һ���ڵ�
	        this.context.next();
	      } else if (this.context.equalsWithCommand("TO")) {
	        // ���ý�����������
	        String nextStr = this.context.next();
	        try {
	          this.end_index = Integer.parseInt(nextStr);
	        } catch (Exception e) {
	          System.out
	              .println("Error: After 'TO' Expression Exist Error!Please Check the Format Of Expression is Correct!");
	        }
	        this.context.next();
	        break;
	      } else {
	        // ���õ�ǰ������������
	        if (this.variable == null) {
	          this.variable = this.context.getCurrentToken();
	        }
	        // ��ȡ��һ���ڵ�
	        this.context.next();
	      }
	    }
	    // �����б���ʽ
	    this.expressions = new ListExpression();
	    this.expressions.parse(this.context);
	  }
	  /**
	   * ʵ�ֽ��ͷ���
	   */
	  @Override
	  public void interpret() {
	    // ����������ʽ
	    for (int x = this.start_index; x <= this.end_index; x++) {
	      // ���ñ�������
	      this.context.put("" + this.variable, x);
	      // ִ�н��ͷ���
	      this.expressions.interpret();
	    }
	    // �Ƴ�ʹ�õ���ʱ��������
	    this.context.clear("" + this.variable);
	  }
}
