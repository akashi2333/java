
public class setence {

	public static void main(String[] args) {
		int x = 20;                           //������䣬ע�����������
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
		
		int m = 20;                      //������䣬���֧���
		if(m > 30) {
			System.out.println("m��ֵ����30");
		}else if(m > 10) {
			System.out.println("m��ֵ����10,��С��30");
		}else if(m > 0) {
			System.out.println("m��ֵ����0,��С��10");
		}else {
			System.out.println("m��ֵС��0");
		}
		
		int week = 2;                       //switch���֧��䣬ע��break
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
		
		int a = 1,sum1 = 0;                  //whileѭ��
		while(a < 10) {
			a++;
		}
		System.out.println(a);
		
		int c = 1,sum2 = 0;            //do-whileѭ��
		do {
			c++;
		}while(c < 10);
		System.out.println(c);
		
		int d,sum = 0;               //forѭ��
		for(d = 1;d < 10;d++) {
			d = d + 2;
		}
		System.out.println(d);
		
		int arr[] = {1,2,3};              //foreach��䣬ע��ð���Լ�ע��foreach���ǹؼ���
		for(int i:arr) {
			System.out.println(i);
		}
		
		for(int j = 1;j < 20;j++) {            //continue����break���
			if(j % 2 == 0) {
				continue;
			}else if(j % 9 ==0) {
				break;
			}
			System.out.println(j);
		}

	}

}
