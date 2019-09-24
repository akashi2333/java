import java.util.Arrays;

public class ARRAYS {

	public static void main(String[] args) {
		int a1[] = new int[] {0,1,2,3,4};     //一维数组初始化
		for(int i:a1) {                        //foreach语句输出
			System.out.print(i + ",");
		}
		
		System.out.println();
		int a2[][] = new int[][] {{1,2,3},{2,3,4},{3,4,5}};     //二维数组初始化
/*		for(int j = 0;j < a2.length;j++) {              //普通语句输出
			for(int k = 0;k < a2[j].length;k++) {
				System.out.print(a2[j][k]);
			}
			System.out.println();
		}*/
		int m = 0;                      //foreach语句输出
		for(int x[]:a2) {
			m++;
			int n = 0;
			for(int e:x) {
				n++;
				if(m == a2.length && n == x.length) {
					System.out.print(e);
				}else {
					System.out.print(e + ",");
				}
			}
		}
		
		System.out.println();
		int a3[] = new int[5];     //一维数组
		Arrays.fill(a3, 8);               //填充数组
		for(int j:a3) {                        //foreach语句输出
			System.out.print(j + ",");
		}
		
		System.out.println();
		int a4[] = new int[] {1,2,3,4,5};     //一维数组初始化
		Arrays.fill(a4,1,4,8);               //知道位置填充数组，开始包括，结束不包括
		for(int y:a4) {                        //foreach语句输出
			System.out.print(y + ",");
		}
		
		System.out.println();
		int a5[] = new int[] {10,8,19,9};     //一维数组
	    Arrays.sort(a5);                       //数组排序，从小到大
		for(int q:a5) {                        //foreach语句输出
			System.out.print(q + ",");
		}
		
		System.out.println();
		int arr[] = new int[] {12,34,45};
		int newarr1[] = Arrays.copyOf(arr, 5);         //复制到指定位置，不足补0
		for(int p:newarr1) {                        //foreach语句输出
			System.out.print(p + ",");
		}
		System.out.println();
		int newarr2[] = Arrays.copyOfRange(arr,1,3);     //复制到指定位置，不足补0,开始包括，结束不包括
		for(int o:newarr2) {                        //foreach语句输出
			System.out.print(o + ",");
		}
		
		System.out.println();
		Arrays.parallelSort(arr);                     //必须先排序
		int index = Arrays.binarySearch(arr,0,2,34); //数组查询，[0，1）为指定范围
		System.out.println(index);              //存在则返回下标，不存在则返回-1或插入后的下标

	}

}
