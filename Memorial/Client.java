package Memorial;

public class Client {

	 public static void main(String[] args) {
		          
		          Manager m=new Manager();
		          Student s=new Student("����","123","���һ��");
		          //��Ϣ��ӡ
		         System.out.println(s.toString());
		         //����
		         System.out.println("-->���б���---");
		         m.setMemento(s.memento());
		         
		         //��������
		         s.setSname("����");
		         s.setSid("456");
		         s.setClassName("�������");
		         System.out.println("-->���ݷ����ı�----");
		         System.out.println(s.toString());
		         //�ָ�����
		         System.out.println("-->�ص����ݵ�----");
		         s.recovery(m.getMemento());
		         System.out.println(s.toString());
		         
		     }
}
