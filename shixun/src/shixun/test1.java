package shixun;
import java.util.Scanner;             //����̨����
//1.����һ����ݣ��жϸ�����Ƿ����������ƽ�ꡣ���� if���ʹ�ã���
public class test1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������	
		System.out.println("��������ݣ�");
		Scanner input=new Scanner(System.in);
		int year=input.nextInt();
		if((year%4 == 0)&&(year%100 != 0)||(year%400 == 0)){
			System.out.println(year+"������");
		}
		else {
			System.out.println(year+"��������");
		}

		}

}
