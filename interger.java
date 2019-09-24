
public class interger {

	public static void main(String[] args) {
		String str[] = {"89","12","10","18","35"};
		int sum = 0;
		for(int i = 0;i < str.length;i++) {
			int myint = Integer.parseInt(str[i]);    //把元素转换为int型
			sum = sum + myint;
		}
		System.out.println("数组中的元素之和：" +sum);
		System.out.println("\n");
		
		String str1 = Integer.toString(456);        //十进制
		String str2 = Integer.toBinaryString(456);  //二进制
		String str3 = Integer.toHexString(456);   //十六进制
		String str4 = Integer.toOctalString(456);     //八进制
		System.out.println("456的十进制表示为：" +str1);
		System.out.println("456的二进制表示为：" +str2);
		System.out.println("456的十六进制表示为：" +str3);
		System.out.println("456的八进制表示为：" +str4);
		
		int maxint = Integer.MAX_VALUE;       //int可取的最大值
		int minint = Integer.MIN_VALUE;             //int可取的最小值
		int size = Integer.SIZE;           //int的二进制位数
		System.out.println("int可取的最大值为："+maxint);
		System.out.println("int可取的最小值为："+minint);
		System.out.println("int的二进制位数为："+size);
		
		Boolean b1 = new Boolean(true);               //创建Boolean对象
		Boolean b2 = new Boolean("ok");               
		System.out.println("b1:" +b1.booleanValue());         //使返回值类型为boolean
		System.out.println("b2:" +b2.booleanValue());
		System.out.println("b2:" +b2.parseBoolean("ok"));    //将字符串参数解析为boolean型
		
		Character mychar1 = new Character('A');
		Character mychar2 = new Character('a');
		System.out.println(mychar1 + "是大写字母吗？"+Character.isUpperCase(mychar1));
		System.out.println(mychar2 + "的大写字母是："+Character.toUpperCase(mychar2));
		

	}


}
