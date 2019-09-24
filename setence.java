
public class setence {

	public static void main(String[] args) {
		int x = 20;                           //复合语句，注意变量作用域
		{
			int y = 40;
			System.out.println(y);
			int z = 245;
			boolean b;
			{
				b = y > z;
				System.out.println(b);
			}
		}
		String word = "hello java";
		System.out.println(word);
		
		int m = 20;                      //条件语句，多分支语句
		if(m > 30) {
			System.out.println("m的值大于30");
		}else if(m > 10) {
			System.out.println("m的值大于10,但小于30");
		}else if(m > 0) {
			System.out.println("m的值大于0,但小于10");
		}else {
			System.out.println("m的值小于0");
		}
		
		int week = 2;                       //switch多分支语句，注意break
		switch(week) {
		    case 1:
		    	System.out.println("MONDAY");
		    	break;
		    case 2:
		    	System.out.println("TUESDAY");
		    	break;
		    case 3:
		    	System.out.println("WEDNESDAY");
		    	break;
		    default :
		    	System.out.println("ERRO");
		}
		
		int a = 1,sum1 = 0;                  //while循环
		while(a < 10) {
			a++;
		}
		System.out.println(a);
		
		int c = 1,sum2 = 0;            //do-while循环
		do {
			c++;
		}while(c < 10);
		System.out.println(c);
		
		int d,sum = 0;               //for循环
		for(d = 1;d < 10;d++) {
			d = d + 2;
		}
		System.out.println(d);
		
		int arr[] = {1,2,3};              //foreach语句，注意冒号以及注意foreach并非关键字
		for(int i:arr) {
			System.out.println(i);
		}
		
		for(int j = 1;j < 20;j++) {            //continue语句和break语句
			if(j % 2 == 0) {
				continue;
			}else if(j % 9 ==0) {
				break;
			}
			System.out.println(j);
		}

	}

}
