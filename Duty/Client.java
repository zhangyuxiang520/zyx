package Duty;

public class Client {

	 public static void main(String args[]){
		          //��������Ȩ�޵Ĵ����߶���
		        Handler h1 = new ConcreteHandler1();
		         Handler h2 = new ConcreteHandler2();
		         Handler h3 = new ConcreteHandler3();
		        
		         //����ְ���������
		         h1.setSuccesor(h2);
		         h2.setSuccesor(h3);
		         
		          //����1-30�����֣���Ϊ���󣬽���handler����
	        int requests[] = new int[30];
		         
		         //��ʼ��reqeusts����
		         for(int i = 0; i < requests.length; i++){
	            requests[i] = i;
		         }
		         
		         for(int i = 0 ; i < requests.length; i++){
		             h1.handleRequest(requests[i]);
		         }//for
		         
		     }
		
}
