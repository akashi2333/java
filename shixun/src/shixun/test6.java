package shixun;

interface INA{
	String S = "good";
	void f();
}

abstract class classA{
	abstract void g();
}

class classB extends classA implements INA{
	void g() {
		System.out.print(S);
	}
	public void f() {
		System.out.print(" "+S);
	}
}

public class test6 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		classA a = new classB();
		INA b = new classB();
		a.g();
		b.f();
		
	}

}
