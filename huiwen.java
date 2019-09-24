import java.util.Scanner;
public class huiwen {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("请输入一个1-99999之间的整数:");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if(number < 1 || number > 99999) {
			System.out.println("输入错误，请输入一个1-99999之间的整数");
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
	        if(a)System.out.println("该数字是回文数字");
	        else System.out.println("该数字不是回文数字");
		}
	}

}