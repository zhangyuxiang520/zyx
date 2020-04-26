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
	     
	     //保存学生信息
	     public Memento(Student s) {
	         super();
	         this.sname =s.getSname();
	         this.sid = s.getSid();
	         this.className = s.getClassName();
	         //新建xml文件用来保存每一次备忘的内容
	         Properties p=new Properties();
	         p.setProperty("学生姓名", sname);
	        p.setProperty("学生编号", sid);
	         p.setProperty("班级名称", className);
	         try {
	             p.storeToXML(new FileOutputStream(new File("文件3.xml")), "测试文件","GBK");
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
