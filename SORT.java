
public class SORT {

	public static void main(String[] args) {
		int array[] = new int[]{63,4,24,1,3,15};
		SORT sorter = new SORT();
		sorter.sort(array);

	}
	/*
	public void sort(int array[]) {                               //冒泡排序
		for(int i = 1;i < array.length;i++) {              //控制排序次数
			for(int j = 0;j < array.length-1;j++) {            //控制相邻两个比较次数
				if(array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		for(int a:array) {
			System.out.print(" " + a);
		}
	}
	public void sort(int array[]) {              //直接排序
		int index;
		for(int i = 1;i < array.length;i++) {
			index = 0;
			for(int j = 1;j <= array.length-i;j++) {
				if(array[j] > array[index]) {
					index = j;
				}
			}
			int temp = array[array.length-i];
			array[array.length-i] = array[index];
			array[index] = temp;
		}
		for(int a:array) {
			System.out.print(" " + a);
		}
	}*/
	public void sort(int array[]) {                   //反转数组
		for(int a:array) {
			System.out.print(" " + a);
		}
		System.out.println();
		for(int i = 0;i < array.length / 2;i++) {
			int temp = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] =temp;
		}
		for(int b:array) {
			System.out.print(" " + b);
		}
	}
	
}
