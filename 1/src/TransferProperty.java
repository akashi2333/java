
public class TransferProperty {

	int i = 47;                         //�����Ա����
	public void call() {                     //�����Ա����
		System.out.println("����call����");
		for(i = 0;i < 3;i++) {                   //���¸�ֵ
			System.out.println(i+"");
			if(i == 2) {
				System.out.println("\n");
			}
		}
	}
	public TransferProperty() {           //���幹�췽��
		
	}
	public static void main(String[] args) {         //������
		TransferProperty t1 = new TransferProperty();  //�������t1
		TransferProperty t2 = new TransferProperty();
		t2.i = 60;
		System.out.println("��һ��ʵ��������ñ���i�Ľ����"+t1.i++);
		t1.call();
		System.out.println("�ڶ���ʵ��������ñ���i�Ľ����"+t2.i);
		t2.call();
		
		String c1 = new String("abc");
		String c2 = new String("abc");
		String c3 = c1;          //��ַ�����ݶ���ͬ
		System.out.println("c2==c3����������"+(c2 == c3));          //�Ƚϵ�ַ�Ƿ���ͬ
		System.out.println("c2.equals(c3)����������"+(c2.contentEquals(c3)));//�Ƚ������Ƿ���ͬ
		System.out.println("c2==c1����������"+(c2 == c1));
		System.out.println("c1==c3����������"+(c1 == c3));
		System.out.println("c1.equals(c3)����������"+(c1.contentEquals(c3)));
		

	}
}
