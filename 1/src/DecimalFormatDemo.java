import java.text.DecimalFormat;

public class DecimalFormatDemo {
	static public void SimgleFormat(String pattern,double value) {
		DecimalFormat myFormat = new DecimalFormat(pattern);
		String output = myFormat.format(value);
		System.out.println(value + "" + pattern + "" + output);
	}
	static public void UseApplyPatternMethodFormat(String pattern,double value) {
		DecimalFormat myFormat = new DecimalFormat();
		myFormat.applyPattern(pattern);
		System.out.println(value + "" + pattern + "" + myFormat.format(value));
	}
	
	public static void main(String[] args) {
		SimgleFormat("###,###.###",123456.789);
		SimgleFormat("000000.000",123.78);
		SimgleFormat("00000000.###kg",123456.789);
		UseApplyPatternMethodFormat("#.###%",0.789);
		UseApplyPatternMethodFormat("###.##",123456.789);
		UseApplyPatternMethodFormat("0.00\u2030",0.789);
		System.out.println("\n");
		
		DecimalFormat myformat1 = new DecimalFormat();
		myformat1.setGroupingSize(2);           //��������ÿ�������ַ���
		String output1 = myformat1.format(123456.789);
		System.out.println("��������ÿ�������ַ��飺" + output1);
		myformat1.setGroupingUsed(false);         //���������
		String output2 = myformat1.format(123456.789);
		System.out.println("��������飺" + output2);
		

	}

}
