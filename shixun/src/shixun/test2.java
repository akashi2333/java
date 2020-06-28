package shixun;
import java.util.Scanner;             //控制台输入
//2.实现对学生成绩的分级（switch 语句使用）。
//输入成绩显示对应的等级小于 60，不及格；大于 60，成绩及格；70-80，成绩中等；80-90，成绩良好；大于 90，成绩优秀100 满分，非常优秀！
public class test2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("请输入成绩：");
		Scanner input =new Scanner(System.in);
		int score = input.nextInt();
		switch(score / 10) {
		case 10:
			System.out.println("满分，非常优秀");
			break;
		case 9 :
			System.out.println("成绩优秀");
			break;
		case 8:
			System.out.println("成绩良好");
			break;
		case 7:
			System.out.println("成绩中等");
			break;
		case 6:
			System.out.println("成绩及格");
			break;
		case 5:
			System.out.println("成绩不及格");
			break;
		case 4:
			System.out.println("成绩不及格");
			break;
		case 3:
			System.out.println("成绩不及格");
			break;
		case 2:
			System.out.println("成绩不及格");
			break;
		case 1:
			System.out.println("成绩不及格");
			break;
		default:
			System.out.println("未知等级");	
		}

	}

}
