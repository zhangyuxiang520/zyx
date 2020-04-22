
package FactoryMethodPattern;

//����־Ը�߹���

public class VolunteerFactory implements IFactory {

	@Override

	public LeiFeng CreateLeiFeng() {

		return new Volunteer();

	}

 

}

 

//ѧ�׷�Ĵ�ѧ������

class UndergraduateFactory implements IFactory {

	@Override

	public LeiFeng CreateLeiFeng() {

		return new Undergraduate();

	}

 

}
