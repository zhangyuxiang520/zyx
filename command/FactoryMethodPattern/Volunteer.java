package FactoryMethodPattern;

//����־Ը��

public class Volunteer extends LeiFeng {

 

	@Override

	public void Sweep() {

		System.out.print("����־Ը�߰�æ��ɨ   ");

		

	}

 

	@Override

	public void Wash() {

		System.out.print("����־Ը�߰�æϴ�·�   ");

		

	}

 

	@Override

	public void BuyRice() {

		System.out.print("����־Ը�߰�æ����   ");

		

	}

 

}

 

//ѧ�׷�Ĵ�ѧ��

class  Undergraduate extends LeiFeng {

	

	@Override

	public void Sweep() {

		System.out.print("��ѧ����æ��ɨ   ");

		

	}

 

	@Override

	public void Wash() {

		System.out.print("��ѧ����æϴ�·�   ");

		

	}

 

	@Override

	public void BuyRice() {

		System.out.print("��ѧ����æ����   ");

		

	}

 

}


