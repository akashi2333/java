import java.util.Date;
public class string {

	public static void main(String[] args) {
		String s1 = "hello";           //�ַ��������ӡ�+��
	    String s2 = "world";
		int a = 4;
		float b = 2.5f;
		String s = s1 +" "+ s2;
		System.out.println(s);
		System.out.println("��ÿ�컨��" + a + "Сʱ���飻"+ b + "Сʱ�ϻ���ϰ");
		//��+�����������������ͺ��ַ���
		
		String str = "we are students";
		String str1 = " hello java ";
		int size1 = str.length();                  //��ȡ�ַ�������
		System.out.println(size1);
		
		int size2 = str.indexOf("a");           //�����ַ�����ע�⣨�����ǡ�������ʼ�±���0
		System.out.println(size2);
		int size3 = str.lastIndexOf("");            //�޿ո���൱��length()
		System.out.println(size3);
		int size4 = str.lastIndexOf(" ");          //�����ַ���,�Ӻ�ʼ����
		System.out.println(size4);
		
		char mychar = str.charAt(8);             //��ӡ�ַ�����8λ
		System.out.println(mychar);
		
		String substr1 = str.substring(3);           //��ȡ���ַ�����ѡ��λ�õ����
		System.out.println(substr1);
		String substr2 = str.substring(4,9);           //��ȡ���ַ�����ѡ��λ�õ�ѡ�������λ��
		System.out.println(substr2);
		
		int size5 = str1.length();                  //��ȡ�ַ�������
		System.out.println(size5);
		int size6 = str1.trim().length();           //ȥ��ͷβ�ո����ַ�����
		System.out.println(size6);
		
		String oldstr = "address";                     //�ַ����滻,����Ҫ�滻���ַ���
		String newstr1 = oldstr.replace("a", "A");
		String newstr2 = oldstr.replace("m","M");       //�ַ����滻��������Ҫ�滻���ַ�����ԭ�ַ�������
		System.out.println(newstr1);
		System.out.println(newstr2);
		
		String num = "20001009";                    //�ж��ַ����Ŀ�ʼ���β������ֵΪ������
		boolean b1 = num.startsWith("20");
		boolean b2 = num.endsWith("10");
		System.out.println(b1);
		System.out.println(b2);
		
		String m1 = "abab";                //�ж��ַ����Ƿ����
		String m2 = "ABAB";
		boolean c1 = m1.contentEquals(m2);       //�����Դ�Сд  
		boolean c2 = m1.equalsIgnoreCase(m2);     //���Դ�Сд
		System.out.println(c1);
		System.out.println(c2);
		
		String n1 = "abc";        //�����ֵ�˳�������ַ�������ǰΪ���������ں�Ϊ�����������Ϊ0��ֻ��equals)
		String n2 = "ac";
		String n3 = "b";
		String n4 = "B";
		String n5 = "b";
		System.out.println(n1 + " compare To " + n2 + ":" + n1.compareTo(n2));
		System.out.println(n1 + " compare To " + n3 + ":" + n1.compareTo(n3));
		System.out.println(n3 + " compare To " + n4 + ":" + n3.compareTo(n4));
		System.out.println(n2 + " compare To " + n1 + ":" + n2.compareTo(n1));
		System.out.println(n3 + " compare To " + n5 + ":" + n3.compareTo(n5));
		
		String x1 = "wgg";
		String x2 = "WGG";
		String y1 = x1.toUpperCase();         //���ַ�����ɴ�д
		String y2 = x2.toLowerCase();                //���ַ������Сд
		System.out.println(y1);
		System.out.println(y2);
		
		String z = "123.99.78";
		String firstarry[] = z.split("\\.");     //�ָ��ַ������ָ�ʱ��ת���ַ�\\�������������
		String secondarry[] = z.split("\\.",2); //�ָ��ַ�������ȷ���ָ����
		for (String i:firstarry) {
			System.out.print("[" + i + "]");
		}
		System.out.println();                    //����
		for (String j:secondarry) {
			System.out.print("[" + j + "]");
		}
		
		System.out.println();
		Date date = new Date();                  //���ڸ�ʽ��
		String year = String.format("%tY", date);
		String month = String.format("%tB", date);
		String day = String.format("%td", date);
		System.out.println("������" + year + "��");
		System.out.println("������" + month);
		System.out.println("������" + day + "��");
		String hour = String.format("%tH", date);      //ʱ���ʽ��
		String minute = String.format("%tM", date);
		String seconds = String.format("%tS", date);
		System.out.println("������" + hour + "ʱ" + minute + "��" + seconds + "��");
		String time = String.format("%tF", date);  //����ʱ�����
		String form = String.format("%tc", date);
		System.out.println(time);
		System.out.println(form);
		
		StringBuilder builder = new StringBuilder("");   //�ַ���������
		for(int k = 0;k < 10; k++) {
			builder.append(k);                 //ѭ��׷���ַ�
		}
		System.out.println(builder);
		StringBuilder bu = new StringBuilder("hello");
		bu.insert(5, "world");         //��������
		System.out.println(bu);
		bu.delete(2, 7);                       //ɾ���ַ�
		System.out.println(bu);
	
	}

}
