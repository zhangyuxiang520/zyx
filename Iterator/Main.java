package Iterator;

public class Main {

	 public static void main(String[] args) {
	        // ����һ��èȺ
	        CatGroup catGroup = new CatGroup(20);
	 
	        // ��èȺ�����è
	        catGroup.append(new Cat("betty", 10));
	        catGroup.append(new Cat("nancy", 11));
	        catGroup.append(new Cat("wood", 14));
	        catGroup.append(new Cat("zira", 18));
	 
	        // ��ȡ������èȺ�ĵ�����
	        Iterator iterator = catGroup.iterator();
	 
	        // ���������
	        while (iterator.hasNext()) {
	            Cat c = (Cat) iterator.next();
	            System.out.println(c);
	        }
	    }
}
