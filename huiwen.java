import java.util.Scanner;
public class huiwen {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("������һ��1-99999֮�������:");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if(number < 1 || number > 99999) {
			System.out.println("�������������һ��1-99999֮�������");
		}
		else {
	        String str = String.valueOf(number);
	        boolean a = true;
	        int n = str.length();
	        for(int i = 0;i < n/2;i++){
	            if(str.charAt(i) != str.charAt(n-i-1)) {
	            	a = false;
	                break;
	            }
	        }
	        if(a)System.out.println("�������ǻ�������");
	        else System.out.println("�����ֲ��ǻ�������");
		}
	}

}