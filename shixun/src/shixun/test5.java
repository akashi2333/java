//��ĳ�Ա���� ��������Ϸһ����A��һ����Ա����v��һ����ֵ100��
//����һ�����A��ĳ�Ա����v���в¡������������ʾ����С������ʾС�ˡ���������ʾ�²�ɹ���
package shixun;
import java.util.Scanner;
public class test5 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		A a = new A();
		Scanner input = new Scanner(System.in);
		while(1 == 1) {
			System.out.println("�������:");
			int i = input.nextInt();
			if(a.v < i) {
				System.out.println("���ˣ�");
			}else if(a.v > i) {
				System.out.println("С�ˣ�");
			}else {
				System.out.println("�¶��ˣ�");
				break;
			}
		}
	}

}
class A {
	public int v = 100;
}
