package Memorial;

public class Student {

	//ѧ����������ţ������༶
	      private String sname;
	      private String sid;
	      private String className;
	      
	      //������
	     public Student(String sname, String sid, String className) {
	         super();
	         this.sname = sname;
	         this.sid = sid;
	         this.className = className;
	     }
	     public String getSname() {
         return sname;
	    }
	     public void setSname(String sname) {
	         this.sname = sname;
    }
	     public String getSid() {
	         return sid;
	     }
	     public void setSid(String sid) {
	         this.sid = sid;
	     }
	     public String getClassName() {
	         return className;
	     }
     public void setClassName(String className) {
	         this.className = className;}
	     
	     @Override
	     public String toString() {
	         return "����:"+sname+" "+"���:"+sid+" "+"�༶����:"+className;
	     }
	     //����һ�������ķ���
	     public Memento memento() {
	         return new Memento(this);
   }
	     
    //�ָ����ݣ��ָ��ɱ���¼��¼��ֵ
	     public void recovery(Memento m) {
	         this.sname=m.getSname();
	         this.sid=m.getSid();
	         this.className=m.getClassName();
	     }
}
