package ch07.home;

public class Computer extends Calculator{
	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle()����");
		return Math.PI*r*r;
	}

}
