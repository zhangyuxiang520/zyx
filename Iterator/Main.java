package Iterator;

public class Main {

	 public static void main(String[] args) {
	        // 创建一个猫群
	        CatGroup catGroup = new CatGroup(20);
	 
	        // 向猫群里添加猫
	        catGroup.append(new Cat("betty", 10));
	        catGroup.append(new Cat("nancy", 11));
	        catGroup.append(new Cat("wood", 14));
	        catGroup.append(new Cat("zira", 18));
	 
	        // 获取遍历该猫群的迭代器
	        Iterator iterator = catGroup.iterator();
	 
	        // 迭代并输出
	        while (iterator.hasNext()) {
	            Cat c = (Cat) iterator.next();
	            System.out.println(c);
	        }
	    }
}
