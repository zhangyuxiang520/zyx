
package FactoryMethodPattern;

//社区志愿者工厂

public class VolunteerFactory implements IFactory {

	@Override

	public LeiFeng CreateLeiFeng() {

		return new Volunteer();

	}

 

}

 

//学雷锋的大学生工厂

class UndergraduateFactory implements IFactory {

	@Override

	public LeiFeng CreateLeiFeng() {

		return new Undergraduate();

	}

 

}
