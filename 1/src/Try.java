
public class Try {

	static {
		System.out.println("Hi there");
	}
	public void print() {
		System.out.println("Hello");
	}
	static final double PI = 3.14;        //��̬������final�����޶�
	static int age = 23;               //��̬����
	int m = 2;                          //ʵ������
	public static void main(String[] args) {
		Try st1 = new Try();
		st1.print();
		Try st2 = new Try();
		st1.print();
		
		final int number;                    //�ֲ�����
		number = 4;
		age = 22;
		System.out.println("����PI��ֵ��"+ PI);
		System.out.println("��ֵ��number��ֵ��"+ number);
		System.out.println("int�ͱ���age��ֵ��"+ age);
		System.out.println("�͵�ֵ��"+ (number + age));
		System.out.println("���ֵ��"+ (number - age));
		System.out.println("�˵�ֵ��"+ (number * age));
		System.out.println("�̵�ֵ��"+ (number / age));
		
		int a = 10, b = 20,c = 25,d = 25;
		System.out.println("b / a = " + (b / a));
		System.out.println("b % a = " + (b % a));
		System.out.println("c % a = " + (c % a));
		System.out.println("a++ = " + (a++));
		System.out.println("a-- = " + (a--));
		System.out.println("d++ = " + (d++));
		System.out.println("++d = " + (++d));
		
		int m = 3;                            //�ֲ�����
		System.out.println(m);
		
		boolean n = 20 < 30 ? true : false;               //������������Ԫ�����
		System.out.println(n);
		
		int x = 50;                         //�ֲ���������������ת��(��ʽ+��ʽ)
		float y = x;
		byte mybyte = 127;
		int myint = 150;
		float myfloat = 452.12f;
		char mychar = 10;
		double mydouble = 45.46546;
		System.out.println(y);
		System.out.println("byte����float�����ݽ��м��㣺"+ (mybyte + myfloat));
		System.out.println("byte����int�����ݽ��м��㣺"+ (mybyte * myint));
		System.out.println("byte����char�����ݽ��м��㣺"+ (mybyte / mychar));
		System.out.println("double����char�����ݽ��м��㣺"+ (mydouble + mychar));

	}

}
