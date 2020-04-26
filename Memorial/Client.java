package Memorial;

public class Client {

	 public static void main(String[] args) {
		          
		          Manager m=new Manager();
		          Student s=new Student("张三","123","软件一班");
		          //信息打印
		         System.out.println(s.toString());
		         //备份
		         System.out.println("-->进行备份---");
		         m.setMemento(s.memento());
		         
		         //重置数据
		         s.setSname("李四");
		         s.setSid("456");
		         s.setClassName("软件二班");
		         System.out.println("-->数据发生改变----");
		         System.out.println(s.toString());
		         //恢复数据
		         System.out.println("-->回到备份点----");
		         s.recovery(m.getMemento());
		         System.out.println(s.toString());
		         
		     }
}
