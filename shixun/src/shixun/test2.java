package shixun;
import java.util.Scanner;             //����̨����
//2.ʵ�ֶ�ѧ���ɼ��ķּ���switch ���ʹ�ã���
//����ɼ���ʾ��Ӧ�ĵȼ�С�� 60�������񣻴��� 60���ɼ�����70-80���ɼ��еȣ�80-90���ɼ����ã����� 90���ɼ�����100 ���֣��ǳ����㣡
public class test2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("������ɼ���");
		Scanner input =new Scanner(System.in);
		int score = input.nextInt();
		switch(score / 10) {
		case 10:
			System.out.println("���֣��ǳ�����");
			break;
		case 9 :
			System.out.println("�ɼ�����");
			break;
		case 8:
			System.out.println("�ɼ�����");
			break;
		case 7:
			System.out.println("�ɼ��е�");
			break;
		case 6:
			System.out.println("�ɼ�����");
			break;
		case 5:
			System.out.println("�ɼ�������");
			break;
		case 4:
			System.out.println("�ɼ�������");
			break;
		case 3:
			System.out.println("�ɼ�������");
			break;
		case 2:
			System.out.println("�ɼ�������");
			break;
		case 1:
			System.out.println("�ɼ�������");
			break;
		default:
			System.out.println("δ֪�ȼ�");	
		}

	}

}
