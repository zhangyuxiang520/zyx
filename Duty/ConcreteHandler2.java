package Duty;

public class ConcreteHandler2 extends Handler {

	@Override
    public void handleRequest(int request) {
	        if(request > 10 && request <= 20){                    //����Ȩ�޷�Χ�ڵ�����
	             System.out.println("ConcreteHandler2 handle request = " + request);
	       }
	         else if(successor != null){                            //���ܴ�������󣬽���Ȩ�޸��ߵĴ��������
	             successor.handleRequest(request);
	        }
	     }
}
