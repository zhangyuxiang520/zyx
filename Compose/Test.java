package Compose;

public class Test {

	public static void main(String[] args) {
        //���ڵ�
        ConcreteCompany root = new ConcreteCompany("�ܹ�˾");
        root.add(new Department1("�ܹ�˾����1"));
        root.add(new Department2("�ܹ�˾����2"));

        //�ӽڵ�
        ConcreteCompany comp = new ConcreteCompany("�ֹ�˾");
        comp.add(new Department1("�ֹ�˾����1"));
        comp.add(new Department2("�ֹ�˾����2"));
        root.add(comp);

        //Ҷ�ӽڵ�1
        ConcreteCompany comp1 = new ConcreteCompany("���´�1");
        comp1.add(new Department1("���´�1����1"));
        comp1.add(new Department2("���´�1����2"));
        comp.add(comp1);

        //Ҷ�ӽڵ�2
        ConcreteCompany comp2 = new ConcreteCompany("���´�2");
        comp2.add(new Department1("���´�2����1"));
        comp2.add(new Department2("���´�2����2"));
        comp.add(comp2);

        root.display(1);

        root.duty();
    }
}
