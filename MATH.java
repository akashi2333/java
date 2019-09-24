import java.util.Random;
public class MATH {

	public static void main(String[] args) {
		System.out.println("0度的余弦值：" + Math.cos(0));       //求余弦值
		System.out.println("90度的正弦值：" + Math.sin(Math.PI/2)); //求正弦值
		System.out.println("60度的正切值：" + Math.tan(Math.PI/3)); //求正切
		System.out.println("120度的弧度值：" + Math.toRadians(120)); //变为弧度
		System.out.println("e的平方值：" + Math.exp(2));       //e的n次方
		System.out.println("以10为底2的对数值：" + Math.log(2)); //log值
		System.out.println("8的立方根：" + Math.cbrt(8));        //求立方根
		System.out.println("2的2次方：：" + Math.pow(2, 2));       //a的b次方
		System.out.println("使用round()方法取整：" + Math.round(3.4)); //取整
		System.out.println("-4的绝对值：" + Math.abs(-4));          //求绝对值
		System.out.println("2~9的随机数：：" + (2 + Math.random()*7)); //2<=x<9
		Random r = new Random();
		System.out.println("0~9的随机数：：" + r.nextInt(9));
		System.out.println("双精度的随机数：：" + r.nextDouble());

	}

}
