package Memorial;

public class Student {

	//学生姓名，编号，所属班级
	      private String sname;
	      private String sid;
	      private String className;
	      
	      //构造器
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
	         return "姓名:"+sname+" "+"编号:"+sid+" "+"班级名称:"+className;
	     }
	     //定义一个备忘的方法
	     public Memento memento() {
	         return new Memento(this);
   }
	     
    //恢复数据，恢复成备忘录记录的值
	     public void recovery(Memento m) {
	         this.sname=m.getSname();
	         this.sid=m.getSid();
	         this.className=m.getClassName();
	     }
}
