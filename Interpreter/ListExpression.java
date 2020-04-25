package Interpreter;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExpression implements IExpressions {

	 private Context context;
	  private final ArrayList<IExpressions> list = new ArrayList<IExpressions>();
	  /**
	   * ���췽������������context����
	   *
	   * @param context
	   */
	  public void parse(Context context) {
	    this.context = context;
	    // ��ListExpression�������ʽ��,ѭ����������е�ÿһ������,ֱ���ս�����ʽ�����쳣����˳�
	    while (true) {
	      if (this.context.getCurrentToken() == null) {
	        // ��ȡ��ǰ�ڵ����Ϊ null ���ʾȱ��END���ʽ
	        System.out.println("Error: The Experssion Missing 'END'! ");
	        break;
	      } else if (this.context.equalsWithCommand("END")) {
	        this.context.next();
	        // ������������
	        break;
	      } else {
	        // ����Command ���ʽ
	        IExpressions expressions = new CommandExperssion(this.context);
	        // ��ӵ��б���
	        list.add(expressions);
	      }
	    }
	  }
	  /**
	   * ʵ�ֽ��ͷ���
	   */
	  @Override
	  public void interpret() {
	    // ѭ��list�б���ÿһ�����ʽ ����ִ��
	    Iterator<IExpressions> iterator = list.iterator();
	    while (iterator.hasNext()) {
	      (iterator.next()).interpret();
	    }
	  }
}
