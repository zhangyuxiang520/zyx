
package FactoryMethodPattern;

 

public class Test {

	public static void main(String[] args) {

						  //Ҫ����'����־Ը��'���޸�����Ϳ���

		IFactory factory = new UndergraduateFactory();

		LeiFeng student = factory.CreateLeiFeng();

		

		student.Sweep();

		student.Wash();

		student.BuyRice();

		System.out.println("\n --------------------------");

		

		IFactory factory2 = new VolunteerFactory();

		LeiFeng volunteer = factory2.CreateLeiFeng();

		

		volunteer.Sweep();

		volunteer.Wash();

		volunteer.BuyRice();

	}

}
