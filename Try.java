
public class Try {

	static final double PI = 3.14;        //静态常量，final进行限定
	static int age = 23;               //静态变量
	int m = 2;                          //实例变量
	public static void main(String[] args) {
		final int number;                    //局部常量
		number = 4;
		age = 22;
		System.out.println("常量PI的值："+ PI);
		System.out.println("赋值后number的值："+ number);
		System.out.println("int型变量age的值："+ age);
		System.out.println("和的值："+ (number + age));
		System.out.println("差的值："+ (number - age));
		System.out.println("乘的值："+ (number * age));
		System.out.println("商的值："+ (number / age));
		
		int a = 2, b = 5;
		boolean result = ((a > b) && (a != b));       // 布尔变量
		boolean result2 = ((a > b) || (a != b));
		System.out.println(result);
		System.out.println(result2);
		
		int m = 3;                              //局部变量
		System.out.println(m);
		
		boolean n = 20 < 30 ? true : false;               //布尔变量，三元运算符
		System.out.println(n);
		
		int x = 50;                         //局部变量，数据类型转换(隐式+显式)
		float y = x;
		byte mybyte = 127;
		int myint = 150;
		float myfloat = 452.12f;
		char mychar = 10;
		double mydouble = 45.46546;
		System.out.println(y);
		System.out.println("byte型与float型数据进行计算："+ (mybyte + myfloat));
		System.out.println("byte型与int型数据进行计算："+ (mybyte * myint));
		System.out.println("byte型与char型数据进行计算："+ (mybyte / mychar));
		System.out.println("double型与char型数据进行计算："+ (mydouble + mychar));

	}

}
