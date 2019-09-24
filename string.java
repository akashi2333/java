import java.util.Date;
public class string {

	public static void main(String[] args) {
		String s1 = "hello";           //字符串的连接“+”
	    String s2 = "world";
		int a = 4;
		float b = 2.5f;
		String s = s1 +" "+ s2;
		System.out.println(s);
		System.out.println("我每天花费" + a + "小时读书；"+ b + "小时上机练习");
		//“+”连接其他数据类型和字符串
		
		String str = "we are students";
		String str1 = " hello java ";
		int size1 = str.length();                  //获取字符串长度
		System.out.println(size1);
		
		int size2 = str.indexOf("a");           //查找字符串，注意（）里是“”，开始下标是0
		System.out.println(size2);
		int size3 = str.lastIndexOf("");            //无空格就相当于length()
		System.out.println(size3);
		int size4 = str.lastIndexOf(" ");          //查找字符串,从后开始查找
		System.out.println(size4);
		
		char mychar = str.charAt(8);             //打印字符串第8位
		System.out.println(mychar);
		
		String substr1 = str.substring(3);           //获取子字符串，选定位置到最后
		System.out.println(substr1);
		String substr2 = str.substring(4,9);           //获取子字符串，选定位置到选定的最后位置
		System.out.println(substr2);
		
		int size5 = str1.length();                  //获取字符串长度
		System.out.println(size5);
		int size6 = str1.trim().length();           //去掉头尾空格后的字符串数
		System.out.println(size6);
		
		String oldstr = "address";                     //字符串替换,存在要替换的字符串
		String newstr1 = oldstr.replace("a", "A");
		String newstr2 = oldstr.replace("m","M");       //字符串替换，不存在要替换的字符串，原字符串返回
		System.out.println(newstr1);
		System.out.println(newstr2);
		
		String num = "20001009";                    //判断字符串的开始与结尾，返回值为布尔型
		boolean b1 = num.startsWith("20");
		boolean b2 = num.endsWith("10");
		System.out.println(b1);
		System.out.println(b2);
		
		String m1 = "abab";                //判断字符串是否相等
		String m2 = "ABAB";
		boolean c1 = m1.contentEquals(m2);       //不忽略大小写  
		boolean c2 = m1.equalsIgnoreCase(m2);     //忽略大小写
		System.out.println(c1);
		System.out.println(c2);
		
		String n1 = "abc";        //按照字典顺序排列字符串，在前为负整数，在后为正整数，相等为0（只有equals)
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
		String y1 = x1.toUpperCase();         //把字符串变成大写
		String y2 = x2.toLowerCase();                //把字符串变成小写
		System.out.println(y1);
		System.out.println(y2);
		
		String z = "123.99.78";
		String firstarry[] = z.split("\\.");     //分割字符串，分割时用转义字符\\，结果用数组存放
		String secondarry[] = z.split("\\.",2); //分割字符串，并确定分割次数
		for (String i:firstarry) {
			System.out.print("[" + i + "]");
		}
		System.out.println();                    //换行
		for (String j:secondarry) {
			System.out.print("[" + j + "]");
		}
		
		System.out.println();
		Date date = new Date();                  //日期格式化
		String year = String.format("%tY", date);
		String month = String.format("%tB", date);
		String day = String.format("%td", date);
		System.out.println("今年是" + year + "年");
		System.out.println("现在是" + month);
		System.out.println("今天是" + day + "号");
		String hour = String.format("%tH", date);      //时间格式化
		String minute = String.format("%tM", date);
		String seconds = String.format("%tS", date);
		System.out.println("现在是" + hour + "时" + minute + "分" + seconds + "秒");
		String time = String.format("%tF", date);  //日期时间组合
		String form = String.format("%tc", date);
		System.out.println(time);
		System.out.println(form);
		
		StringBuilder builder = new StringBuilder("");   //字符串生成器
		for(int k = 0;k < 10; k++) {
			builder.append(k);                 //循环追加字符
		}
		System.out.println(builder);
		StringBuilder bu = new StringBuilder("hello");
		bu.insert(5, "world");         //插入数据
		System.out.println(bu);
		bu.delete(2, 7);                       //删除字符
		System.out.println(bu);
	
	}

}
