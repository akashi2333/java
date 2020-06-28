//类的成员变量 猜数字游戏一个类A有一个成员变量v有一个初值100。
//定义一个类对A类的成员变量v进行猜。如果大了则提示大了小了则提示小了。等于则提示猜测成功。
package shixun;
import java.util.Scanner;
public class test5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		A a = new A();
		Scanner input = new Scanner(System.in);
		while(1 == 1) {
			System.out.println("请猜数字:");
			int i = input.nextInt();
			if(a.v < i) {
				System.out.println("大了！");
			}else if(a.v > i) {
				System.out.println("小了！");
			}else {
				System.out.println("猜对了！");
				break;
			}
		}
	}

}
class A {
	public int v = 100;
}
