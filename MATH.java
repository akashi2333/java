import java.util.Random;
public class MATH {

	public static void main(String[] args) {
		System.out.println("0�ȵ�����ֵ��" + Math.cos(0));       //������ֵ
		System.out.println("90�ȵ�����ֵ��" + Math.sin(Math.PI/2)); //������ֵ
		System.out.println("60�ȵ�����ֵ��" + Math.tan(Math.PI/3)); //������
		System.out.println("120�ȵĻ���ֵ��" + Math.toRadians(120)); //��Ϊ����
		System.out.println("e��ƽ��ֵ��" + Math.exp(2));       //e��n�η�
		System.out.println("��10Ϊ��2�Ķ���ֵ��" + Math.log(2)); //logֵ
		System.out.println("8����������" + Math.cbrt(8));        //��������
		System.out.println("2��2�η�����" + Math.pow(2, 2));       //a��b�η�
		System.out.println("ʹ��round()����ȡ����" + Math.round(3.4)); //ȡ��
		System.out.println("-4�ľ���ֵ��" + Math.abs(-4));          //�����ֵ
		System.out.println("2~9�����������" + (2 + Math.random()*7)); //2<=x<9
		Random r = new Random();
		System.out.println("0~9�����������" + r.nextInt(9));
		System.out.println("˫���ȵ����������" + r.nextDouble());

	}

}
