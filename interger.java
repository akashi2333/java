
public class interger {

	public static void main(String[] args) {
		String str[] = {"89","12","10","18","35"};
		int sum = 0;
		for(int i = 0;i < str.length;i++) {
			int myint = Integer.parseInt(str[i]);    //��Ԫ��ת��Ϊint��
			sum = sum + myint;
		}
		System.out.println("�����е�Ԫ��֮�ͣ�" +sum);
		System.out.println("\n");
		
		String str1 = Integer.toString(456);        //ʮ����
		String str2 = Integer.toBinaryString(456);  //������
		String str3 = Integer.toHexString(456);   //ʮ������
		String str4 = Integer.toOctalString(456);     //�˽���
		System.out.println("456��ʮ���Ʊ�ʾΪ��" +str1);
		System.out.println("456�Ķ����Ʊ�ʾΪ��" +str2);
		System.out.println("456��ʮ�����Ʊ�ʾΪ��" +str3);
		System.out.println("456�İ˽��Ʊ�ʾΪ��" +str4);
		
		int maxint = Integer.MAX_VALUE;       //int��ȡ�����ֵ
		int minint = Integer.MIN_VALUE;             //int��ȡ����Сֵ
		int size = Integer.SIZE;           //int�Ķ�����λ��
		System.out.println("int��ȡ�����ֵΪ��"+maxint);
		System.out.println("int��ȡ����СֵΪ��"+minint);
		System.out.println("int�Ķ�����λ��Ϊ��"+size);
		
		Boolean b1 = new Boolean(true);               //����Boolean����
		Boolean b2 = new Boolean("ok");               
		System.out.println("b1:" +b1.booleanValue());         //ʹ����ֵ����Ϊboolean
		System.out.println("b2:" +b2.booleanValue());
		System.out.println("b2:" +b2.parseBoolean("ok"));    //���ַ�����������Ϊboolean��
		
		Character mychar1 = new Character('A');
		Character mychar2 = new Character('a');
		System.out.println(mychar1 + "�Ǵ�д��ĸ��"+Character.isUpperCase(mychar1));
		System.out.println(mychar2 + "�Ĵ�д��ĸ�ǣ�"+Character.toUpperCase(mychar2));
		

	}


}
