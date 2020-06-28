
public class TransferProperty {

	int i = 47;                         //定义成员变量
	public void call() {                     //定义成员方法
		System.out.println("调用call方法");
		for(i = 0;i < 3;i++) {                   //重新赋值
			System.out.println(i+"");
			if(i == 2) {
				System.out.println("\n");
			}
		}
	}
	public TransferProperty() {           //定义构造方法
		
	}
	public static void main(String[] args) {         //主方法
		TransferProperty t1 = new TransferProperty();  //创造对象t1
		TransferProperty t2 = new TransferProperty();
		t2.i = 60;
		System.out.println("第一个实例对象调用变量i的结果："+t1.i++);
		t1.call();
		System.out.println("第二个实例对象调用变量i的结果："+t2.i);
		t2.call();
		
		String c1 = new String("abc");
		String c2 = new String("abc");
		String c3 = c1;          //地址和内容都相同
		System.out.println("c2==c3的运算结果："+(c2 == c3));          //比较地址是否相同
		System.out.println("c2.equals(c3)的运算结果："+(c2.contentEquals(c3)));//比较内容是否相同
		System.out.println("c2==c1的运算结果："+(c2 == c1));
		System.out.println("c1==c3的运算结果："+(c1 == c3));
		System.out.println("c1.equals(c3)的运算结果："+(c1.contentEquals(c3)));
		

	}
}
