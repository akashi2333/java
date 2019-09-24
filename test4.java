package shixun;
//4.写一个函数，程序调用该函数，在输入一组数后，可以找出其中第二大的数，以及最小的数并进行输出（函数）。
public class test4 {
	public static void getSecondMax(int[] arrs) throws Exception {
        if (null == arrs || arrs.length <= 1) {
            throw new Exception("数组非法");
        }
        int max1 = 0, max2 = 0, min = 0; // 用来记录最大值和第二大的值
        for (int i = 0; i < arrs.length; i++) { // 遍历数组
            if (i == 0) { // 第一个数据直接赋值给最大值
                max1 = arrs[i];
                min = arrs[i];
            } else { // 从第二个数据开始进行比较
            	if (arrs[i] <min) {
            		min = arrs[i];
            	}
                if (arrs[i] == max1) { // 与最大值相等，则不需要执行下面的，循环继续
                    continue;
                }
                if (arrs[i] > max1) { // 当前数据大于最大值 
                    max2 = max1; // 将max1赋值给max2
                    max1 = arrs[i]; // 为max1重新赋值
                } else { // 当前数据小于最大值
                    max2 = Math.max(max2, arrs[i]); // 为max2重新赋值，比较获取较大的值
                }
            }
        }
        System.out.println(max2);
        System.out.println(min);
    }
	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		int arr[] = new int[] {0,1,1,2,3,4};
		test4.getSecondMax(arr);
	}

}
