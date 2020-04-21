package level_6;

public class SuperClassB extends SuperClassA {
	int num=200;
	public void doThis() {
    	System.out.println("do this executed from B");
	}
	public void xyz() {
		System.out.println(super.num1);
		super.doThis();
		System.out.println("XYZ executed ");
	}
}
