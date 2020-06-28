
public class SFPostman{
	private int x; // position in x
	private int y; // position in y

	// 将count变量设置为静态变量
	public static int count = 0;

	public SFPostman(int x, int y){
		this.x = x;
		this.y = y;
		oneMore();
	}
	
	/**
	 * Use this function to count the number of 
	 * instances for class PeaShooter
	 */
	public static void oneMore() {
		// TODO 
		count++;
	}
}
