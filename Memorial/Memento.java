package Memorial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Memento {

	private String sname;
	     private String sid;
	     private String className;
	     
	     //����ѧ����Ϣ
	     public Memento(Student s) {
	         super();
	         this.sname =s.getSname();
	         this.sid = s.getSid();
	         this.className = s.getClassName();
	         //�½�xml�ļ���������ÿһ�α���������
	         Properties p=new Properties();
	         p.setProperty("ѧ������", sname);
	        p.setProperty("ѧ�����", sid);
	         p.setProperty("�༶����", className);
	         try {
	             p.storeToXML(new FileOutputStream(new File("�ļ�3.xml")), "�����ļ�","GBK");
	         } catch (FileNotFoundException e) {
	             e.printStackTrace();
	         } catch (IOException e) {
	             e.printStackTrace();
	         }
	         
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
	         this.className = className;
	     }
}
