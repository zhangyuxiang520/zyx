package Duty;

public class ConcreteHandler1 extends Handler {

	 @Override
	    public void handleRequest(int request) {        
	          if(request >=0 && request <= 10){                //���Լ���Ȩ�޷�Χ�ڣ��Լ�����
	             System.out.println("ConcreteHandler1 handle request = " + request);
	         }
	         else if(successor != null){                        //�����Լ���Ȩ�ޣ�����и���Ȩ�޶��󣬽����䴦��
	             successor.handleRequest(request);
	         }
	 
	     }
}
