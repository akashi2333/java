package shixun;
import java.util.Scanner;             //控制台输入
//1.输入一个年份，判断该年份是否是闰年或者平年。（简单 if语句使用）。
public class test1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根	
		System.out.println("请输入年份：");
		Scanner input=new Scanner(System.in);
		int year=input.nextInt();
		if((year%4 == 0)&&(year%100 != 0)||(year%400 == 0)){
			System.out.println(year+"是闰年");
		}
		else {
			System.out.println(year+"不是闰年");
		}

		}

}
